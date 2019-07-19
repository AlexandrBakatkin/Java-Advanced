import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        String password = "123abcABC$%^";
        System.out.println(checkPasswordRegex(password));
    }

    private static boolean checkPasswordRegex (String password){
        Pattern p = Pattern.compile("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!_-]).{8,20}$)");
        Matcher m = p.matcher(password);
        return m.matches();
    }
}