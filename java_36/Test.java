package java_36;

public class Test {

	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(15, 5, 2022);
		NgayChieu ngay2 = new NgayChieu(31, 1, 2025);
		NgayChieu ngay3 = new NgayChieu(22, 9, 2030);
		
		HangSanXuat hang1 = new HangSanXuat("Hang A", "Vietnam");
		HangSanXuat hang2 = new HangSanXuat("Hang B", "My");
		HangSanXuat hang3 = new HangSanXuat("Hang C", "Anh");
		
		BoPhim phim1 = new BoPhim("Dao", 2023, hang1, 450, ngay1);
		BoPhim phim2 = new BoPhim("Mai", 2024, hang2, 650, ngay2);
		BoPhim phim3 = new BoPhim("Dune", 2021, hang3, 355, ngay3);
		
		System.out.println("SS gia ve phim 1 re hon 2: " + phim1.ktraGiaVeReHon(phim2));
		System.out.println("SS gia ve phim 3 re hon 2: " + phim3.ktraGiaVeReHon(phim2));
		
		System.out.println("Ten hang san xuat bo phim 3: " + phim3.layTenHangSX());
		
		System.out.println("Phim 1 sau khi giam 10%: " + phim1.giaSauKhuyenMai(10));
		System.out.println("Phim 1 sau khi giam 20%: " + phim2.giaSauKhuyenMai(20));
		System.out.println("Phim 1 sau khi giam 50%: " + phim3.giaSauKhuyenMai(50));
	}

}

//	OUTPUT
//SS gia ve phim 1 re hon 2: true
//SS gia ve phim 3 re hon 2: true
//Ten hang san xuat bo phim 3: Hang C
//Phim 1 sau khi giam 10%: 405.0
//Phim 1 sau khi giam 20%: 520.0
//Phim 1 sau khi giam 50%: 177.5
