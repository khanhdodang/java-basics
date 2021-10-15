package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubStringOccurrencesString {
    public static void main(String[] args) {
        String str = "Hello world Hello world Hello world Hello";
        String findStr = "Hello";
        System.out.println(count(str, findStr));

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);

        Pattern p = Pattern.compile(findStr);
        Matcher m = p.matcher(str);
        count = 0;
        while (m.find()) {
            count += 1;
        }
        System.out.println(count);
    }

    public static int count(String text, String find) {
        int index = 0;
        int count = 0;
        int length = find.length();

        while ((index = text.indexOf(find, index)) != -1) {
            index += length;
            count++;
        }

        return count;
    }
}
