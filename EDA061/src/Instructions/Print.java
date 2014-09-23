package Instructions;

import Computer.*;

public class Print implements Instruction {

	Operand o;

	public Print(Operand o) {
		this.o = o;
	}

	public void execute(Memory mem, Counter c) {
		System.out.println(o.getWord(mem).toString());

	}

	public String toString() {
		return "PRT [" + o.toString() + "]";
	}

}
