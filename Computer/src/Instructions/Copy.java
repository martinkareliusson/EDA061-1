package Instructions;

import Computer.*;

public class Copy implements Instruction {
	Operand op1;
	Address a;

	public Copy(Operand op1, Address a) {
		this.op1 = op1;
		this.a = a;
	}

	public void execute(Memory mem, Counter c) {
		mem.add(a.getIndex(), op1.getWord(mem));

	}

	public String toString() {
		return "CPY" + " " + op1.toString() + " [" + a.toString() + "]";
	}

}
