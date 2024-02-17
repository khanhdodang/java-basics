import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String a = input();
        System.out.printf("Origin=%s ; Reverse=%s\n", a, reverseString6(a));
    }

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static String reverseString2(String str) {
        String reversedStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            reversedStr = ch + reversedStr; //adds each character in front of the existing string

//            reversedStr = str.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    static String reverseString3(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            stringBuilder.insert(0, ch); //adds each character in front of the existing string
        }
        return stringBuilder.toString();
    }

    static String reverseString4(String str) {
        byte[] strAsByteArray = str.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }

    static String reverseString5(String str) {
        String result = "";
        // convert String to character array
        // by using toCharArray
        char[] try1 = str.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            result = result + try1[i];

        return result;
    }

    // https://www.geeksforgeeks.org/reverse-a-string-in-java/
    static String reverseString6(String str) {
        char[] tempArr = str.toCharArray();
        int left, right = 0;
        right = tempArr.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tempArr[left];
            tempArr[left] = tempArr[right];
            tempArr[right] = temp;
        }


        return new String(tempArr);
    }

    static String input() {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a string: ");

        // Read and store the input number
        return in.nextLine();
    }
}
