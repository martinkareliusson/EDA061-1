package model;

import expr.Environment;

public interface Slot {

	public double getValue(Environment e);

	public String toString(Environment e);

	public String stringSavedSlot();

	public String commentValue();
	
}
