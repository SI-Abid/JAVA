package utils;

public class Cleaner {
    public static String linkEraser(String text) {
        String regex = "(https?://)?\\w+\\.\\w+\\S+\\s?";
        return text.replaceAll(regex, "");
    }
}
