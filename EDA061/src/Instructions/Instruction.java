package Instructions;

import Computer.Memory;

public interface Instruction {
	
	public void execute(Memory mem, Counter c);
}
