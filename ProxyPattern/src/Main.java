//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Internet proxy = new ProxyInternet();
       try {
           proxy.connectTo("openai.com");
           proxy.connectTo("facebook.com");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}