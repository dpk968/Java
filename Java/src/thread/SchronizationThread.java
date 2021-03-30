package thread;


class student{
	
	student(int rollNo, String FirstName)
	{
		
		System.out.println("name:"+FirstName+"\nrollNo is:"+rollNo);
	}
	public void skills()
	{
		System.out.println("I love Java");
	}
}

public class SchronizationThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student Dpk = new student(20,"Deeepak");
		Dpk.skills();

	}

}
