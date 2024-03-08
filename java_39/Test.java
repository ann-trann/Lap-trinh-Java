package java_39;

public class Test {

	public static void main(String[] args) {
		ConNguoi cn = new ConNguoi("Human", 2021);	
		cn.an();
		cn.uong();
		cn.ngu();
		
		SinhVien sv = new SinhVien("Student", 2021, "Lop 1", "Truong 1");
		sv.an();
		sv.uong();
		sv.ngu();
		sv.lamBaiTap();
		
	}

}
