import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testSum(){
        int[] arr=new int[]{7,6,5};
        assertEquals(18,Main.arrSum(arr));

        arr=new int[]{2,2,1};
        assertEquals(5,Main.arrSum(arr));
    }
    @Test
    void testConvertCounterToNewArray(){
        int[] arr=new int[]{3,4,3};
        int[] expected=new int[]{0,0,0,1,1,1,1,2,2,2};
        int[] result=Main.convertCounterToNewSortedArray(arr);
        assertTrue(Arrays.equals(expected,result));

        arr=new int[]{1,2,3};
        expected=new int[]{0,1,1,2,2,2};
        result=Main.convertCounterToNewSortedArray(arr);
        assertTrue(Arrays.equals(expected,result));
    }
}