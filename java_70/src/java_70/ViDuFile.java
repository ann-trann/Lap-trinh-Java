package java_70;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class ViDuFile {
	
	public static void copyAll(File f1, File f2) {
		try {
			// Copy ban than no
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f1.isDirectory()) {
			// Copy cac tap tin va thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
				copyAll(file, file_new);
			}
		}
	}
	

	public static void main(String[] args) {
		File f0 = new File("D:\\java\\java_70\\File_1.txt");
		File f1 = new File("D:\\java\\java_70\\File_2.txt");
		File f2 = new File("D:\\java\\java_70\\File_2xyz.txt");
		
//		// 1. Thay doi ten tap tin hoac thu muc
//		// Su dung File de thay doi ten
//		f0.renameTo(f1);
		
//		// Su dung Files de thay doi ten
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		// 2. Di chuyen File   // Di chuyen duoc con ben trong
//		File f2_new = new File("D:\\java\\java_70\\F0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		// 3. Copy File   // Khong copy duoc con ben trong
		File f_0 = new File("D:\\java\\java_70\\F0");
		File f_0_copy = new File("D:\\java\\java_70\\F0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		ViDuFile.copyAll(f_0, f_0_copy);
		
		

	}

}
