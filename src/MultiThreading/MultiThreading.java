package MultiThreading;

public class MultiThreading implements Runnable {

	String message;
	Sender send;

	public MultiThreading(String message, Sender send) {
		this.message = message;
		this.send = send;
	}

	@Override
	public void run() {
		synchronized (send) {
			send.sendMsg(message);
		}
	}

	public static void main(String[] args) {
		Sender sender = new Sender();
		new Thread(new MultiThreading("Hi Rubi", sender)).start();
		new Thread(new MultiThreading("Hi Bhuvi", sender)).start();
	}
}

class Sender {
	public void sendMsg(String message) {
		for (int i = 1; i <= 10; i++)
			System.out.println("Message :: " + message);
	}
}
