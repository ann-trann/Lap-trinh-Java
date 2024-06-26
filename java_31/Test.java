package java_31;

public class Test {

	public static void main(String[] args) {
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyen", 100, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Truong Nguyen", 200, 5.5);
		System.out.println("Tong tien HoaDon1: " + hd1.tinhTongTien());
		System.out.println("Tong tien HoaDon2: " + hd2.tinhTongTien());
		System.out.println("Kiem tra khoi luong > 2kg " + hd1.ktraKLuongLonHon(2));
		System.out.println("Kiem tra khoi luong > 1kg " + hd1.ktraKLuongLonHon(1));
		System.out.println("Kiem tra tong tien > 500K " + hd1.ktrTongTienLonHon500K());
		
		System.out.println("Giam gia cua HoaDon1: " + hd1.giamGia(10));
		System.out.println("Giam gia cua HoaDon2: " + hd2.giamGia(10));
		
		System.out.println("So tien con lai cua HoaDon1: " + hd1.giaSauKhiGiam(10));
		System.out.println("So tien con lai cua HoaDon2: " + hd2.giaSauKhiGiam(10));
	}
	
	

}
