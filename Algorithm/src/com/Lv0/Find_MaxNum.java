package com.Lv0;

public class Find_MaxNum {
    public static void main(String[] args) {
        int[] array ={9, 10, 11, 8};
        int[] answer = new int[2];

        int place =0;
        int max =0;

        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                place =i;
            }
        }
        answer[0] = max;
        answer[1] =place;
    }
}
