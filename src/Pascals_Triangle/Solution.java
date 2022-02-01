package Pascals_Triangle;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();     // create array

        for(int i = 0; i < numRows; ++i){       // loop until numRows
            List<Integer> currRow = new ArrayList<>();      // create inner array
            for (int j = 0; j <= i; ++j){

                //if 0 < j && j < i add the previous indexs together else put 1 in the array,
                currRow.add((0<j && j<i) ? pascal.get(i-1).get(j-1)+ pascal.get(i-1).get(j) : 1);
            }
            pascal.add(currRow);        // add array to pascal
        }
        return pascal;      // return array.
    }
}
