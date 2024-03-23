package test;

import javax.swing.UIManager;

import view.ViDu;

public class Test {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new ViDu();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
