package Models;

import java.util.UUID;

public class Driver extends User{
    private boolean available  = true;
    private VechileType vechileType;
    public Driver(UUID id, String name, String gender, long phnumber, Location location, VechileType vechileType) {
        super(id, name, gender, phnumber, location);
        this.vechileType = vechileType;
        this.available = true;
    }

    public  boolean isAvailable(){
        return available;
    }

    public void setAvaliable(boolean available){
        this.available = available;
    }

    public VechileType getVechileType(){
        return vechileType;
    }

    //Tempreory currently driver accepting ride every time
    public boolean acceptRide(Ride ride){
        return  true;
    }
    @Override
    public String toString(){
        return "Driver details - Name : " +name +", Gender : " + gender + ", phonenumber : " + phnumber+".";
    }
}
