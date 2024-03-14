package main;

import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	// 1.	Them sinh vien vao danh sach.
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2.	In danh sach sinh vien ra man hinh.
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
	// 3.	Kiem tra danh sach co rong hay khong.
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	
	// 4.	Lay ra so luong sinh vien trong danh sach.
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	
	// 5.	Lam rong danh sach sinh vien.
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	
	// 6.	Kiem tra sinh vien co ton tai trong danh sach, dua tren ma sinh vien.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
	// 7.	Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	
	// 8.	Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.
	public void timSinhVienTheoTen(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	// 9.	Xuat ra danh sach sinh vien co diem tu cao den thap.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				} else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0; 
				}
			}
		});
	}
	
	// 10.	Luu danh sach sinh vien xuong tap tin.
	public void ghiDuLieuXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			for (SinhVien sinhVien : danhSach) {
				oos.writeObject(sinhVien);
			}
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
