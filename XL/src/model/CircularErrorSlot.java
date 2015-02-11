package model;

import util.XLException;
import expr.Environment;

public class CircularErrorSlot implements Slot {

	@Override
	public double getValue(Environment e) {
		throw new XLException("Circular Error");
	}

	@Override
	public String toString(Environment e) {
		throw new XLException("This is an error slot");
	}

	@Override
	public String stringSavedSlot() {
		return null;
	}

	public String commentValue() {
		return null;
	}

}
