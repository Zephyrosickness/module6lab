public class rectangleInfo {
    public static void run() {
        //init var
        final int MIN_VALUE = 1;
        final int MAX_VALUE = -1;

        //input/output
        double sideOne = root.validityCheck(MIN_VALUE, MAX_VALUE, "What's the first side-length?");
        double sideTwo = root.validityCheck(MIN_VALUE, MAX_VALUE, "What's the second side-length?");

        //runs calculations
        double area = sideOne * sideTwo;
        double perimeter = sideOne * 2 + sideTwo * 2;
        double diagonal = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideOne, 2)); //a^2 + b^2 = c^2 (have to do sqrt to get rid of the exp on c)

        //output
        System.out.printf("First Side: %.2f \nSecond Side: %.2f \nArea: %.2f \nPerimeter: %.2f \nDiagonal Line: %.2f", sideOne,sideTwo,area,perimeter,diagonal);
    }

}
