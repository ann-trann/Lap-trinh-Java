package java_35;

public class Test {

	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(15, 5, 2030);
		Ngay ngay3 = new Ngay(15, 5, 2025);
		
		TacGia tacGia1 = new TacGia("Nguyen Nhat Anh", ngay1);
		TacGia tacGia2 = new TacGia("Nam Cao", ngay2);
		TacGia tacGia3 = new TacGia("Nguyen Tuan", ngay3);
		
		Sach sach1 = new Sach("Mang may tinh", 200, 2021, tacGia1);
		Sach sach2 = new Sach("He dieu hanh", 500, 2019, tacGia2);
		Sach sach3 = new Sach("Co so du lieu", 700, 2021, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sanh Nam XB sach 1 va 3: " +
							sach1.kiemTraCungNam(sach3));
		System.out.println("So sanh Nam XB sach 2 va 3: " +
				sach2.kiemTraCungNam(sach3));
		
		System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 20%: " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 50%: " + sach3.giaSauKhiGiam(50));
	}
}


//	OUTPUT:
//Mang may tinh
//He dieu hanh
//Co so du lieu
//So sanh Nam XB sach 1 va 3: true
//So sanh Nam XB sach 2 va 3: false
//Sach 1 giam 10%: 180.0
//Sach 2 giam 20%: 400.0
//Sach 3 giam 50%: 350.0

