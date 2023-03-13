package com.Lv0;

public class Divison {
    public static void main(String[] args) {
        int n =24;
        int cnt=0; 
        for(int i=1; i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        int[] answer =new int[cnt];
        int j=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                answer[j] = i; 
                j++;
            }
        }
        
    }
}
