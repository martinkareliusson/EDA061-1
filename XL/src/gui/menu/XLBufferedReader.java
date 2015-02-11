package gui.menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import model.Slot;
import model.SlotFactory;
import util.XLException;

//TODO move to another package
public class XLBufferedReader extends BufferedReader {
	private SlotFactory sf;

	public XLBufferedReader(String name) throws FileNotFoundException {
		super(new FileReader(name));
		sf = new SlotFactory();
	}

	// TODO Change Object to something appropriate
	public void load(HashMap<String, Slot> map) {
		try {
			while (ready()) {
				String string = readLine();
				int i = string.indexOf('=');
				String name = string.substring(0, i);
				String oprs = string.substring(i + 1);

				map.put(name, sf.build(oprs));

			}
		} catch (Exception e) {
			throw new XLException(e.getMessage());
		}
	}
}
