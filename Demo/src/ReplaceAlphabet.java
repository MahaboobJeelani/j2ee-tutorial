public class ReplaceAlphabet {
    public static void main(String[] args) {
        String inputString = "apple";
        char targetAlphabet = 'p';
        char replacement = '$';
        
        String modifiedString = replaceAlphabet(inputString, targetAlphabet, replacement);
        System.out.println(modifiedString);
    }
    
    public static String replaceAlphabet(String input, char target, char replacement) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                charArray[i] = replacement;
            } 
        }
        return new String(charArray);
    }
}