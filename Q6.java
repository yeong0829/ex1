package test;

public class Q6 {

	public static void main(String[] args) {
		 Calculator4 c = new Calculator4();
	     c.add(3);  
	     System.out.println(c.getValue());
	}
}

class Calculator4 {
    int v;

    Calculator4() {
        this.v = 0;
    }

    void add(int n) {
        this.v += n;
    }

    public Integer getValue() {
        return this.v;
    }
}
