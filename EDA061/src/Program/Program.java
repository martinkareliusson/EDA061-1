package Program;

/**
 *  Author: Niclas Lovdahl
 */

import java.util.ArrayList;
import Instructions.*;
import Computer.*;

public class Program {

	public ArrayList<Instruction> list;

	public Program() {
		list = new ArrayList<Instruction>();

	}

	public void add(Instruction i) {
		list.add(i);
	}

	public void execute(Memory mem) {
		Counter c = new Counter();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " " + list.get(i).toString());
		}
		
		while (c.getCount() >= 0) {
			list.get(c.getCount()).execute(mem, c);
			if (c.getCount() == -1) {

			} else {
				// Do nothing
			}

			c.increament();

		}
	}
}
