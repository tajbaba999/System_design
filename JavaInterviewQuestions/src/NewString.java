public class NewString {
    public static void main(String[] args) {
        String str = "workingwith";
        String strs = str.concat("interns");// the new string points to new string in the heap of the string pool
        System.out.println(strs);
    }
}
