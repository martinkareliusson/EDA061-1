package gui.menu;

import gui.StatusLabel;
import gui.XL;

import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.swing.JFileChooser;

import util.XLException;
import model.Sheet;
import model.Slot;

class LoadMenuItem extends OpenMenuItem {
	
		private Sheet sheet;

	public LoadMenuItem(XL xl, StatusLabel statusLabel, Sheet sheet) {
		super(xl, statusLabel, "Load");
		this.sheet = sheet;
	}

	protected void action(String path) throws FileNotFoundException {
		try {
			statusLabel.clear();
			XLBufferedReader buffReader = new XLBufferedReader(path);
			HashMap<String, Slot> loadSheet = new HashMap<String, Slot>();
			buffReader.load(loadSheet);
			sheet.load(loadSheet);
			sheet.updateSlotLabels();
		} catch (XLException e) {
			statusLabel.setText("Cannot load file: " + e.getMessage());

		}
	}

	protected int openDialog(JFileChooser fileChooser) {
		return fileChooser.showOpenDialog(xl);
	}
}