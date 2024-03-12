package java_65;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> data = new TreeMap<String, String>();
//	private Map<String, String> data = new HashMap<String, String>();
	
	
	public String themTu(String tuKhoa, String yNghia) {
		return this.data.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.data.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa) {
		String yNghia = this.data.get(tuKhoa);
		return yNghia;
	}
	
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int laySoLuong() {
		return this.data.size();
	}
	
	public void xoaTatCa() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do {
			System.out.println("---------------------------------");
			System.out.println("MENU");
			System.out.println("Tra tu dien Anh - Viet: \n"
					+ "1. Them tu (Tu khoa, Y nghia)\n"
					+ "2. Xoa tu\n"
					+ "3. Tra tu\n"
					+ "4. In danh sach tu khoa\n"
					+ "5. In ra so luong tu\n"
					+ "6. Xoa tat ca cac tu\n"
					+ "0. Thoat.");
			luaChon = sc.nextInt(); sc.nextLine();
			
			if (luaChon == 1) {
				System.out.println("Nhap vao tu khoa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhap vao y nghia: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			}
			else if (luaChon==2 || luaChon==3) {
				System.out.println("Nhap tu: ");
				String tuKhoa = sc.nextLine();
				if (luaChon == 2) {
					tuDien.xoaTu(tuKhoa);
					System.out.println("Da xoa tu.");
				} else if (luaChon == 3) {
					System.out.println("Y nghia la: " + tuDien.traTu(tuKhoa));
				}
			}
			else if (luaChon == 4) {
				tuDien.inTuKhoa();
			}
			else if (luaChon == 5) {
				System.out.println("So luong tu khoa: " + tuDien.laySoLuong());
			}
			else if (luaChon == 6) {
				tuDien.xoaTatCa();
				System.out.println("Da xoa tat ca cac tu");
			}
		} while (luaChon != 0);
		System.out.println("Da thoat.");
	}

}
