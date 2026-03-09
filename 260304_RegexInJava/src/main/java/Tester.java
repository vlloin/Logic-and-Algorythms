public class Tester {
    public static void main(String[] args) {

        System.out.println("BASIC REGEX");
        RegexBasics.testMatchesVsFind("ERROR: 404 Not Found", "ERROR");

        RegexBasics.scanEmails("Contact alice@example.com or bob@test.org for help.");

        RegexBasics.caseInsensitiveSearch("Ich mag JAVA sehr gerne.", "java");

        System.out.println(" ");
        System.out.println("ADVANCED REGEX");

        AdvancedRegex.nonGreedyDiv("<div>Title</div><div>Body</div>");

        AdvancedRegex.findDuplicateWords("This is is a test test text testen.");

        AdvancedRegex.lookbehindExample("Total: 100 EUR, Discount: 20 EUR");

        AdvancedRegex.validatePasswords(new String[]{"weak", "noDigitLengthOk", "StrongPass1", "12345678"});
    }
}