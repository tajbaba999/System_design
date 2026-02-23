public class StaticBlockTrap {
    static {
        System.out.println("Static block trap...");
    }
    public static void main(String[] args) {
        System.out.println("Main method...");
    }
}
