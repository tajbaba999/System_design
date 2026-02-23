public class MethodOverloadingvsNull {
    public void testing(Object obj){
        System.out.println("I am with object block...");
    }
    public void testing(String str){
        System.out.println("I am with String block...");
    }

    public static void main(String[] args) {
        MethodOverloadingvsNull obje = new MethodOverloadingvsNull();
        obje.testing(null);
    }
}
