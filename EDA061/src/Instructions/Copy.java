package Instructions;

import Computer.*;

public class Copy implements Instruction {
	Operand op1, op2;

	public Copy(Operand op1, Operand op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public void execute(Memory mem, Counter c) {
		op2.getWord(mem).copy(op1.getWord(mem));

	}
	public String toString(){
		return "CPY" + op1.toString() + op2.toString();
	}

}
