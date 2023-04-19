package SomaElementosVector;

public class Solution {
    // Atributos
    private int[] vector;
    private int target;

    // Construtor
    public Solution(int[] vector, int target) {
        this.vector = vector;
        this.target = target;
    }

    // Métodos
    public int[] twoSum() {
        for(int i = 0; i < vector.length; i++) {
            for(int j = i+1; j < vector.length; j++) {
                if(vector[i]+vector[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] twoSumRec(int a, int b) {
        if(a == vector.length) {
            int[] res = {-1,-1};
            return res;
        }
        if(vector[a] + vector[b] == target) {
            int[] res = {a,b};
            return res;
        }
        if(b < vector.length-1){
            return twoSumRec(a, ++b);
        }
        return twoSumRec(++a, ++a);
    }

    public int[] twoSumON() {
        return new int[] {-1,-1};
    }
}
