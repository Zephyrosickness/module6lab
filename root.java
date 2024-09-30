import java.util.*;

public class root {
    public static void main(String[] args) {
        //init var
        final String[] TASK_NAMES = new String[]{"Part 1: Celsius to Fahrenheit Converter", "Part 2: Fuel Costs", "Part 3: Rectangle Information", "Part 4: Theater Kiosk", "Part 5: Number Comparison"};
        Scanner scan = new Scanner(System.in); //ngl i can proly just make this static and have every other subroutine call this scanner instead of all having their own but i heard static vars are bad or somthing
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
            /*case 3:
                partyAffiliation.run();
                break;
            case 4:
                theaterKiosk.run();
                break;
            case 5:
                numCompare.run();*/
        }
    }


    //validity check for all values
    public static double validityCheck(final int MIN_BOUNDS, final int MAX_BOUNDS, String MESSAGE){
        //init var
        Scanner scan = new Scanner(System.in);
        boolean intValidity = false; //is input valid? (if in range and an double, true)
        double input = 0;

        System.out.println(MESSAGE);

        do {
            if(scan.hasNextDouble()){ //check if input has correct datatype
                input = scan.nextDouble();

                //if min value isnt needed
                if(MIN_BOUNDS == -1){
                    //if max value isnt needed
                    if(MAX_BOUNDS == -1){
                        intValidity = true;

                    }else{ // min = false, max = true
                        if(input<= MAX_BOUNDS) { //check if input falls within range
                            intValidity = true; //exits doWhile
                        }else{ System.out.println("Your input doesn't fall within the range. Try Again. [Maximum: "+MAX_BOUNDS+"]"); } //if input is correct type but isn't in range
                    }

                //if min value is specified
                }else {
                    if (MAX_BOUNDS == -1) { //if max bounds arent necessary
                        if (input >= MIN_BOUNDS) { //check if input falls within range
                            intValidity = true; //exits doWhile
                        }else{ System.out.println("Your input doesn't fall within the range. Try Again. [Minimum: "+MIN_BOUNDS+"]"); } //if input is correct type but isn't in range


                    //if min+max bound is specified
                    }else{
                        if(input >= MIN_BOUNDS && input <= MAX_BOUNDS) { //check if input falls within range
                            intValidity = true; //exits doWhile
                        }else{ System.out.println("Your input doesn't fall within the range. Try Again. [Minimum: "+MIN_BOUNDS+ "Maximum: "+MAX_BOUNDS+"]"); } //if input is correct type but isn't in range
                    }
                }
            }else{ System.out.println("You've entered an invalid datatype. Try again."); } //if datatype is wrong
            scan.nextLine(); //clears cache; if this wasnt here, inputs would be quirked up
        } while (!intValidity);
        return input;
    }
}