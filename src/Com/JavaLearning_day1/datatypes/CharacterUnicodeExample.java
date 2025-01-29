package Com.JavaLearning_day1.datatypes;

public class CharacterUnicodeExample {

    public static void main(String[] args) {
        char ch = 458;

        System.out.println("Character:: "+ ch);

        char unicodeChar2 = '\u03A9';
        System.out.println("characters:: " + unicodeChar2);

        char unicodeChar3 = '\u2764';
        System.out.println("characters:: " + unicodeChar3);

        String smileEmoji = "\uD83D\uDE0A";  //
        String fireEmoji = "\uD83D\uDD25";  //
        String thumbsupEmoji = "\uD83D\uDC4D";  //

        System.out.println("Smiling Face Emoji: " + smileEmoji);
        System.out.println("Fire Emoji: " + fireEmoji);
        System.out.println("Thumbs up Emoji: " + thumbsupEmoji);


    }
}
