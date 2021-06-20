package string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringDate {
    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);

        // Convert String to Date using pattern formatters
        string = "July 25, 2017";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
}
