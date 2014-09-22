package Computer;

public class Memory {
	
	Word[] memList;

	public Memory() {

	}

	public long getValue(int i) {
		return memList[i].getValue();
		
	}

}
