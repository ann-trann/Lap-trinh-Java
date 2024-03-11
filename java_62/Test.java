package java_62;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push("giatri") => dua gia tri vao stack
//		stackChuoi.pop() => lay gia tri ra, xoa khoi stack
//		stackChuoi.peek() => lay gia tri ra, nhung khong xoa khoi stack
//		stackChuoi.clear() => xoa tat ca phan tu trong stack
//		stackChuoi.contains("giatri") => xac dinh phan tu co trong stack hay khong
//		stackChuoi.size() => do lon cua stack
		
		
		// Vi du dao nguoc chuoi
		System.out.println("Nhao vao chuoi: ");
		String s = sc.nextLine();
		// Hello
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
		System.out.println("Chuoi dao nguoc");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		
		
		// Vi du chuyen tu he thap phan sang he nhi phan
		Stack<String> stackSoDu = new Stack<String>();
		System.out.println("Nhap 1 so nguyen duong tu ban phim: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu + "");
			x = x / 2;
		}
		int n = stackSoDu.size();
		System.out.println("So nhi phan la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}
		
		
	}

}
