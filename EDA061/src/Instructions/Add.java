package Instructions;

import Computer.*;
import Program.*;

public class Add extends Expression {
	Address n;
	Word word;
	Address n2;

	public Add(Address n, Word word, Address n2) {
		this.n = n;
		this.word = word;
		this.n2 = n2;
	}

	public void execute(Memory mem) {
		n2.getWord(mem).add(n.getWord(mem), word);

	}
}
