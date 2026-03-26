package oops.interrface;

public class FunctionalInterfaceExample {

	public static void main(String[] args) 
	{
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Example of Functional Interface, A new Thread created..!");
			}
		}).start();

		// using Lambda expression
		new Thread(() -> {
			System.out.println("Example of Functional Interface, using Lambda expression..!");
		}).start();
	}
}
