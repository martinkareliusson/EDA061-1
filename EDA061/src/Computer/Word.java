package Computer;

public abstract class Word implements Operand {

	public abstract void add(Word w1, Word w2);

	public abstract Word getWord(Memory mem);
	
	public abstract long getValue();
	

}
