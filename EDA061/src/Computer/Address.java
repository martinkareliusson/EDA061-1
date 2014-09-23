package Computer;

public class Address implements Operand {
	int i;

	public Address(int i) {
		this.i = i;
	}

	public Word getWord(Memory mem) {
		return mem.getWord(i);
	}

	public int getIndex(){
		return i;
	}
	
	public String toString(){
		return Integer.toString(i);
	}
	
}
