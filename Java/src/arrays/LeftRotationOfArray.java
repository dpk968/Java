package arrays;


class leftRotation{
	static int[] rotLeft(int[] a, int d) {
    int[] arr=new int[a.length];
    for(int i=0;i<a.length;i++){
        arr[i]=a[(i+d)%a.length];
        
    }
    
    return arr;


}
}

public class LeftRotationOfArray {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		System.out.println("Enter no of rotation");
//		int r=sc.nextInt();
//		for(int i=0;i>r;i++)
//		{
//			for(int j=0;j>a.length;j++) {
//				int temp=a[0];
//				a[j]=a[j+1];
//				a[n]=temp;
//			}
//		}
//		System.out.println("rotated Array");
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]);
//		}
//		
//		sc.close();

	}

}
