package Program;

// First change
// Second change
/*a
 * Author: Niclas Lovdahl
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

		while (c.getCount() >= 0) {
			list.get(c.getCount()).execute(mem, c);
			c.increament();
		}
	}
}
