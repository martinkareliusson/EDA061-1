package Computer;

public class LongWord {

	long l;

	public LongWord(long l) {
		this.l = l;
	}

	public void add(Address a1, Word w, Address a2) {
		long value = w.getValue() + a1.getValue(null);
		a2.setValue(value);

	}

	public long getValue(){
		return 1;
	}
}
