package Instructions;

public class ProgramCounter {
	private int i;

	public ProgramCounter() {
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
