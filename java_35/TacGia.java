package java_35;

public class TacGia {
	private String tenTacGia;
	private Ngay ngaysinh;
	
	public TacGia(String tenTG, Ngay ngsinh) {
		this.tenTacGia = tenTG;
		this.ngaysinh = ngsinh;
	}

	
	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public Ngay getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Ngay ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	
}
