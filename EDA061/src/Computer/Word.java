package Computer;

public abstract class Word implements Operand {

	public abstract void add(Word w1, Word w2);
	
	public abstract void mul(Word w1, Word w2);

	public abstract Word getWord(Memory mem);
	
	public abstract long getValue();
	
	public abstract void copy(Word w);
	
	public abstract boolean equals(Word w);
	

}
