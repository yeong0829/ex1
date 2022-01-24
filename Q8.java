package test;

import java.io.*;

public class Q8 {

	public static void main(String[] args) throws IOException {
		 FileWriter fw = new FileWriter("sample.txt");
	     fw.write("Write once, run anywhere");
	     //fw.close();
	     
	     BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
	     
	     String line = br.readLine();
	     System.out.println(line);  
//	     br.close();
	}

}
