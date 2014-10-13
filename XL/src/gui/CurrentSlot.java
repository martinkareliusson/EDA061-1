package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class CurrentSlot extends Controller {
	private SlotLabel currentLabel;

	public CurrentSlot() {
		super();
	}
	
	public void set(SlotLabel slotLabel) {
		currentLabel = slotLabel;
		setChanged();
		notifyObservers();
		addObserver(slotLabel);
	}

	public String getName() {
		return currentLabel.getName();

	}
	public void setWhite(){
		currentLabel.setBackground(Color.WHITE);
	}
	public void addObserver(SlotLabel slotLabel){
		
	}
}