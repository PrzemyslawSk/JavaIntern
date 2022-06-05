package Exercises;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class BalancedWordsCounter {
    public Integer count(String input) throws RuntimeException{

        // If value is null throw RuntimeException
        if(input == null)
            throw new RuntimeException();
        // If value is empty string return 0
        else if(input.isEmpty())
            return 0;

        // Check if value contains other characters than letters
        boolean isLetterOnly = input.matches("[a-zA-Z]+");
        if(!isLetterOnly)
            throw new RuntimeException();

        // Convert all characters to lowercase for easier counting
        input = input.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Integer numberOfBalanced = 0;

        // Slice string into every possible substring
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                List<Integer> counter = new ArrayList<>();
                String substring = input.substring(i, j);

                // Counting how many times each letter occurred
                for (char letter : alphabet) {
                    Integer numTimesOccured = StringUtils.countMatches(substring, letter);
                    // Adding only letters that occured more than 0 times
                    if (numTimesOccured > 0)
                        counter.add(numTimesOccured);
                }
                // Check if substring is ballanced (letters occured the same number of times)
                Boolean result = counter.stream().allMatch(counter.get(0)::equals);
                // If this substring is ballanced, rise number of ballanced substrings
                if (result == true)
                    numberOfBalanced++;
            }
        }
        return numberOfBalanced;
    }

}
