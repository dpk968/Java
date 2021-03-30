package thread;

//inherit Thread class

//there is one prob with this type for creating thread 
// because of extend there is not any other parent class of class Dev And Dpk
//that is why we use runnable for creating a thread

class Dev extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Dev"+i);
	}
}

class Dpk extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Dpk"+i);
	}
}


public class ThreadByExtendThreadClass {

	public static void main(String[] args) {
		
		//because of inherit Thread class, class A is also all property of Thread 
	
		Dev d = new Dev();
		Dpk d2 = new Dpk();
		d.start();
		d2.start();
		
		
	}

}
