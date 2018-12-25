package practice;

public class AnnoyingClass {
	
	public AnnoyingClass() {
		annoy();
	}
	
	public void annoy() {
		while(true) {
			System.out.println("annoy!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
