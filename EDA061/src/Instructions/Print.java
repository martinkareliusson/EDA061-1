package Instructions;

import Computer.Address;
import Computer.Memory;

public class Print implements Instruction {
	
	Address a;
	
	public Print(Address a) {
		this.a = a;
	}

	public void execute(Memory mem, Counter c) {
		// TODO Auto-generated method stub
		
	}
	public String toString(){
		return "PRT" + a.toString();
	}

}
