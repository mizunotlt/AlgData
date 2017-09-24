import HomeTask1.Cortege;
import HomeTask1.HomeTask1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tetsForTask1 {

    public int[] subArray(int[] array, int low, int high){
        int[] result = new int[high - low + 1];
        for(int i = low; i <= high; i++){
            result[i] = array[i];
        }
        return result;
    }


    @Test
    void testFindMaxSubArray() {
        HomeTask1 test = new HomeTask1();

        int[] testArray1 = {1, 1, 1, 1};
        int[] testArray2 = {8, -234, -20, -234529, 243560, 57465};
        int[] testArray3 = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        assertEquals(new Cortege(0,3,4),test.findMaxSubArray(testArray1,0,testArray1.length - 1));
        assertEquals(new Cortege(4,5,301025),test.findMaxSubArray(testArray2,0,testArray2.length - 1));
        assertEquals(new Cortege(7,10,43),test.findMaxSubArray(testArray3,0,testArray3.length - 1));


    }
}
