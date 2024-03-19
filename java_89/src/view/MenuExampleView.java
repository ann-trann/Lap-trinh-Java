package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// Tao controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		// Tao thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		
		// Tao 1 menu
		JMenu jMenu_file = new JMenu("File");
		// Tao menu con
		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuExampleController);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		JMenu jMenu_help = new JMenu("Help");
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		// Them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		// Tao label hien thi
		Font font = new Font("Arial", Font.BOLD, 40);
		jLabel = new JLabel();
		
		this.setLayout(new BorderLayout());
		
		this.add(jLabel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
	
}
