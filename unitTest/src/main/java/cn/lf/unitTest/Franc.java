package cn.lf.unitTest;

public class Franc extends Money{
	
	public Franc(int amount) {
		this.amount = amount;
	}
	
	Franc times(int mulitiplier) {
		
		return new Franc(amount * mulitiplier);
	}
	
	

}
