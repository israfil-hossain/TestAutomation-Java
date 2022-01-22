package rokomari.automation;

public class Timesleep {

	public static void Waiting(int time) {
		 try {
			   // It's wait for 10 seconds. 
				Thread.sleep(time);
				System.out.println("waiting ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return;
	}
}
