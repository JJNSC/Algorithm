package com.Lv2;

public class Multi_Processions {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1[0].length;i++){
            for(int j=0; j<arr2[0].length;j++){
               for(int k=0; k<arr2.length;k++){
                    answer[i][j] += arr1[i][k]* arr2[k][j];
               }
            }
        }
    }
}
