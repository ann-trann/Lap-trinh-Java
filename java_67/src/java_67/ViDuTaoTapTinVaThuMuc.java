package java_67;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {

	public static void main(String[] args) {
//		Luu y:
//		MS Windows: \ => \\ | Vi du: "C:\\Folder1\\Folder2\\File.xxx"
//		Linux, MacOS: / | Vi du: "/Folder/Folder/File.xxx"
		
		
		// Kiem tra thu muc hoac tap tin co ton tai
		File folder1 = new File("D:\\java\\java_67");
		File folder2 = new File("D:\\java\\java_1");
		System.out.println("Kiem tra folder1 co ton tai: " + folder1.exists());
		System.out.println("Kiem tra folder2 co ton tai: " + folder2.exists());
		
		
		// Tao thu muc
		// Phuong thuc mkdir() => tao 1 thu muc
		File d1 = new File("D:\\java\\java_67\\Directory_1");
		d1.mkdir();
		
		// Phuong thuc mkdirs() => tao nhieu thu muc cung luc
		File d2 = new File("D:\\java\\java_67\\Directory_1\\Directory_2\\Directory_3");
		d2.mkdirs();
		
		// Tao tap tin (co phan mo rong: .exe, .txt, .doc, .xls ....)
		File file1 = new File("D:\\java\\java_67\\Directory_1\\Vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// Khong co quyen tao tap tin
			// O cung bi day
			// Duong dan sai
			e.printStackTrace();
		}
		
	}
}
