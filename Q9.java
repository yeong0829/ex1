package test;

import java.io.*;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("sample.txt");
        System.out.print("문장 입력:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        fw.write(String.format("%s\n", line));
        fw.close();
	}

}
