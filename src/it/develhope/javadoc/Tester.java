package it.develhope.javadoc;

/**
 * This class is a Tester class
 * @author alessiolimina
 */

public class Tester {
    public static void main(String[] args) {

        System.out.println("-------------------Starting-------------------");

        /**
         * Creating a new object
         */

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();

        /**
         * Applying the Sum method to the object
         * Printing the result
         */

        System.out.println(arithmeticOperators.sum(78,6));

        /**
         * Applying the Sub method to the object
         * Printing the result
         */

        System.out.println(arithmeticOperators.sub(72,62));

        /**
         * Applying the Mul method to the object
         * Printing the result
         */

        System.out.println(arithmeticOperators.mul(45,9));

        /**
         * Applying the Div method to the object
         * Printing the result
         */

        System.out.println(arithmeticOperators.div(63,9));


        System.out.println("--------------------------------------------");


    }
}

