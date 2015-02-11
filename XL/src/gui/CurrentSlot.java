package gui;

import java.awt.Color;

public class CurrentSlot  {
	private SlotLabel currentSlot;
	private Controller c;
	
	public CurrentSlot(Controller c){
		this.c = c;
	}

	public String getName() {
		return currentSlot.getName();
	}

	public void set(SlotLabel slotLabel) {
		currentSlot = slotLabel;
		c.notifyObservers();
		c.addObserver(slotLabel);
		
	}

	public void setWhite() {
		currentSlot.setBackground(Color.WHITE);
	}
	public void clearSlot(){
		currentSlot.setText("");
	}

}