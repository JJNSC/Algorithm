package com.Lv0;

public class ConditionToMakeRectangle {

	public static void main(String[] args) {
		int[] sides = {1,2,3};
		int result =2;
		if( sides[0] >= sides[1] && sides[0]>=sides[2]) {
			if(sides[0] < sides[1]+sides[2]) {
				result = 1;
			}
		}else if ( sides[1] >= sides[2] && sides[1]>=sides[2]) {
			if(sides[1] < sides[0]+sides[2]) {
				result = 1;
			}
		}else if( sides[2] >= sides[0] && sides[2]>=sides[1]) {
			if(sides[2] < sides[0]+sides[1]) {
				result = 1;
			}
		}
		
		
		
		System.out.println(result);

	}

}
