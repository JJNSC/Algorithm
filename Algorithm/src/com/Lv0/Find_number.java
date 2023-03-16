package com.Lv0;

public class Find_number {
    public static void main(String[] args) {
        int num = 232443;
        int k =4;  
        int num2 =0;
        int answer =-1;

        for(int i=0; num>0 ; i++){
            num2 = num2*10+ num%10;
            num = num/10;
        }
        for(int i=1; num2>0;i++){   
            if(num2%10 ==k){
                answer =i;
                break;
            }
            num2 = num2/10;   
        }
    }
}
