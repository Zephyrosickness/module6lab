public class metricConverter {
    public static void run(){
        //init var
        final int MIN_VALUE = 1;
        final int MAX_VALUE = -1;
        final String MESSAGE = "Enter a value in meters. [Must be positive]";
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        //input/output meters
        double input = root.validityCheck(MIN_VALUE, MAX_VALUE, MESSAGE);

        //calculations
        double miles = input*METERS_TO_MILES;
        double feet = input*METERS_TO_FEET;
        double inches = input*METERS_TO_INCHES;

        //output
        System.out.printf("Input (Meters): %.2f\nConverted to Miles: %.2f\nConverted to Feet: %.2f\nConverted to Inches: %.2f", input,miles,feet,inches);
    }
}
