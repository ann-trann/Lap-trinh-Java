package java_39;

public class SinhVien extends ConNguoi{
	private String tenLop, tenTruong;

	public SinhVien(String hoTen, int namSinh, String tenLop, String tenTruong) {
		super(hoTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}
	
	
	
	public String getTenLop() {
		return tenLop;
	}



	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}



	public String getTenTruong() {
		return tenTruong;
	}



	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}



	public void lamBaiTap() {
		System.out.println("... ... ...");
	}
}
