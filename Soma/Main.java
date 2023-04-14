package Soma;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lista = {6,2,3,4,3};
        int target = 6;

        int[] res = solution.twoSum(lista,target);
        System.out.printf("[%d,%d]",res[0],res[1]);

        int[] resRec = solution.twoSumRec(lista,target,0,1);
        System.out.printf("[%d,%d]",resRec[0],resRec[1]);
    }
}
