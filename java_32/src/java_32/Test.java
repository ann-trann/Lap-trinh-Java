package java_32;

public class Test {

	public static void main(String[] args) {
		MyDate md = new MyDate(31, 1, 2021);
		
		System.out.println("Day: " + md.getDay());
		md.setDay(50);
		System.out.println("Day: " + md.getDay());
		md.setDay(20);
		System.out.println("Day: " + md.getDay());
		
		System.out.println("Month: " + md.getMonth());
		md.setMonth(18);
		System.out.println("Month: " + md.getMonth());
		md.setMonth(7);
		System.out.println("Month: " + md.getMonth());

	}

}
