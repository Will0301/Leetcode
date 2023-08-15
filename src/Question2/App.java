package Question2;

public class App {
    public static void main(String[] args) {
        final var firstPhrase = "Hello World";
        final var secondPhrase = "   fly me   to   the moon  ";
        final var thirdPhrase = "luffy is still joyboy";

        System.out.println(Solution.lastWordLenght(firstPhrase));
        System.out.println(Solution.lastWordLenght(secondPhrase));
        System.out.println(Solution.lastWordLenght(thirdPhrase));
    }
}
