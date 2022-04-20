package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() throws Exception {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0,1.0));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,1.0));
    }
}