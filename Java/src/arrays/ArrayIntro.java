package arrays;

//import arrays.LeftRotationOfArray;

import java.util.*;

public class ArrayIntro {

	public static void main(String[] args) {
		//single line declaration
		//int[] marks = new int[5];
		
		//if you want to declare two array in one line 
				//int[] array1,aaray2;
		
		//multiple line declaration
		//int[] marks;
		//marks = new int[5];
		
		int age[] = {2,3,4,5,9,8};
		
//		int marks[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<age.length;i++)
		{
			System.out.print(age[i]);
		}
		/*
		 * System.out.print(" "); for(int i =0;i<6;i++) { System.out.print(age[i]); }
		 */
		System.out.print(Math.abs(-5));
		sc.close();

	}

}
