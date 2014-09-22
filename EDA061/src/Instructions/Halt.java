package Instructions;

import Computer.Memory;

public class Halt implements Instruction {

	public void execute(Memory mem, Counter c) {
		c.halt();

	}
	public String toString(){
		return "HLT";
	}

}
