package Exercises;

public class BubbleSort {


    public <T extends Comparable> T[] sort(T[] input) throws RuntimeException {

        // If null, throw RuntimeException
        if(input.equals(null))
            throw new RuntimeException();

        //Bubble sort
        T temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length-1; j++){
                if(input[j - 1].compareTo(input[j]) > 0){

                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }
            }
        }

        return input;
    }
}
