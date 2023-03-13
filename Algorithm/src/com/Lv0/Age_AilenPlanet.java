package com.Lv0;

public class Age_AilenPlanet {
    public static void main(String[] args) {
        int age =23;
        String answer="";
        char a ='a';
        while(age>0){
            a = (char)(age%10+97);
            age /= 10;
            answer = a+answer;
        }
        
        System.out.println(answer);
    }
}
