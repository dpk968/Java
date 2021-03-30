package hackerrank.WarmUpChallenges;

import java.util.Scanner;

public class SalesByMatch {
	
	public static int sockMerchant(int[] ar,int n)
	{
		//This actual code you have to write in SalesByMatch question
		boolean[] visited = new boolean[n];
		int[] ar2 = new int[n];
		int count2=0;
		
		int count;
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
			ar2[i]=count;
			
		}
		
		for(int i=0;i<n;i++)
		{
			if(ar2[i]!=0)
				count2=count2+ar2[i]/2;
		}
		return count2;
		
	}


	//end of sockMerchant() method

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nu of elements");
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println(sockMerchant(ar,n));
		sc.close();

	}

}
