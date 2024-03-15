package java_78;

import javax.swing.JFrame;;

public class ViDu {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		// Gan ten
		jf.setTitle("Vi Du JFrame");
		// Gan kich co
		jf.setSize(600, 400);
		
//		while (true) {
//			System.out.println("Running...");
//		}
		
		// Gan vi tri hien thi
		jf.setLocation(300, 300);
		
		
		// Thoat khoi chuong trinh khi dong cua so
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Cho phep hien thi
		jf.setVisible(true);

	}

}
