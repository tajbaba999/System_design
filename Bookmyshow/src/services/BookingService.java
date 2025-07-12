package services;

import controllers.MovieController;
import controllers.TheatreController;
import enums.City;
import models.movies.Movie;
import models.theatre.Seat;
import models.theatre.Show;
import models.theatre.Theatre;
import utility.BookingDataFactory;

import java.util.*;

public class BookingService {
    private static BookingService instance;

    private final MovieController movieController;
    private final TheatreController theatreController;
    private final Scanner scanner;

    private BookingService(){
        movieController = new MovieController();
        theatreController = new TheatreController();
        scanner = new Scanner(System.in);
    }

    public static BookingService getInstance(){
        if(instance == null){
            instance = new BookingService();
        }
        return instance;
    }

    public void startBookingSession(){
        printHeader("🎬 Welcome to BookMyShow 🎟️");
        boolean continuebooking = true;


        while (continuebooking){
            City usercity = selectCity();
            Movie selectedMovie = selectMovie(usercity);
            Show selectedShow  = selectShow(usercity, selectedMovie);
            bookSeat(selectedShow);

            System.out.print("Do you want to book another ticket? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            continuebooking = response.equals("yes");
        }

        printSuccess("Thank you for using BookMyShow! 🎬 Have a great day!");
    }

    public Show selectShow(City city, Movie movie){
        Map<Theatre, List<Show>> showsMap = theatreController.getAllShows(movie, city);
        // { PVR → [Morning Show, Evening Show], INOX → [Afternoon Show] }

        List<Show> avaliableshows = new ArrayList<>();
        printSection("🎭 Available Shows for " + movie.getMoviename() + " in " + city);
        int index = 1;
        for(Map.Entry<Theatre, List<Show>> entry : showsMap.entrySet()){
            for (Show show : entry.getValue()){
                System.out.println("   " + index+" . " + show.getShowStratTime() +"  at " + entry.getKey().getTheatrename());
                avaliableshows.add(show);
                index++;
            }
        }
        return avaliableshows.get(getUserChoice(1, avaliableshows.size())-1);
    }


    private void bookSeat(Show show){
        printSection("💺 Select Your Seat (1-100)");
        int seatNumber = getUserChoice(1, 100);
        if(show.getBookedSeatsIds().contains(seatNumber)){
            System.out.println("❌ Seat already booked! Please try another seat.");
            bookSeat(show);
        }else{
            show.getBookedSeatsIds().add(seatNumber);
            PaymentService paymentService = new PaymentService();
            boolean paymentsucess = paymentService.processPayment(250);

            if(paymentsucess){
                printSuccess("✅ Booking Successful! Enjoy your movie! 🍿");
                generateTicket(show, seatNumber);
            }else {
                System.out.println("❌ Payment failed! Please try again.");
                show.getBookedSeatsIds().remove(seatNumber);
            }
        }
    }

    public Movie selectMovie(City city){
        List<Movie> movies = movieController.getMovieByCity(city);
        printSection("🎥 Available Movies in " + city);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + movies.get(i).getMoviename());
        }
        return movies.get(getUserChoice(1, movies.size()) - 1);
    }

    public City selectCity(){
        printSection("🏙️ Select Your City");
        for (City city : City.values()){
            System.out.println("   "+ (city.ordinal() + 1) +" . "+city);
        }
        return City.values()[getUserChoice(1, City.values().length) - 1];
    }

    private int getUserChoice(int min, int max) {
        int choice;
        do {
            System.out.print("👉 Enter choice (" + min + "-" + max + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }

    private void generateTicket(Show show, int seatNumber) {
        System.out.println("\n========================================");
        System.out.println("🎟️       MOVIE TICKET CONFIRMATION       🎟️");
        System.out.println("========================================");
        System.out.println("🎬 Movie: " + show.getMovie().getMoviename());
        System.out.println("⏰ Show Time: " + show.getShowStratTime() + ":00");
        System.out.println("💺 Seat Number: " + seatNumber);
        System.out.println("----------------------------------------");
        System.out.println("📅 Date: " + java.time.LocalDate.now());
        System.out.println("🆔 Booking ID: " + UUID.randomUUID());
        System.out.println("========================================");
        System.out.println("🎉 Enjoy your movie! 🍿 Have a great time!");
        System.out.println("========================================\n");
    }

    private void printHeader(String text) {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          " + text);
        System.out.println("══════════════════════════════════════════\n");
    }

    private void printSection(String text) {
        System.out.println("\n🔹 " + text);
        System.out.println("──────────────────────────────────────────");
    }

    private void printSuccess(String text) {
        System.out.println("\n🎉 " + text + "\n");
    }

    public void initialize() {
        BookingDataFactory.createMovies(movieController);
        BookingDataFactory.createTheatres(movieController, theatreController);
    }
}
