package model;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import util.XLException;
import expr.*;
import gui.Controller;
import gui.SlotLabel;
import gui.SlotLabels;

public class Sheet implements Environment {
	SlotFactory factory;
	HashMap<String, Slot> sheet;
	Controller c;
	SlotLabels sl;

	public Sheet(Controller c) {
		this.sheet = new HashMap<String, Slot>();
		factory = new SlotFactory();
		this.c = c;

	}

	public Sheet(HashMap<String, Slot> sheet) {
		this.sheet = sheet;
	}

	public double value(String name) {
		Slot slot = sheet.get(name);
		if (slot == null) {
			throw new XLException("Empty Slot: " + name);
		}
		return slot.getValue(this);
	}

	public void putSlot(String name, String content) {
		Slot slot = factory.build(content);
		checkLoop(name, slot);
		sheet.put(name, slot);
		updateSheet();
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

	public void removeSlot(String slotKey) {
		Slot slot = sheet.get(slotKey);
		CircularErrorSlot errorSlot = new CircularErrorSlot();
		sheet.put(slotKey, errorSlot);
		try {
			for (Slot s : sheet.values()) {
				if (s != errorSlot) {
					s.getValue(this);
				}
			}
		} catch (XLException e) {
			sheet.put(slotKey, slot);
			throw new XLException("Cannot remove cell " + slotKey);
		}
		sheet.remove(slotKey);
		updateSheet();
	}

	public String getSlotValue(String slotKey) {
		Slot s = getSlot(slotKey);
		if (s == null) {
			return "";
		} else if (getSlot(slotKey) instanceof CommentSlot) {
			return s.commentValue();
		}

		return String.valueOf(getSlot(slotKey).getValue(this));
	}

	public String getSlotString(String slotKey) {
		if (getSlot(slotKey) == null) {
			return "";
		}
		return getSlot(slotKey).toString(this);
	}

	public Slot getSlot(String slotKey) {
		return sheet.get(slotKey);
	}

	public double slotValue(String slotKey) {
		return sheet.get(slotKey).getValue(this);
	}

	public void load(HashMap<String, Slot> newSheet) {
		HashMap<String, Slot> oldSheet = sheet;
		sheet = newSheet;
		try {
			for (Entry<String, Slot> entry : sheet.entrySet()) {
				checkLoop(entry.getKey(), entry.getValue());
			}
		} catch (XLException e) {
			sheet = oldSheet;
			throw e;
		}
		updateSheet();
	}

	public void clearSheet() {
		sheet = new HashMap<String, Slot>();
		sl.clearAll();
		updateSheet();
	}

	public void updateSheet() {
		c.notifyObservers();
	}

	public Set<Entry<String, Slot>> getEntries() {
		return sheet.entrySet();
	}

	public void addSlotLabels(SlotLabels sl) {
		this.sl = sl;

	}

	public void updateSlotLabels() {
		for (SlotLabel s : sl.getList()) {
			s.updateText();
		}
	}
}