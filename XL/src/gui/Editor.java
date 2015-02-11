package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import util.XLException;
import model.Sheet;

public class Editor extends JTextField implements ActionListener, Observer {
	Sheet sheet;
	StatusLabel statL;
	CurrentSlot cs;
	Controller c;

	public Editor(CurrentSlot cs, StatusLabel statL, Sheet sheet, Controller c) {
		setBackground(Color.WHITE);
		this.sheet = sheet;
		this.statL = statL;
		this.cs = cs;
		this.c = c;
		addActionListener(this);
		c.addObserver(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		statL.clear();
		String name = cs.getName();
		if (getText().equals("")) {
			try {
				sheet.removeSlot(name);
			} catch (XLException e) {
				statL.setText(e.getMessage());
			}
		} else {
			try {
				sheet.putSlot(name, getText());
			} catch (XLException e) {
				statL.setText(e.getMessage());
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		String name = cs.getName();
		String stringSlot = sheet.getSlotString(name);
		setText(stringSlot);

	}
}