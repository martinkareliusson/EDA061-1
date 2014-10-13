package model;

import java.util.HashMap;
import java.util.Observable;

import util.XLException;
import expr.*;

public class Sheet extends Observable implements Environment {

	HashMap<String, Slot> sheet;

	public Sheet() {
		this.sheet = new HashMap<String, Slot>();

	}

	public double value(String name) {
		Slot slot = sheet.get(name);
		if (slot == null) {
			throw new XLException("Cannot refer to empty slot: " + name);
		}
		return slot.getValue(this);
	}

}
