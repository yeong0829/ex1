package test;

public class Q4 {

	public static void main(String[] args) {
		 Calculator3 c = new Calculator3();
		 
		 int[] n = {3, 6, 5, 7, 2};
		 int result = c.avg(n);
		 System.out.println(result);
	}
}


class Calculator3 {
    int v;

    Calculator3() {
        this.v = 0;
    }

    void add(int n) {
        this.v += n;
    }

    int getValue() {
        return this.v;
    }
    int avg(int[] n) {
        int total = 0;
        for (int num : n) {
            total += num;
        }
        return total / n.length;
    }
}
