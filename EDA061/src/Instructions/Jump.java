package Instructions;

import Computer.Memory;

public class Jump implements Instruction {
	int i;

	public Jump(int i) {
		this.i = i;
	}

	public void execute(Memory mem, Counter c) {
		c.jumpTo(i - 1);

	}

	public String toString() {
		return "JMP " + String.valueOf(i);
	}
}
