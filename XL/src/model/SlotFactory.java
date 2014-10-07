package model;

import expr.*;
import util.*;

public class SlotFactory {
	public Slot build(String s) {
		ExprParser pars = new ExprParser();
		if (s.charAt(0) == '#') {
			CommentSlot slot = new CommentSlot(s);
		} else {
			try {
				ExprSlot slot = new ExprSlot(pars.build(s));
			} catch (Exception e) {
				throw new XLException("Error");
			}
		}
		return null;
	}
}

//commit2
