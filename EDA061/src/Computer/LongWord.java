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
}
