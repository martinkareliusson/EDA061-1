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

	@Override
	public String toString(Environment env) {
		// TODO Auto-generated method stub
		return expr.toString();
	}
	
	public String stringSavedSlot(){
		return expr.toString();
	}

	
	public String representation(Environment env) {
		// TODO Auto-generated method stub
		return Double.toString(getValue(env));
	}

	@Override
	public String commentValue() {
		return null;
	}

	public String printString() {
		return expr.toString();
	}

}
