package Search_a_2D_Matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // loop through matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target){     // if index == target return true
                    return true;
                }
                else if(matrix[i][j] > target){     // if index is greater than target return false
                    return false;
                }
            }
        }
        return false;
    }
}
