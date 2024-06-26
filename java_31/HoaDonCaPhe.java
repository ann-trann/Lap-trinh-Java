package java_31;

public class HoaDonCaPhe {
	public String tenLoaiCaPhe;
	public double giaTien1Kg;
	public double khoiLuong;
	
	
	public HoaDonCaPhe(String ten, double gia, double kluong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kluong;
	}
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	public boolean ktraKLuongLonHon(double kl) {
//		if (this.khoiLuong > kl) {
//			return true;
//		} else {
//			return false;
//		}
		return this.khoiLuong > kl;
	}
	public boolean ktrTongTienLonHon500K() {
		return this.tinhTongTien() > 500;
	}
	public double giamGia(double phanTram) {
		if (this.ktrTongTienLonHon500K() == true) {
			return this.tinhTongTien() * phanTram / 100;
		}
		else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
}
