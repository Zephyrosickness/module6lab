public class fuelCosts {
    public static void run(){
        //init var
        final int MIN_BOUNDS = 0; //minimum for all values
        final int MAX_BOUNDS = -1; // maximum; validity checks require max bounds however u dont rly need max bounds here so its -1
        final double MILE_COUNT = 100; //when finding $ per X miles

        //input/output how many miles are in the tank
        String message = "How many miles are in the tank?";
        double milesInTank = root.validityCheck(MIN_BOUNDS, MAX_BOUNDS, message);

        //input/output efficiency
        message = "What's the fuel efficiency? (In MPG)";
        double fuelEfficiency = root.validityCheck(MIN_BOUNDS, MAX_BOUNDS, message);

        //input/output price per gallon
        message = "What's the price per gallon?";
        double pricePerGallon = root.validityCheck(MIN_BOUNDS, MAX_BOUNDS, message);

        double costPer100 = MILE_COUNT/fuelEfficiency;
        costPer100 *= pricePerGallon;

        double distanceLeft = (fuelEfficiency/milesInTank)*100;

        System.out.printf("Cost per %.0f Miles $: %.2f\n"+"Distance left in Miles: %.2f", MILE_COUNT, costPer100, distanceLeft);
    }
}
