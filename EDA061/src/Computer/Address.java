package Computer;

public class Address {
	int i;

	public Address(int i) {
		this.i = i;
	}

	public long getValue(Memory mem) {
		return mem.getValue(i);
	}

	public void setValue(long l) {
		// TODO Auto-generated method stub
		
	}
	public void mul(){
		
	}
}
