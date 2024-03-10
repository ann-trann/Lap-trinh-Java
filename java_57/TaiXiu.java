package java_57;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

/*
 * Mot nguoi choi se co tai khoan. Nguoi choi co quyen dat cuoc so tien it hon hoac bang so tien ho dang co
 * Luat choi:
 * Co 3 vien xuc xac. Moi vien co 6 mat co gia tri tu 1 den 6.
 * Moi lan lac se ra mot ket qua. Ket qua = gia tri xx1 + gia tri xx2 + gia tri xx3
 * 1. Neu tong = 3 hoac 18 => Cai an het, nguoi choi thua.
 * 2. Neu tong = (4->10) <-> xiu => neu nguoi choi dat xiu thi nguoi choi thang, nguoc lai thua
 * 3. Neu tong = (11-17) <-> tai => neu nguoi choi dat tai thi nguoi choi thang, nguoc lai thua 
 */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000.99;
		Scanner sc = new Scanner(System.in);
		
		// format tien te theo quoc gia
//		Locale lc = new Locale("vi", "VN");
//		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);	
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		
		// bat dau
		int luaChon = 1;
		do {
			System.out.println("----------- MOI BAN LUA CHON ----------");
			System.out.println("Chon (1) de tiep tuc choi.");
			System.out.println("Chon (bat ky) de thoat");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("*** BAT DAU CHOI ***");
				
				// dat cuoc
				System.out.println("****** Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi) + " , ban muon cuoc bao nhieu?");
				double datCuoc = 0;
				do {
					System.out.println("****** Dat cuoc (0 < so tien cuoc <= " + numf.format(taiKhoanNguoiChoi) + "): ");
					datCuoc = sc.nextDouble();
				} while(datCuoc<=0 || datCuoc>taiKhoanNguoiChoi);
				
				
				// chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("****** Chon 1 <-> Tai hoac 2 <-> Xiu:");
					luaChonTaiXiu = sc.nextInt();
				} while(luaChonTaiXiu!=1 && luaChonTaiXiu!=2);
				
				
				// tung xuc xac
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(5)+1;
				int giaTri2 = xucXac2.nextInt(5)+1;
				int giaTri3 = xucXac3.nextInt(5)+1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				
				
				// tinh toan ket qua
				System.out.println("****** Ket qua: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("****** Tong la: " + tong + " => Nha cai an het, ban da thua!");
					System.out.println("****** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));					
				}
				else if (tong >= 4 && tong <= 10) {
					System.out.println("****** Tong la: " + tong + " => Xiu");
					if (luaChonTaiXiu == 2) {
						System.out.println("****** Ban da thang cuoc");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Ban da thua cuoc");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
					}
				}
				else {
					System.out.println("****** Tong la: " + tong + " => Tai");
					if (luaChonTaiXiu == 1) {
						System.out.println("****** Ban da thang cuoc");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("****** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("****** Ban da thua cuoc");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("****** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
					}
				}
				
			}
		} while(luaChon == 1);
		
		System.out.println("Da thoat!");
	}
}
