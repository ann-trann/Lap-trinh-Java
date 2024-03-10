package java_55;

import  java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van An", "Lop 2", 8);
		SinhVien sv4 = new SinhVien(199, "Nguyen Van Binh", "Lop 2", 8);
		
		SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};
		
		System.out.println("Ban dau: " + Arrays.toString(a_sv));
		
		// Ham sap xep
		Arrays.sort(a_sv);
		System.out.println("Sau khi sap xep: " + Arrays.toString(a_sv));
		
		// Tim kiem
		System.out.println("Tim kiem sinh vien 1: " + Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tim kiem sinh vien 4: " + Arrays.binarySearch(a_sv, sv4));
		
	}
}

//	OUTPUT
//
//Ban dau: [SinhVien [maSinhVien=150, hoTen=Tran Van Thanh, tenLop=Lop 1, diemTrungBinh=9.0], SinhVien [maSinhVien=100, hoTen=Nguyen Thi Thanh Hoa, tenLop=Lop 2, diemTrungBinh=8.0], SinhVien [maSinhVien=199, hoTen=Nguyen Van An, tenLop=Lop 2, diemTrungBinh=8.0]]
//Sau khi sap xep: [SinhVien [maSinhVien=199, hoTen=Nguyen Van An, tenLop=Lop 2, diemTrungBinh=8.0], SinhVien [maSinhVien=100, hoTen=Nguyen Thi Thanh Hoa, tenLop=Lop 2, diemTrungBinh=8.0], SinhVien [maSinhVien=150, hoTen=Tran Van Thanh, tenLop=Lop 1, diemTrungBinh=9.0]]
//Tim kiem sinh vien 1: 2
//Tim kiem sinh vien 4: -2

