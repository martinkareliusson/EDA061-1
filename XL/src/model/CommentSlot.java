package model;

import expr.Environment;

public class CommentSlot implements Slot {

	private String s;

	public CommentSlot(String s) {
		this.s = s;
	}

	@Override
	public double getValue(Environment e) {
		return 0;
	}

	@Override
	public String toString(Environment e) {
		return s;
	}

}
