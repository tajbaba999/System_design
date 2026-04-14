package Models;

import java.util.UUID;

public class Rider extends User{
    public Rider(UUID id, String name, String gender, long phnumber, Location location) {
        super(id, name, gender, phnumber, location);
    }
}
