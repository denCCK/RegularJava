import java.util.regex.*;

public class RegularExpressions {

    public boolean RegularIP(String incomingString) {
        String regexIP = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return incomingString.matches(regexIP);
    }

    public boolean RegularGUID(String incomingString) {
        return true;
    }

    public boolean RegularURL(String incomingString) {
        return true;
    }

    public boolean RegularPass(String incomingString) {
        return true;
    }
}
