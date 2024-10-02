import java.util.*;

public class root {
    public static void main(String[] args) {
        //init var
        final String[] TASK_NAMES = new String[]{"Part 1: Celsius to Fahrenheit Converter", "Part 2: Fuel Costs", "Part 3: Rectangle Information", "Part 4: Metric Converter", "Part 5: Guessing Game"};
        Scanner scan = new Scanner(System.in);
        final int MIN_BOUND = 1;
        final int MAX_BOUND = Arrays.asList(TASK_NAMES).size();
        final String MESSAGE = "Select a task. [Enter an int from "+MIN_BOUND+"-"+MAX_BOUND+"]";

        //input/output selection
        for(String i:TASK_NAMES) {
            System.out.println(i);
        }
        int selection = (int)validityCheck(MIN_BOUND, MAX_BOUND, MESSAGE);

        switch (selection) {
            case 1:
                CtoFConverter.run();
                break;
            case 2:
                fuelCosts.run();
                break;
            case 3:
                rectangleInfo.run();
                break;
            case 4:
                metricConverter.run();
                break;
            case 5:
                guessingGame.run();
        }
    }


    //validity check for all values
    public static double validityCheck(final int MIN_BOUNDS, final int MAX_BOUNDS, String MESSAGE){
        //init var
        Scanner scan = new Scanner(System.in);
        boolean intValidity = false; //is input valid? (if in range and an double, true)
        double input = 0;

        //some inputs do not ask for a maximum value and just want the input to be a positive int, so i accounted for if a maximum range is implemented
        //and while there are no instances where a minimum value is not specified, it's still nice to have
        final boolean MIN_SPECIFIED = MIN_BOUNDS != -1;
        final boolean MAX_SPECIFIED = MAX_BOUNDS != -1;

        System.out.println(MESSAGE);

        //this is the most over-engineered for-loop in all of programming
        //edit now its less over-engineered
        do {
            if (scan.hasNextDouble()) { //check if input has correct datatype
                input = scan.nextDouble();
                boolean meetsMin = input >= MIN_BOUNDS;
                boolean meetsMax = input <= MAX_BOUNDS;

                //if min value is required
                if (MIN_SPECIFIED) {
                    //if max value is required
                    if (MAX_SPECIFIED) {
                        intValidity = meetsMin && meetsMax; //exits doWhile

                    } else { // min = specified, max = not specified
                        intValidity = meetsMin; //exits doWhile
                    }

                    //if min value is not specified
                } else {
                    if (MAX_SPECIFIED) { //if max bounds are necessary but min is not
                        intValidity = meetsMax; //exits doWhile

                        //if min+max bound is specified
                    } else {
                        intValidity = meetsMin&&meetsMax; //exits doWhile
                    }
                }
                if(!intValidity){
                    System.out.println("You've entered an input that isn't in range. Try again."); //if not in range
                }
            }else{ System.out.println("You've entered an invalid datatype. Try again."); } //if datatype is wrong

            scan.nextLine(); //clears cache; if this wasnt here, inputs would be quirked up
        } while (!intValidity);
        return input;
    }
}