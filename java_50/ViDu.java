package java_50;

public class ViDu {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "HeLLo";
		String s3 = "hello";
		
		// equals => so sanh chuoi, phan biet hoa thuong
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s2: " + s1.equals(s3));
		
		// equalsIgnoreCase => khong phan biet hoa thuong
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s3));
		
		// compareTo => so sanh > < =
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
		// compareTOIgnoreCase => so sanh, khong phan biet hoa thuong
		
		// regionMatches
		String r1 = "Hellohihi";
		String r2 = "ihi";
		boolean check = r1.regionMatches(6, r2, 0, 3);
		// so sanh r1 tu ki tu thu 6; tu chuoi r2, bat dau tu vi tri 0, 3 ki tu
		System.out.println(check);
		
		// startWith => Ham kiem tra chuoi bat dau bang ....
		String sdt = "037456789";
		System.out.println(sdt.startsWith("034"));
		System.out.println(sdt.startsWith("037"));
		
		// endsWith => Ham kiem tra chuoi ket thuc bang ...
		String tenFile1 = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		
		if (tenFile1.endsWith(".JPG")) {
			System.out.println("File 1 la hinh anh");
		} else if (tenFile1.endsWith(".PDF")) {
			System.out.println("File 1 la PDF");
		}
		
		if (tenFile2.endsWith(".JPG")) {
			System.out.println("File 2 la hinh anh");
		} else if (tenFile2.endsWith(".PDF")) {
			System.out.println("File 2 la PDF");
		}
		
	}
}

//	OUTPUT
//
//s1 equals s2: false
//s1 equals s2: true
//s1 equalsIgnoreCase s2: true
//s1 equalsIgnoreCase s2: true
//sv1 compareTo sv2: -1
//sv1 compareTo sv3: 2
//sv1 compareTo sv4: 0
//true
//false
//true
//File 1 la hinh anh
//File 2 la PDF
