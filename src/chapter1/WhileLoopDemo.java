package chapter1;

import java.io.*;

public class WhileLoopDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\softwares\\sts-4.32.0.RELEASE\\configuration\\1763224683487.log");
			
			FileInputStream fin = new FileInputStream(f);
			
			int x;
			
			while((x=fin.read()) != -1) { // read characters ascii value  ( -1 != -1  , -1 == -1)
				
				char c = (char)x;  // char c = (char)84;
				
				System.out.print(c); // T
			}
			
			
		}catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
