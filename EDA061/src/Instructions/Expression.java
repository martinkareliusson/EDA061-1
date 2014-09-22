package Instructions;

import Computer.*;

public abstract class Expression implements Instruction {
	Operand op1;
	Operand op2;
	Address a;

	public Expression(Operand op1, Operand op2, Address a) {
		this.op1 = op1;
		this.op2 = op2;
		this.a = a;
	}

	public void execute(Memory mem) {

	}

}
