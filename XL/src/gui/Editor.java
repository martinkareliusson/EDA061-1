package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import util.XLException;
import model.Sheet;

import java.util.*;

public class Editor extends JTextField implements Observer, ActionListener {
	private CurrentSlot currentSlot;
	private Sheet sheet;
	private StatusLabel status;

	public Editor(CurrentSlot currentSlot, Sheet sheet, StatusLabel status) {
		this.currentSlot = currentSlot;
		this.sheet = sheet;
		this.status = status;
		setBackground(Color.WHITE);
		addActionListener(this);
		currentSlot.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		String slotKey = currentSlot.getName();
		String representation = sheet.getStringSlot(slotKey);
		setText(representation);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name = currentSlot.getName();
		String input = getText();
		if (input.equals("")) {

			try {
				sheet.removeSlot(name);
			} catch (XLException e) {
				status.setText(e.getMessage());
			}
		} else {

			try {
				sheet.putSlot(name, input);
			} catch (XLException e) {
				status.setText(e.getMessage());
			}

		}
	}

}
