package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import model.Sheet;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer {
	CurrentSlot cs;
	String name;
	Controller c;
	Sheet sheet;
	StatusLabel sl;

	public SlotLabel(String name, CurrentSlot cs, Controller c, Sheet sheet,
			StatusLabel sl) {
		super("                    ", Color.WHITE, RIGHT);
		this.cs = cs;
		this.c = c;
		this.name = name;
		this.sheet = sheet;
		this.sl = sl;
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		cs.setWhite();
		setBackground(Color.YELLOW);
		cs.set(this);
		c.notifyObservers();
		sl.clear();

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		String s = sheet.getSlotValue(name);
		setText(s);

	}
	public void updateText() {
		String s = sheet.getSlotValue(name);
		setText(s);

	}
}