public class BasicCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Baic coffe";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
