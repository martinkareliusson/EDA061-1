package gui;

import java.util.*;

public class Controller extends Observable implements Observer {
	ArrayList<Observer> list = new ArrayList<Observer>();

	@Override
	public void update(Observable o, Object arg) {
		for (Observer ob : list) {
			ob.update(o, arg);
		}

	}

	public void addObserver(Observer o) {
	}

}
// comment test push1