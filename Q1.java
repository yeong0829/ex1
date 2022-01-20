package test;

public class Q1 {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10);
		c.minus(7);
		System.out.println(c.getValue());
	}

}

class Calculator{
	int v;
	
	Calculator(){
		this.v = 0;	
	}
	
	void add(int n) {
		this.v += n;
	}

	int getValue() {
		return this.v;
	}
	
	void minus(int n) {
		this.v -= n;
	}
	
}
