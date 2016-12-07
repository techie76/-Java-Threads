public class SimpleThread extends Thread {
	public void run(){
		for (int i =0; i < 10; i++)
			System.out.println(" In MyThread" + i);
	}
	public static void main (String args []) {
		SimpleThread st = new SimpleThread();
		st.start();
		for (int i = 0; i < 20; i++)
			System.out.println(" In main thread " + i);
	}
}