package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {
    @Test
    void aabbabcccbaExp28(){
        String input = "aabbabcccba";
        Integer expectedResult = 28;
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

        assertEquals(expectedResult, balancedWordsCounter.count(input));
    }

    @Test
    void emptyInput(){
        String input = "";
        Integer expectedResult = 0;
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

        assertEquals(expectedResult, balancedWordsCounter.count(input));
    }

    @Test
    void stringWithNotLetters() throws RuntimeException{
        String input = "abababa1";
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(input), "There's character/s other than letters");
    }

    @Test
    void nullParameter() throws RuntimeException{
        String input = null;
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(input), "Null object was given in input");
    }

    //Additional test with uppercase letters
    @Test
    void uppercaseAdditionalTest(){
        String input = "aAbBaBcccBa";
        Integer expectedResult = 28;
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

        assertEquals(expectedResult, balancedWordsCounter.count(input));
    }

}