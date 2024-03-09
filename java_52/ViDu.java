package java_52;

public class ViDu {

	public static void main(String[] args) {
		String s1 = "HeLLo";
		String s2 = "hihi";
		
		String s3 = s1 + s2;
		// concat => noi chuoi
		String s4 = s1.concat(s2);
		
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		
		// replace
		String s5 = "Bonjour";
		String s6 = s5.replaceAll("jour", "bon");
		System.out.println("s5 = " + s5);
		System.out.println("s6 = " + s6);
		
		// toLowerCase => chuyen ve viet thuong
		// toUpperCase => chuyen ve viet hoa
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println("s7 = " + s7);
		System.out.println("s8 = " + s8);
		
		// trim() => xoa khoang trang du thua o dau chuoi
		String s9 = "   He nho xin chao cac ban";
		System.out.println("s9 = " + s9.trim());
		
		// subString => cat chuoi con
		String s10 = "He nho xin chao cac ban";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);

	}

}
