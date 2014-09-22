package Instructions;

public class Counter {
	private int i;

	public Counter() {
		i = 0;
	}

	public void increament() {
		if (i < 0) {
			System.exit(0);
		}
		i++;
	}

	public void halt() {
		i = -1;
	}
	
	public int getCount(){
		return i;
	}
}
