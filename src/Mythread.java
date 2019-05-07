
public class Mythread {

	public static void main(String[] args) throws InterruptedException {

		ChildThread t=new ChildThread();
		t.start();

		t.join();

		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
	}

}
