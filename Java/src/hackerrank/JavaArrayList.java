package hackerrank;

import java.util.*;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList[] arrayList = new ArrayList[200];		
		for(int i=0;i<n;i++) {
			arrayList[i] = new ArrayList();
			int d = sc.nextInt();
			for(int j=0;j<d;j++)
			{
				int val = sc.nextInt();
				arrayList[i].add(val);
			}
			
		}
			
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			int r = sc.nextInt();
			int c =sc.nextInt();
			System.out.println(arrayList[r-1].get(c-1));
			
			
		}
			
		
		sc.close();

	}

}
