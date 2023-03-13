package com.Lv0;

public class Change_Index {
    public static void main(String[] args) {
        String my_String ="I love you";
        int num1 =3;
        int num2 =6;
        String answer ="";
        for(int i=0; i<my_String.length();i++){
            int j=i;
            if(i==num1){
                j=num2;
            }else if(i==num2){
                j=num1;
            }
            answer += my_String.charAt(j);
        }
        
        
        System.out.println(answer);
    }
}
