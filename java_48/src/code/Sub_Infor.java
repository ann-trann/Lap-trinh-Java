package code;

public class Sub_Infor extends Infor{
	public void method() {
//		super.a => Khong truy cap duoc
		super.b = 2; // => truy cap duoc, vi chung goi
		super.c = 3; // => truy cap duoc
		super.d = 4; // => truy cap duoc
	}
}
