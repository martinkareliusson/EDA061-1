package gui.menu;

import gui.CurrentSlot;
import gui.StatusLabel;
import gui.XL;
import gui.XLList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import model.Sheet;

public class XLMenuBar extends JMenuBar {
//	private CurrentSlot currentSlot;
//	private Sheet sheet;

	public XLMenuBar(XL xl, XLList xlList, StatusLabel statusLabel, Sheet sheet, CurrentSlot cs) {
//		this.sheet = sheet;
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		file.add(new PrintMenuItem(xl, statusLabel));
		file.add(new SaveMenuItem(xl, statusLabel, sheet));
		file.add(new LoadMenuItem(xl, statusLabel, sheet));
		file.add(new NewMenuItem(xl));
		file.add(new CloseMenuItem(xl, xlList));
		edit.add(new ClearMenuItem(cs, sheet));
		edit.add(new ClearAllMenuItem(sheet));
		add(file);
		add(edit);
		add(new WindowMenu(xlList));
	}
}