package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\java\\java_73\\file.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien st = new SinhVien("001", "Hello", 2000, 10);
			oos.writeObject(st);
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			
		}

	}

}
