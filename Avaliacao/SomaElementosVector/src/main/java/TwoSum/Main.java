package TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] vector = {3,6,2,4};
        int target = 6;

        int[] res = solution.twoSum(vector,target);
        int[] resRec = solution.twoSumRec(vector,target);

        System.out.println("Resultados do Two Sum do LeetCode:");
        System.out.println("Two Sum: "+Arrays.toString(res));

        System.out.println("Two Sum recursivo: "+Arrays.toString(resRec));

    }
}