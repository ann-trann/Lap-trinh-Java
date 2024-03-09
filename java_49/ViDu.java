package java_49;

import java.util.Scanner;

public class ViDu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("--------");
		
		// length()
		System.out.println(s.length());
		int doDai = s.length();
		// charAt(position)
		for (int i = 0; i < doDai; i++) {
			System.out.println("Vi tri " + i + " la: " + s.charAt(i));
		}
		
		// getChars(start_pos, end_pos, save_char_arr, start_save_pos) 
		char[] arrayChar = new char[10];
		s.getChars(2, 5, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Gia tri cua mang tai " + i + " la: " + arrayChar[i]);
		}
		
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
		
	}

}
