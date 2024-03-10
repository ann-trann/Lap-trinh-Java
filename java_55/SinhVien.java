package java_55;

public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoTen;
	private String tenLop;
	private double diemTrungBinh;
	public SinhVien(int maSinhVien, String hoTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getTen() {
		String s = this.hoTen.trim();
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}
		else {
			return s;
		}
	}

	@Override
	public int compareTo(SinhVien o) {
		// <0
		// =0
		// >0
		//return this.maSinhVien - o.maSinhVien;
		
		// Dua tren so sanh ten: Adam, Obama, Nguyen Van A, Tran Thi Hoa
		String tenThis = this.getTen();
		String ten0 = o.getTen();
		
		return tenThis.compareTo(ten0);
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	
	
	
}
