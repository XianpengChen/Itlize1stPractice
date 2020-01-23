import java.util.Arrays;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
//        byte[] bytes = valueToBeReversed.getBytes();
//        int length = bytes.length;
//        byte[] reversed = new byte[length];
//        for (int i = length - 1; i >= 0; i--) {
//            reversed[i] = bytes[length - 1 - i];
//        }
//        return Arrays.toString(reversed);
        StringBuilder str = new StringBuilder(valueToBeReversed);
        return str.reverse().toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middle = word.length() / 2;
        StringBuilder str = new StringBuilder(word);
        char chac = str.charAt(middle);
        return new Character(chac);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replaceAll(charToRemove.toString(), "");
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] subs = sentence.split(" ");
        return subs[subs.length-1];
    }
}
