package com.example.cs408lab2a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivityTest {

    private String[] testArray;

    @Before
    public void setUp() {
        // Initialize the string array for testing
        testArray = new String[] {
                "you get knocked out",
                "you go somewhere else",
                "you find a dead man",
                "you find a dead woman",
                "you meet a buxom blonde",
                "someone has searched the place",
                "a crooked cop warns you",
                "you are arrested",
                "you find a gun",
                "you find a knife",
                "you find a frayed rope",
                "a bullet whizzes past your ear!",
                "you are almost run over!",
                "you are being followed",
                "you smell familiar perfume",
                "the telephone rings …",
                "there is a knock at the door",
                "you hear footsteps behind you …",
                "you hear a gunshot!",
                "you hear a scream!",
                "you sense you are not alone …",
                "… forget this story, it stinks!"
        };
    }

    @Test
    public void testAllStringsUsed() {
        Set<String> usedStrings = new HashSet<>();
        int attempts = 0;

        // Simulate the button click to get random strings
        while (usedStrings.size() < testArray.length) {
            String randomString = getRandomString(testArray);
            usedStrings.add(randomString);
            attempts++;
        }

        // Verify that all strings have been used and determine the least amount of attempts it takes to use them all
        assertEquals(testArray.length, usedStrings.size());
        System.out.println("It took " + attempts + " attempts to use all strings.");
        assertTrue(attempts >= testArray.length);
    }

    private String getRandomString(String[] stringArray) {
        int randomIndex = new Random().nextInt(stringArray.length);
        return stringArray[randomIndex];
    }
}
