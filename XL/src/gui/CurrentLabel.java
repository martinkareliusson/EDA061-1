package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class CurrentLabel extends ColoredLabel implements Observer {
	CurrentSlot cs;
	Controller c;
	
    public CurrentLabel(CurrentSlot cs, Controller c) {
        super("A1", Color.WHITE);
        this.cs = cs;
        c.addObserver(this);
        
    }

	@Override
	public void update(Observable arg0, Object arg1) {
		setText(cs.getName());
		
	}
}