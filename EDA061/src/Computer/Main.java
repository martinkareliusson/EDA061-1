package Computer;

import Program.*;

public class Main {

	public static void main(String[] args) {
		Program factorial = new Factorial();
//		System.out.println(factorial);
		Computer computer = new Computer(new Memory(1024));
		computer.load(factorial);
		computer.run();
	}

}
