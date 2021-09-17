import java.util.SortedMap;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        char output1 = ch;
        if (ch >= 'a' && ch <= 'z'){
            return ch;
        } else {
            return Character.toLowerCase(output1);
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        char output2 = ch;
        if (ch >= 'A' && ch <= 'Z'){
            return ch;
        } else {
            return Character.toUpperCase(output2);
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String output3 = "";
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                output3 = output3 + "";
            } else {
                output3 = output3 + str.charAt(i);
            }
        }



        return output3;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println("toLower / toUpper Check: ");
        System.out.println(toLower('A'));
        System.out.println(toLower('a'));
        System.out.println(toLower('B'));
        System.out.println(toLower('b'));
        System.out.println();
        System.out.println(toUpper('C'));
        System.out.println(toUpper('c'));
        System.out.println(toUpper('D'));
        System.out.println(toUpper('d'));
        System.out.println();
        System.out.println("removeNumbers Check: ");
        System.out.println(removeNumbers("513513N1412124i112c124o325la34255s"));
        System.out.println(removeNumbers("421523i4189s12"));
        System.out.println(removeNumbers("12412c41242412657687857842o235235325o151l!4231423"));
    }
}
