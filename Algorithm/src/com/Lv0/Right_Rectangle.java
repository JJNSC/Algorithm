package com.Lv0;

import java.util.Scanner;

public class Right_Rectangle {
    public static void main(String[] args) {
        System.out.println("숫자를 적으세요: ");
        Scanner sc= new Scanner(System.in);
        int n  =sc.nextInt();
        for(int i=1; i<=n;i++){
           
           for(int j =1; j<=i;j++){
            System.out.print('*');
           }
           System.out.println();
        }
    }
}
