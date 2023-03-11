package com.Lv0;

public class Select_nth_multipleNum {
    public static void main(String[] args) {
        int n=3;
        int[] numlist ={4, 5, 6, 7, 8, 9, 10, 11, 12};
        int cnt=0;
        int j=0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                System.out.println(numlist[i]);
                cnt++;
            }
        }
        System.out.println("cnt:"+cnt);
        int[] answer = new int[cnt];
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[j] = numlist[i];
                j++;
            }
        }
        for(int k=0; k<cnt;k++){
            System.out.println(answer[k]);
        }
    }
}
