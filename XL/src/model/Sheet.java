package model;

import java.util.HashMap;
import java.util.Observable;

import util.XLException;
import expr.*;

public class Sheet extends Observable implements Environment {
	SlotFactory factory;
	HashMap<String, Slot> sheet;

	public Sheet() {
		this.sheet = new HashMap<String, Slot>();
		factory = new SlotFactory();
	}

	public Sheet(HashMap<String, Slot> sheet) {
		this.sheet = sheet;
	}

	public double value(String name) {
		Slot slot = sheet.get(name);
		if (slot == null) {
			throw new XLException("Cannot refer to empty slot: " + name);
		}
		return slot.getValue(this);
	}

	public void put(String key, String value) {
		if (value.length() > 0) {
			Slot oldSlot = sheet.get(key);
			Slot newSlot = null;
			sheet.put(key, new CircularErrorSlot());
			try {
				newSlot = factory.build(value);
				newSlot.getValue(this);
				sheet.put(key, newSlot);
			} catch (XLException e) {
				sheet.put(key, oldSlot);
				throw new XLException(e.getMessage());
			}
		} else {
			sheet.remove(key);
		}

	}

	public void putSlot(String name, String content) {
		Slot slot = factory.build(content);
		checkLoop(name, slot);
		sheet.put(name, slot);
		setChanged();
		notifyObservers();
	}

	private void checkLoop(String name, Slot slot) {
		Slot oldSlot = sheet.get(name);
		CircularErrorSlot errorSlot = new CircularErrorSlot();
		sheet.put(name, errorSlot);
		try {
			slot.getValue(this);
		} finally {
			sheet.put(name, oldSlot);
		}
	}
}
