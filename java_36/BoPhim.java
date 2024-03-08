package java_36;

public class BoPhim {
	private String tenPhim;
	private int namSX;
	private HangSanXuat hangSX;
	private int giaVe;
	private NgayChieu ngayChieu;
	
	public BoPhim(String ten, int nam, HangSanXuat hang, int gia, NgayChieu ngay) {
		this.tenPhim = ten;
		this.namSX = nam;
		this.hangSX = hang;
		this.giaVe = gia;
		this.ngayChieu = ngay;
	}
	

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public HangSanXuat getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}

	public int getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}

	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	
	public boolean ktraGiaVeReHon(BoPhim other) {
		return this.giaVe < other.giaVe;
	}
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
	public double giaSauKhuyenMai(double x) {
		return this.giaVe * (1-x/100);
	}
	
}
