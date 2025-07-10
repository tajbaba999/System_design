import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyInternet implements Internet {
    private Internet internet  = new RealInternet();
    private static List<String> bannedSties;

    static {
        bannedSties = new ArrayList<>();
        bannedSties.add("youtube.com");
        bannedSties.add("facebook.com");
        bannedSties.add("instagram.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSties.contains(serverHost.toLowerCase(Locale.ROOT))){
            throw new Exception("Access Denied to : "+serverHost);
        }

        internet.connectTo(serverHost);
    }
}
