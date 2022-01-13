package Maximum_Number_of_Words_Found_in_Sentences;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;

        for(int i = 0; i < sentences.length; i++){
            int len = sentences[i].split(" ").length;
            if(len > count){
                count = len;
            }
        }
        return count;
    }
}
