package java_63;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {

	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		
		danhSachSV.offer("Hello 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Hello 2");
		danhSachSV.offerLast("Hello 3");
		danhSachSV.offerFirst("Hello 4");
		
		while (true) {
			String ten = danhSachSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}

}
