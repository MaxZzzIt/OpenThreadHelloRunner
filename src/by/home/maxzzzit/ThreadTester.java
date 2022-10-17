package by.home.maxzzzit;

public class ThreadTester {
	public static void main (String[]args) {
		OpenThreadHelloRunner r = new OpenThreadHelloRunner();
		Thread t = new Thread(r);
		t.start();
	}
}