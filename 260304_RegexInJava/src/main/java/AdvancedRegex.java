import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedRegex {

    public static void nonGreedyDiv(String html) {
        String regex = "<div>.*?</div>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(html);

        if (m.find()) {
            System.out.println("Div: " + m.group());
        } else {
            System.out.println("No match");
        }
    }

    public static void findDuplicateWords(String text) {
        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Duplicate: " + m.group());
        }
    }

    public static void lookbehindExample(String input) {
        String regex = "(?<=Total: )\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        if (m.find()) {
            System.out.println("Total: " + m.group());
        } else {
            System.out.println("No total found");
        }
    }

    public static void validatePasswords(String[] passwords) {
        String regex = "^(?=.*\\d).{8,}$";
        Pattern p = Pattern.compile(regex);

        for (String pw : passwords) {
            Matcher m = p.matcher(pw);
            System.out.println(pw + " -> " + m.matches());
        }
    }
}