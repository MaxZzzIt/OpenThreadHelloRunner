package by.home.maxzzzit;

public class OpenThreadHelloRunner implements Runnable {
	int i;

	public void run() {
		i = 0;
		while (true) {
			System.out.println("Hello " + i++);
			if (i == 51) {
				break;
			}
			try {
				Thread.sleep(100);	
			} catch (InterruptedException e) {
				
			}
		}
	}
}
