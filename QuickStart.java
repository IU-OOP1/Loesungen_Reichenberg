
class QuickStart {

    
    static boolean isBestCourse = true;

    static byte smallNegativeNumber = -128;
    static byte smallPositiveNumber = 127;

    static short someOtherNumber = 256;

    static int largeNumber = 42000;

    static long largestNumber = 420000000000000000L;

    static float largeDecimalNumber = 42000.42F;

    static double largestDecimalNumber = 42000000000000.42;

    static char someLetter = 'H';
    static String someText = "OOP I Rocks!";


    public static void main(String[] args) {

        System.out.println("Hello, World.");
        System.out.println(String.format("Our smallest numbers are bytes: %d and %d", smallNegativeNumber, smallPositiveNumber));
        System.out.println(String.format("After that we have a number with larger range: %d", someOtherNumber));
        System.out.println(String.format("Most commonly used are integers: %d", largeNumber));
        System.out.println(String.format("In some cases the size of integers don't fit our use case. "
        + "Then we have to take long which needs to be defined with an L at the end of the number: %d", largestNumber));
        System.out.println(String.format("When it comes to decimal numbers we can take float if we don't need that many decimal places: %f", largeDecimalNumber));
        System.out.println(String.format("If precision is mandatory and we have large numbers we can take doubles: %f", largeDecimalNumber));
        System.out.println(String.format("We can work with single letters: %c", someLetter));
        System.out.println(String.format("Or with a collection of letters, called a String. It's not a primitive type but commonly used: %s", someText));
        System.out.println(String.format("If we want to store bool results we can do this with boolean variables. Is OOP I the best course?: %b", isBestCourse));

    }
}