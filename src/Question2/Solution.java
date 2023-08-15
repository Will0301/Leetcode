package Question2;

public class Solution {

    public static int lastWordLenght(String s){
        final var lastWordArray = s.split(" ");
        int size = lastWordArray.length;
        final var lastWord = lastWordArray[size - 1];
        return lastWord.toCharArray().length;
    }
}
