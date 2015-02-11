package gui;

import java.util.Observable;

public class Controller extends Observable {
	
	public Controller(){
		
	}

	@Override
	public void notifyObservers() {
		setChanged();
		super.notifyObservers();
	}
	
	
	
	
}
