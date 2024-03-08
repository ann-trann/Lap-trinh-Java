package java_35;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	
	public Sach(String tenS, double gia, int nam, TacGia tacgia) {
		this.tenSach = tenS;
		this.giaBan = gia;
		this.namXuatBan = nam;
		this.tacGia = tacgia;
	}
	
	
	public String getTenSach() {
		return tenSach;
	}


	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}


	public double getGiaBan() {
		return giaBan;
	}


	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}


	public int getNamXuatBan() {
		return namXuatBan;
	}


	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}


	public TacGia getTacGia() {
		return tacGia;
	}


	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}


	
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	public boolean kiemTraCungNam(Sach other) {
		return this.namXuatBan == other.namXuatBan;
	
	}
	public double giaSauKhiGiam(double x) {
		return this.giaBan * (1-x/100);
	}
}
