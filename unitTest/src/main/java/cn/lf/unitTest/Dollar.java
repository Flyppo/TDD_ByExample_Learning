package cn.lf.unitTest;

public class Dollar {
	int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int mulitiplier) {
		
		return new Dollar(amount * mulitiplier);
	}
}
