package hackerrank;

import java.util.*;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int arr[][] = {{2,3,4},{4}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		sc.close();
		

	}

}
