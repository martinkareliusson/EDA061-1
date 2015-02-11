package model;

import expr.*;
import util.*;

public class SlotFactory {
	public Slot build(String s) {
		ExprParser pars = new ExprParser();
		if (s.length() > 0) {
			if (s.charAt(0) == '#') {
				return new CommentSlot(s);
			} else {
				try {
					return new ExprSlot(pars.build(s));
				} catch (Exception e) {
					throw new XLException("Invalid input");
				}
			}
		}
		return null;
	}
}
