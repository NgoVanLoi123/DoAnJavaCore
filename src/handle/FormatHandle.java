package handle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatHandle {
    private static final String EMAIL_REGEX =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public  boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[.,\\-_;])[A-Za-z0-9.,\\-_;]{7,15}$";
    public  boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
}

