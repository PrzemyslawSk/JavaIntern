package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void sortSevenIntegerNumbers(){
        Integer[] array = {1,4,5,6,8,3,8};
        Integer[] expectedResult = {1,3,4,5,6,8,8};
        var bubbleSort = new BubbleSort();

        assertArrayEquals(expectedResult, bubbleSort.sort(array));
    }

    @Test
    void sortSixDoubleNumbers(){
        Double[] array = {-9.3,0.2,4.0,0.1,5.0,9.0};
        Double[] expectedResult = {-9.3,0.1,0.2,4.0,5.0,9.0};
        var bubbleSort = new BubbleSort();

        assertArrayEquals(expectedResult, bubbleSort.sort(array));
    }

    @Test
    void sortEmpty(){
        Double[] array = {};
        Double[] expectedResult = {};
        var bubbleSort = new BubbleSort();

        assertArrayEquals(expectedResult, bubbleSort.sort(array));
    }

    @Test
    void nullParameterRuntimeEx() throws RuntimeException{
        Double[] array = null;
        var bubbleSort = new BubbleSort();
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(array), "Null object was given in input");
    }
}