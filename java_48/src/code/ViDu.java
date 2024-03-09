package code;

public class ViDu {
	private Infor infor;
	
	public void method() {
//		this.infor.a => khong truy xuat duoc
		this.infor.b = 2; // => truy cap duoc
		this.infor.c = 3; // => truy cap duoc
		this.infor.d = 4;
	}
}
