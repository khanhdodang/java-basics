package day4;

public class ConvertIntegerString {
    public static void main(String args[])
    {
        int a = 1234;
        int b = -1234;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);

        int c = 1234;
        String str3 = String.valueOf(c);
        System.out.println("String str3 = " + str3);

        int d = 1234;
        Integer obj = new Integer(d);
        String str4 = obj.toString();
        System.out.println("String str4 = " + str4);

        String str5 = new Integer(d).toString();
        System.out.println("String str4 = " + str5);

    }
}
