package java_51;

public class ViDu {

	public static void main(String[] args) {
		String s1 = "Xin chao co chu, xin chao cac ban, Xin chao!";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'o';
		
		// indexOf
		System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2));
		System.out.println("Vi tri cua s3 trong s1 la: " + s1.indexOf(s3));
		
		// Su dung vi tri bat dau
		System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2, 2)); // vi tri bat dau la 2
		
		// Tim kiem char
		System.out.println("Vi tri cua c1 trong s1 la: " + s1.indexOf(c1));
		System.out.println("Vi tri cua c1 trong s1 la: " + s1.indexOf(c1, 20));
		
		// lastIndexOf => tim kiem tu phai sang trai
		System.out.println("Vi tri cua s2 trong s1 (tu phai sang trai) la: " + s1.lastIndexOf(s2));
		
		//tenFile = "Bai tap.excel.lop12.xls";

	}

}
