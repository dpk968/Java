package arrays;

import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int count=0,sum=0;
        int n=sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        
        
        
        
       // int[] subArray = Arrays.copyOfRange(ar, 0, 2);
        
        
        
        
        
        
        
		
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)   //1 -2 4 -5 1
			{						//0  1 2  3 4
				
				sum=sum+ar[j];
				if(sum<0)
					count++;
			}
			
				
		}
		System.out.println(count);
		sc.close();

		}
	}



