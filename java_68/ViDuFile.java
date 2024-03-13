package java_68;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;		
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}
	
	public boolean kiemtraThucThi() {
		// Kiem tra file co the thuc thi
		return this.file.canExecute();
	}
	
	public boolean kiemTraDoc() {
		// Kiem tra file co the doc
		return this.file.canRead();
	}
	
	public boolean kiemTraGhi() {
		// Kiem tra file co the ghi
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTen() {
		System.out.println(this.file.getName());
	}
	
	public void kiemTraLaThuMucHayTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("Day la thu muc.");
		}
		else if (this.file.isFile()) {
			System.out.println("Day la tap tin.");
		}
	}
	
	public void inDanhSachFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Cac tap tin con / thu muc con la: ");
			File[] mangCon = this.file.listFiles(); 
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("Day la tap tin, khong co file con ben trong.");
		}
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}
	
	public void inChiTietCayThuMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
			
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac+1);
			}				
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhap ten file: ");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU");
			System.out.println("1. Kiem tra file co the thuc thi \n"
					+ "2. Kiem tra file co the doc \n"
					+ "3. Kiem tra file co the ghi \n"
					+ "4. In duong dan \n"
					+ "5. In ten file \n"
					+ "6. Kiem tra file la thu muc hay tap tin \n"
					+ "7. In ra danh sach cac file con \n"
					+ "8. In ra cay thu muc \n"
					+ "0. Thoat chuong trinh.");
			luaChon = sc.nextInt();
			
			switch (luaChon) {
			case 1:
				System.out.println(vdf.kiemtraThucThi());
				break;
			case 2:
				System.out.println(vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println(vdf.kiemTraGhi());
				break;
			case 4:
				vdf.inDuongDan();
				break;
			case 5:
				vdf.inTen();
				break;
			case 6:
				vdf.kiemTraLaThuMucHayTapTin();
				break;
			case 7:
				vdf.inDanhSachFileCon();
			case 8:
				vdf.inCayThuMuc();
				break;
			default:
				break;
			}
			sc.nextLine();
		} while (luaChon != 0);
		
	}

}

//	OUTPUT
//
//Nhap ten file: 
//D:\java\java_68
//--------------------------------------
//MENU
//1. Kiem tra file co the thuc thi 
//2. Kiem tra file co the doc 
//3. Kiem tra file co the ghi 
//4. In duong dan 
//5. In ten file 
//6. Kiem tra file la thu muc hay tap tin 
//7. In ra danh sach cac file con 
//8. In ra cay thu muc 
//0. Thoat chuong trinh.
//8
//	|__java_68
//		|__.classpath
//		|__.project
//		|__.settings
//			|__org.eclipse.core.resources.prefs
//			|__org.eclipse.jdt.core.prefs
//		|__bin
//			|__java_68
//				|__ViDuFile.class
//			|__module-info.class
//		|__src
//			|__java_68
//				|__ViDuFile.java
//			|__module-info.java
