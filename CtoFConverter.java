import java.util.Scanner;

public class CtoFConverter {
    public static void run(){
        //init var
        Scanner scan = new Scanner(System.in);
        boolean doubleValidity = false; //is input valid? (if in range and an double, true)
        int MIN_BOUNDS = -1;
        int MAX_BOUNDS = -1; //no need to do range checks here
        final String MESSAGE = "Input a temperature in Celsius.";

        double celsius = root.validityCheck(MIN_BOUNDS, MAX_BOUNDS, MESSAGE);

        double fahrenheit = (celsius*1.8)+32;

        System.out.printf("Degrees F: %.2f\n"+"Degrees C: %.2f", fahrenheit, celsius);
    }
}
