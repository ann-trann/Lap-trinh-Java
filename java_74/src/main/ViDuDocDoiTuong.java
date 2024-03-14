package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\java\\java_74/file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv.getDiemTrungBinh());
			System.out.println(sv);
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
