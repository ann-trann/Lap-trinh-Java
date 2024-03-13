package java_69;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx) {
		if (fx.isFile()) {
			// Xoa neu la tap tin
			System.out.println("Da xoa: " + fx.getAbsolutePath() );
			fx.delete();
		} 
		else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				// Xoa cac file con
				xoaFile(f);
			}
			// Xoa ban than thu muc sau khi da xoa cac file con
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		}
	}

	public static void xoaFile2(File fx) {
		if (fx.isFile()) {
			System.out.println("File da xoa: " + fx.getAbsolutePath());
			try {
				Files.deleteIfExists(fx.toPath());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		else if (fx.isDirectory()) {
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				xoaFile2(f);
			}
			System.out.println("FIle da xoa: " + fx.getAbsolutePath());
		}
		try {
			Files.deleteIfExists(fx.toPath());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static void main(String[] args) {
		File f0 = new File("D:\\java\\java_69\\F0");
		File f0_1 = new File("D:\\java\\java_69\\F0_1");
		File f_vidu = new File("D:\\java\\java_69\\ViDu.txt");
		
		/*
		f0.deleteOnExit(); // Xoa khong duoc vi co thu muc va tap tin
		f0_1.deleteOnExit(); // Xoa duoc vi la thu muc rong
		f_vidu.deleteOnExit(); // Xoa duoc vi la tap tin
		System.out.println(f0_1.delete());
		
		ViDuXoaFile.xoaFile(f0);
		*/
		
		
		// Su dung class Files xoa tap tin va thu muc
// loi, khong de null duoc
//		Path p0 = FileSystems.getDefault().getPath(null, "D:\\java\\java_69\\F0");
//		Path p0_1 = FileSystems.getDefault().getPath(null, "D:\\java\\java_69\\F0_1");
//		Path p_vidu = FileSystems.getDefault().getPath(null, "D:\\java\\java_69\\ViDu.txt");
		
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
		
		
		try {
//			Files.deleteIfExists(p0); // khong xoa duoc vi co file
			ViDuXoaFile.xoaFile2(f0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//	OUTPUT
//
//Da xoa: D:\java\java_69\F0\F1\F2\123.txt
//Da xoa: D:\java\java_69\F0\F1\F2\abc.doc
//Da xoa: D:\java\java_69\F0\F1\F2
//Da xoa: D:\java\java_69\F0\F1
//Da xoa: D:\java\java_69\F0
