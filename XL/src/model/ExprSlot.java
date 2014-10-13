package model;

import expr.*;

public class ExprSlot implements Slot {
	private Expr expr;

	public ExprSlot(Expr expr) {
		this.expr = expr;
	}

	@Override
	public double getValue(Environment e) {
		return expr.value(e);
	}

	public String parse(Environment e) {
		return new Double(getValue(e)).toString();
	}

	public String toString(Environment e) {
		return expr.toString();
	}

}
