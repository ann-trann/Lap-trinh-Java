package java_45;

public class Test {

	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Hang 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hang 3", "Nhat Ban");
		
		MayBay p1 = new MayBay(h1, "Xang");
		PhuongTienDiChuyen p2 = new XeOto(h2, "Xang");
		PhuongTienDiChuyen p3 = new XeDap(h3);
		
		System.out.println("Lay hang san xuat");
		System.out.println("p1: " + p1.layTenHangSanXuat());
		
		System.out.println("Bat dau: ");
		p2.batDau();
		
		System.out.println("Lay van toc: ");
		System.out.println("p1: " + p1.layVanToc());
		System.out.println("p2: " + p2.layVanToc());
		System.out.println("p3: " + p3.layVanToc());
		
		System.out.println("Cat canh: ");
		p1.catCanh();
	}

}

//	OUTPUT:
//Lay hang san xuat
//p1: Hang 2
//Bat dau: 
//Bat dau ...
//Lay van toc: 
//p1: 500.0
//p2: 150.0
//p3: 20.0
//Cat canh: 
//Cat canh

