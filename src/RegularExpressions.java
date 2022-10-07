import java.util.regex.*;

public class RegularExpressions {

    public boolean RegularIP(String incomingString) {
        String regexIP = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return incomingString.matches(regexIP);
    }

    public boolean RegularGUID(String incomingString) {
        String regexGUID = "^[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}$";
        return incomingString.matches(regexGUID);
    }

    public boolean RegularURL(String incomingString) {
        String regexURL = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]{2,256}([\\.]{1}[a-z0-9]{2,256})*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";
        return incomingString.matches(regexURL);
    }

    public boolean RegularPass(String incomingString) {
        return true;
    }
}
