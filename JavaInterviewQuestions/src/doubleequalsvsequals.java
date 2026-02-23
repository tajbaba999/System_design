public class doubleequalsvsequals {
    // == vs equals
    public static void main(String[] args) {
        String s1 = new String("Taj");
        String s2 = new String("Taj");

        System.out.println("s1 == s2 : " +(s1 == s2));

        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        String s3 = "Taj";

        System.out.println("s1 == s3 : " +(s1 == s3));

        System.out.println("s1.equals(s3) : " + s1.equals(s3));

    }
}
