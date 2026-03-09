import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

    public static void testMatchesVsFind(String logEntry, String patternText) {
        Pattern p = Pattern.compile(patternText);
        Matcher m = p.matcher(logEntry);

        System.out.println("matches(): " + m.matches());
        m.reset();
        System.out.println("find(): " + m.find());

        String fixedRegex = patternText + ".*";
        System.out.println("Fixed matches(): " + Pattern.matches(fixedRegex, logEntry));
    }

    public static void scanEmails(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Email: " + m.group());
        }
    }

    public static void caseInsensitiveSearch(String content, String searchWord) {
        Pattern p = Pattern.compile(searchWord, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(content);

        if (m.find()) {
            System.out.println("Found: " + m.group());
        } else {
            System.out.println("Not found");
        }
    }
}