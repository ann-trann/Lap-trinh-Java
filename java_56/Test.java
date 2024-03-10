package java_56;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s1  = "Xin chao cac ban, minh hoc code Java";
		String[] a = s1.split(" ");
		System.out.println(Arrays.toString(a));
		String[] b = s1.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la IT. Minh hoc code Java";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyen Van Thanh";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Ten: " + d[d.length-1]);

	}

}

//	OUTPUT
//
//[Xin, chao, cac, ban,, minh, hoc, code, Java]
//[Xin chao cac ban,  minh hoc code Java]
//[Xin chao,  minh la IT,  Minh hoc code Java]
//[Nguyen, Van, Thanh]
//Ten: Thanh