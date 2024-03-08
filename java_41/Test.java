package java_41;

public class Test {

	public static void main(String[] args) {
		NguoiVietNam vn = new NguoiVietNam("Nam", 2003);
		NguoiMy my = new NguoiMy("Jackson", 2005);
		NguoiTrungQuoc tq = new NguoiTrungQuoc("yang", 2001);
		
		vn.xinChao();
		my.xinChao();
		tq.xinChao();
	}

}
