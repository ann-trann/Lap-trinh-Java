package java_39;

public class ConNguoi {
	private String hoTen;
	private int namSinh;
	
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
		System.out.println("mam mam");
	}
	public void uong() {
		System.out.println("uc uc");
	}
	public void ngu() {
		System.out.println("kho kho");
	}
}
