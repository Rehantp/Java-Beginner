package question03;

import java.util.ArrayList;

class ProducerThread extends Thread {
	
	ArrayList list;
	
	public ProducerThread(ArrayList list) {
		this.list = list;
	}
	
	public void run() {
		synchronized (list) {
			System.out.println("Producer started");
			try {
				int i = 10;
				while(true) {
					list.notify();
					System.out.println("Producer adding value = " + i + " to Queue");
					list.add(i);
					i = i + 10;
					Thread.sleep(1000);
					list.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ConsumerThread extends Thread {
	
	ArrayList list;
	
	public ConsumerThread(ArrayList list) {
		this.list = list;
	}
	
	public void run() {
		System.out.println("Consumer started");
		synchronized (list) {
			try {
				while(true) {
					list.notify();
					System.out.println("Consumer thread consumes " + list.get(0));
					list.remove(0);
					System.out.println("Elements in the Queue = " + list);
					Thread.sleep(1000);
					list.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> queue = new ArrayList<>();
		Thread producer = new Thread(new ProducerThread(queue));
		Thread consumer = new Thread(new ConsumerThread(queue));
		producer.start();
		consumer.start();
		System.out.println("Starting");
	}
}
