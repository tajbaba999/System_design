package Utils;

import java.util.UUID;

public class IdGenerator {
    private IdGenerator() {}
    public static UUID generateId(){
        return UUID.randomUUID();
    }
}
