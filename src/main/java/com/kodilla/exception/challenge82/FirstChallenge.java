package com.kodilla.exception.challenge82;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double result = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;

        } catch (ArithmeticException e) {
            System.err.println("Exception: divided by zero");
        } finally {
            if (b == 0) {
                System.out.println("The operation result was changed to 0");
            } else {
                System.out.println("Code was executed correctly");
            }
        }
        return result;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}