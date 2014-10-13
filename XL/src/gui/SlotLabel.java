package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import model.Sheet;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer{
	private CurrentSlot currentSlot;
	private Sheet sheet;
	private String slotName;
	
	public SlotLabel(String slotName, CurrentSlot currentSlot, Sheet sheet) {
		super("                    ", Color.WHITE, RIGHT);
		this.currentSlot = currentSlot;
		this.sheet= sheet;
		slotName = slotName;
		sheet.addObserver(this);
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
		currentSlot.setWhite();
		setBackground(Color.YELLOW);
		currentSlot.set(this);
		setText(slotName);

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	public String name() {
		return slotName;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		currentSlot.deleteObserver(this);
		setText(slotName);
	
	}
	
}