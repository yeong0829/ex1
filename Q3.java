package test;

public class Q3 {
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		System.out.println(c.isOdd(3));
	}
}

class Calculator2{
	int v;

	public Calculator2() {
		this.v = 0;
	}
	
	void add(int n) {
		this.v += n;
	}
	
	int getValue() {
		return this.v;
	}
	
	boolean isOdd(int n) {
		 return n % 2 == 1;
	}
}
