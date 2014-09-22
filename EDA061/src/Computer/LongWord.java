package Computer;

public class LongWord extends Word {

	long l;

	public LongWord(long l) {
		this.l = l;
	}

	public void add(Word w1, Word w2) {
		l = w1.getValue() + w2.getValue();
	}

	public long getValue() {
		return l;
	}

	public Word getWord(Memory mem) {
		return this;
	}

	public Word getWord() {
		return this;
	}

	public void mul(Word w1, Word w2) {
		l = w1.getValue() * w2.getValue();

	}

	public void copy(Word w) {
		l = w.getValue();

	}

	@Override
	public boolean equals(Word w) {
		if (l == w.getValue()) {
			return true;
		}
		return false;
	}
}
