package Richest_Customer_Wealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {

        int Max = 0;        //create max var

        for(int i = 0; i < accounts.length; i++){       //run through first array
            int Maxsum = 0;     //max sum of array
            for(int j = 0; j < accounts[i].length; j++){        // run through second array

                Maxsum = Maxsum + accounts[i][j];       // sum second array

                if( Maxsum > Max){
                    Max = Maxsum;       // set max to max sum
                }
            }
        }
        return Max;     // return max
    }
}
