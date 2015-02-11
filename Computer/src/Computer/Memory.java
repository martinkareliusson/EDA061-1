package Computer;

public class Memory {

	Word[] memList;

	public Memory(int i) {
		memList = new Word[i];
	}

	public long getValue(int i) {
		return memList[i].getValue();

	}

	public Word getWord(int i) {
		return memList[i];
	}

	public void add(int index, Word word) {
		memList[index] = word;

	}

}
