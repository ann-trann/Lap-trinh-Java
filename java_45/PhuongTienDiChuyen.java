package java_45;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSX;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSX = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	
	public HangSanXuat getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}

	public String layTenHangSanXuat() {
		return this.hangSX.getTenHangSX();
	}
	
	public void batDau() {
		System.out.println("Bat dau ...");
	}
	
	public void tangToc() {
		System.out.println("Tang toc ...");
	}
	
	public void dungLai() {
		System.out.println("Dung lai ...");
	}
	
	public abstract double layVanToc();
}
