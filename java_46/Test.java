package java_46;

public class Test {

	public static void main(String[] args) {
		System.out.println("	Test cau a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
		
		System.out.println("5+3 = " + mfx500.cong(5, 3));
		System.out.println("4*5 = " + mvn500.nhan(4, 5));
		System.out.println("4/0 = " + mvn500.chia(4, 0));

		
		System.out.println("\n	Test cau b: ");
		double[] arr1 = new double[] {5,1,3,4,5,8,0};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.sapxepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n");
		sxchon.sapxepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		System.out.println("\n\n	Test cau c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("3+5 = " + pmmt.cong(3, 5));
		double[] arr3 = new double[] {7,4,1,8,0,5,3};
		pmmt.sapxepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}


//	OUTPUT:
//
//Test cau a: 
//5+3 = 8.0
//4*5 = 20.0
//4/0 = Infinity
//
//Test cau b: 
//0.0 1.0 3.0 4.0 5.0 5.0 8.0 
//9.0 7.0 6.0 5.0 4.0 2.0 2.0 
//
//Test cau c: 
//3+5 = 8.0
//0.0 1.0 3.0 4.0 5.0 7.0 8.0 

