package test;

public class Q2 {

	public static void main(String[] args) {
		MaxLimitValclator c = new MaxLimitValclator();
		c.add(50);
		c.add(70);
		System.out.println(c.getValue());
	}

}

class Calculator1{
	int v;
	
	Calculator1(){
		this.v = 0;
	}
	
	void add(int n) {
		this.v += n;
	}
	
	int getValue() {
		return this.v;
	}
}

class MaxLimitValclator extends Calculator1{
	void add(int n) {
		this.v += n;
		if(this.v >= 100) {
			this.v = 100;
		}
	}
	
	int getValue() {
		return this.v;
	}
}