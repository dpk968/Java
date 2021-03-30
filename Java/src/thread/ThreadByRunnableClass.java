package thread;


//here we implement runnable and override run method

class A implements Runnable{
	public void run() { 
	for(int i=0;i<10;i++)
		System.out.println(i+"A");
}
}

class B implements Runnable{
	public void run() { 
	for(int i=0;i<10;i++)
		System.out.println(i+"B");
}
}

public class ThreadByRunnableClass {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A());
		
		Thread t2 = new Thread(new B());
		
		t1.start();
		t2.start();
		

	}

}
