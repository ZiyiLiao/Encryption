import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        String input1 = "feedthedog";
        encryption(input1);
        // "fto ehg ee dd"

        String input2 = "haveaniceday";
        encryption(input2);
        // "hae and via ecy"


        String input3 = "chillout";
        encryption(input3);
        // "clu hlt io"


        String input4 = "";
        encryption(input4);
        // ""

    }

    public static void encryption(String s){
        int row = (int) Math.ceil(Math.sqrt(s.length()));
        for(int r = 0; r < row; r++){
            int index = r;
            while(index < s.length()){
                System.out.print(s.charAt(index));
                index += row;
            }
            System.out.print(" ");
        }
        System.out.println("");

    }
}

