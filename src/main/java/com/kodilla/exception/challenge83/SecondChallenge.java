package com.kodilla.exception.challenge83;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new ChallengeException("It's an exception");
        }
        return "Done!";
    }
}