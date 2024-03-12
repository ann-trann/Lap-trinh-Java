package java_63;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {

	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		
		danhSachSV.offer("Hello 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen van B");
		danhSachSV.offer("Hello 2");
		
		while (true) {
			String ten = danhSachSV.poll(); // => lay ra va xoa
			// peek => lay ra nhung khong xoa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}

}
