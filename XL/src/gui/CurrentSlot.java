package gui;

import java.util.Observable;
import java.util.Observer;

public class CurrentSlot implements Observer {
	private SlotLabel currentSlot;

	public CurrentSlot() {

	}

	public String getName() {
		return currentSlot.getName();

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}