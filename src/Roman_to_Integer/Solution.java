package Roman_to_Integer;

public class Solution {
    public int romanToInt(String s) {
        int num = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            String c = s.charAt(i)+"";
            char prev = i+1<s.length() ? s.charAt(i+1):'*';

            if(c.equals("I")){
                num += 1;
                if(prev == 'V'){
                    num-=2;
                }
                if(prev == 'X'){
                    num-=2;
                }
            }
            else if(c.equals("V")){
                num += 5;
            }
            else if(c.equals("X")){
                num += 10;
                if(prev == 'L'){
                    num-=20;
                }
                if(prev == 'C'){
                    num-=20;
                }
            }
            else if(c.equals("L")){
                num += 50;
            }
            else if(c.equals("C")){
                num += 100;
                if(prev == 'D'){
                    num-=200;
                }
                if(prev == 'M'){
                    num-=200;
                }
            }
            else if(c.equals("D")){
                num += 500;
            }
            else if(c.equals("M")){
                num += 1000;
            }
        }
        return num;
    }
}
