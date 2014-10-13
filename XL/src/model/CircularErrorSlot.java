package model;

import util.XLException;
import expr.Environment;

public class CircularErrorSlot implements Slot {

	public double value(Environment env) {
		throw new XLException("Circular Error");
	}

	public String parse(Environment env) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getValue(Environment e) {
		// TODO Auto-generated method stub
		return 0;
	}

}