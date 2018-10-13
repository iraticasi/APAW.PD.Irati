package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStrategyTest {

    int[] numbers;

    int[] expectedArray;

    @BeforeEach
    void before(){
        numbers = new int[]{4,1,2,3,4,5};
        expectedArray = new int[]{1,2,3,4,4,5};
    }

    @Test
    void testBubbleSort(){
        testSortStrategy(new BubbleSort());
    }

    @Test
    void testMergeSort() {
        testSortStrategy(new MergeSort());
    }

    @Test
    void testQuickSort() {
        testSortStrategy(new QuickSort());
    }

    void testSortStrategy(SortStrategy sortStrategy){
        sortStrategy.sort(numbers);
        assertArrayEquals(expectedArray,numbers);
    }

}