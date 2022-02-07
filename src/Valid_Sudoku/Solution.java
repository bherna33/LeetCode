package Valid_Sudoku;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();     //create hashset to store values

        for(int i =0;i<9;i++) {
            for(int j = 0;j<9;j++) {
                char ch = board[i][j];     //create char to hold index
                if(ch != '.') {     // if the char is not an empty space add to hashset
                    if(!seen.add(ch +"row" + i)||  // storing element with row number
                        !seen.add(ch + "column" + j)|| // storing element with column number
                        !seen.add(ch + "box" + i/3 +"-"+j/3)) // storing element with box number

                    return false;

                }
            }
        }
        return true;
    }
}
