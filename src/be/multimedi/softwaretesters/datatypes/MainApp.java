package be.multimedi.softwaretesters.datatypes;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public class MainApp {
    public static void main(String[] args) {

        // 01.01 Data types
        // Primitives - Java has eight pre-defined primitive data types
        byte tinyNumber = 127;
        short smallNumber = 32767;
        int number = 2_147_483_647;
        long bigNumber = 9_223_372_036_854_775_807L;
        float decimalNumber = 3.141592F;
        double preciseDecimalNumber = 3.14159265358979;
        char unicodeCharacter = 'a';
        boolean teaIsYummy = true;

        // Reference type - Objects in the memory. These are defined by the programmer (some come standard with Java)
        String tea = "Earl Grey";
        Cat myCat = new Cat("Alfredo", 2, "Friendly");


        // 01.02 Literals
        // Any value that can be assigned to a variable by literally typing it into the source code (not computed) is
        // a literal.
        String petName = "Lucky";
        char grade = 'B';
        int zero = 0;
        boolean teaIsBad = false;

        // Examples of non literal
        String petName2 = new String(new char[]{'L', 'u', 'c', 'k', 'y'});


        // 01.03 Finals
        // Values that should never change (compiler gives error if attempted) are prefixed with final keyword
        final double pi = 3.14;


        // 01.04 Conversion
        // You can convert data types to other data types by casting (objects, too)
        // Sometimes this can result in data loss (narrowing casting)
        final double euler = 2.718;
        int eulerAsAnInteger = (int) euler; // = 2

        display("Euler: " + euler + ", Euler as an integer: " + eulerAsAnInteger);

        // Other times it's perfectly fine (widening casting)
        int luckyNumber = 7;
        double luckyNumberAsADecimal = (double) luckyNumber;

        display("Lucky number: " + luckyNumber + " Lucky number as a decimal: " + luckyNumberAsADecimal);

        // Automatic casting happens often (ints are cast to doubles, numeric values are cast to Strings, etc.)
        // Notice how I don't cast the int to a double, nor do I cast the arithmetic result to a String
        // It's done automatically
        String sentence = "Euler's number plus my lucky number equals: " + (euler + luckyNumber);

        display(sentence);

    }

    private static void display(Object object) {
        System.out.println((Object) object);
    }
}
