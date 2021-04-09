package arrays;

import java.util.*;


public class Frequency {
	
	public static void checkFrequency(String s)
	{
		int n=s.length();
		boolean[] visited = new boolean[n];
		
		int count;
		char[] ar = s.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(visited[i])
				continue;
			
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					visited[j]=true;
					count++;
					
				}
				
			}
			
			System.out.println(ar[i]+" "+count);
			
		}		
	}


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter nu of elements");
//		int n = sc.nextInt();
		String s = sc.next();
		
		
		checkFrequency(s);
		sc.close();
		

	}

}
