package com.kodilla.exception.challenge82;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        Double result = null;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (Exception e) {
            System.err.println("Arithmetic Exception: division by zero");
        } finally {
            if (result != null) {
                System.out.println(result);
            }
        }

    }
}