package com.kodilla.exception.challenge83;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(2.0, 1.0);
        } catch (Exception e){
            System.out.println("Exception reason: " + e.getMessage());
        }

    }
}
