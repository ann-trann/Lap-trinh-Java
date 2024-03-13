package java_71;

import java.io.PrintWriter;

public class ViDuGhiText {

	public static void main(String[] args) {
//		PrintWriter pw = new PrintWriter(System.out); // ghi ra console
		try {
			PrintWriter pw = new PrintWriter("D:\\java\\java_71\\file.txt", "UTF-8");
			pw.println("Xin chao, minh la coder");
			pw.print("Du lieu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.println(" la so PI");
			
			Student st = new Student(100, "Nguyen Van A");
			pw.println(st);
			
			pw.println();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
