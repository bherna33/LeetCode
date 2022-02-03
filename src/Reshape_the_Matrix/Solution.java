package Reshape_the_Matrix;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if((mat.length*mat[0].length) != (r*c))
            return mat;

        int [][]ans = new int[r][c];
        int k=0,l=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(l>=c){
                    l=0;
                    k++;
                }
                ans[k][l++] = mat[i][j];
            }
        }
        return ans;
    }
}
