package Instructions;

import Computer.Address;
import Computer.LongWord;
import Computer.Memory;

public class JumpEq implements Instruction {
	int i;
	Address n;
	LongWord longWord;

	public JumpEq(int i, Address n, LongWord longWord) {
		this.i = i;
		this.n = n;
		this.longWord = longWord;

	}

	public void execute(Memory mem, Counter c) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return "JEQ" + String.valueOf(i) + n.toString() + longWord.toString();
	}
}
