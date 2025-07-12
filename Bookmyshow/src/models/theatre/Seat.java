package models.theatre;

import enums.SeatCategory;

public class Seat {
     int seatId;
     int row;
     SeatCategory seatCategory;



     public int getSeatId(){
         return seatId;
     }

     public int getRow(){
         return row;
     }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

}
