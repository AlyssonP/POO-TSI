package TwoSum;

public class Solution {
    // Métodos
    public int[] twoSum( int[] vector, int target) {
        for(int i = 0; i < vector.length; i++) {
            for(int j = i+1; j < vector.length; j++) {
                if(vector[i]+vector[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] twoSumRec(int[] vector, int target) {
        return twoSumRec(vector, target, 0, 1);
    }
    //Sobrecarga
    public int[] twoSumRec(int[] vector, int target, int a, int b) {
        if(a == vector.length) {
            return new int[] {-1,-1};
        }
        if(vector[a] + vector[b] == target) {
            return new int[] {a,b};
        }
        if(b < vector.length-1){
            return twoSumRec(vector, target,a, ++b);
        }
        return twoSumRec(vector, target,++a, a+1);
    }
}
