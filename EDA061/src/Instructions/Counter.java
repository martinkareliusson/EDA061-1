package Instructions;

public class Counter {
	private int i;

	public Counter() {
		i = 0;
	}

	public void increment() {
		if (i < 0) {
			System.exit(0);
		}
		i++;
	}
	
	public void pcHalt1() {
		i = -1;
	}
}
