package Computer;

import Program.Program;

public class Computer {

	Program p;
	Memory mem;

	public Computer(Memory mem) {
		this.mem = mem;
	}

	public void load(Program p) {
		this.p = p;
	}

	public void run() {
		p.execute(mem);
	}
}
