package Instructions;

import Computer.*;

public class JumpEq implements Instruction {
	int i;
	Address n;
	Word w;

	public JumpEq(int i, Address n, Word w) {
		this.i = i;
		this.n = n;
		this.w = w;

	}

	public void execute(Memory mem, Counter c) {
		if (n.getWord(mem).equals(w.getWord(mem))) {
			c.jumpTo(i - 1);
		}

	}

	public String toString() {
		return "JEQ " + String.valueOf(i) + " [" + n.toString() + "] "
				+ w.toString();
	}
}
