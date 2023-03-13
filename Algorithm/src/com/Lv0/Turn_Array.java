package com.Lv0;

public class Turn_Array {
    public static void main(String[] args) {
        int[] numbers ={4, 455, 6, 4, -1, 45, 6};
        String direction ="left";
        int[] answers = new int[numbers.length];

        if(direction.equals("left")){
            for(int i=0; i<numbers.length-1;i++){
                answers[i] = numbers[i+1];
            }
            answers[numbers.length-1] = numbers[0];
        }else if(direction.equals("right")){
            for(int i=1; i<numbers.length;i++){
                answers[i] = numbers[i-1];
            }
            answers[0] = numbers[numbers.length-1];
        }
        for(int i=0; i<numbers.length;i++){
            System.out.println(answers[i]);
        }
    }
}
