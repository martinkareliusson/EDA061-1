package Controller;

import java.util.HashMap;

import expr.*;

public class Sheet implements Environment {

	HashMap<String, Slot> sheet;

	public Sheet() {
		this.sheet = new HashMap<String, Slot>();

	}

	public double value(String name) {
		return 0;
	}

}
