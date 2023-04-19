package SomaElementosVector;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vector = {3,2,4};
        Solution solution = new Solution(vector,6);
        int[] res = solution.twoSum();
        int[] resRec = solution.twoSumRec(0,0);
        int[] resON = solution.twoSumON();
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(resRec));
        // System.out.println(Arrays.toString(resON));

    }
}