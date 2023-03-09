package com.Lv0;

import java.util.Arrays;

public class LineUpString {
    public static void main(String[] args) {
        String my_string ="p2o4i8gj2";
        String imsi="";

        for(int i=0; i<my_string.length();i++){
            if(Character.isDigit(my_string.charAt(i))){
                imsi += my_string.charAt(i);
            }
        }
        System.out.println(imsi);
        int[] answer = new int[imsi.length()];

        for(int j=0; j<imsi.length();j++){
            answer[j] = Integer.parseInt(Character.toString(imsi.charAt(j)));
        }
        Arrays.sort(answer);
        for(int j=0; j<imsi.length();j++){
            System.out.println(answer[j]);
        }
        
    }
}
