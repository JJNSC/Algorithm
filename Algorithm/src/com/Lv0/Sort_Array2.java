package com.Lv0;

import java.util.Arrays;

public class Sort_Array2 {
    public static void main(String[] args) {
        String my_array ="Python";
        String answer="";
        
        answer = my_array.toLowerCase();
        char chars[] = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);

        System.out.println(answer);

        
    }
}
