package basic01;

// Round a Number using DecimalFormat

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal02 {

    public static void main(String[] args) {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}
