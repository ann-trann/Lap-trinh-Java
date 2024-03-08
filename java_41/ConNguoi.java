package java_41;

public class ConNguoi {
	protected String hoTen;
	protected int namSinh;
	public ConNguoi(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void an() {
		System.out.println("Mam mam");
	}
	public void ngu() { 
		System.out.println("Zzzzzzz");
	}
}
