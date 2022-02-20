package test;

public class Q7 {

	public static void main(String[] args) {
		MineralCalculator c = new MineralCalculator();
        c.add(new Gold());
        c.add(new Silver());
        c.add(new Bronze());
        System.out.println(c.getValue()); 
	}
}

class MineralCalculator {
    int v = 0;

    public void add(Mineral m) {
        this.v += m.getValue();
    }

    public int getValue() {
        return this.v;
    }
}

interface Mineral {
    int getValue();
}

class Gold implements Mineral {
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral {
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int getValue() {
        return 80;
    }
}
