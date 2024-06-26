package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import model.MyColorModel;
import controller.MyColorListener;

public class MyColorView extends JFrame{
	private MyColorModel myColorModel;
	private JLabel jLabel;
	
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setTitle("MyColor");
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font_text = new Font("Arial", Font.BOLD, 40);
		jLabel = new JLabel("TEXT, ......");
		jLabel.setFont(font_text);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		MyColorListener myColorListener = new MyColorListener(this);
		
		
		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(myColorListener);
		
		JButton jButton_text_blue = new JButton("Blue Text");
		jButton_text_blue.setFont(font);
		jButton_text_blue.setForeground(Color.BLUE);
		jButton_text_blue.addActionListener(myColorListener);
		
		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(myColorListener);
		
		
		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
//		jButton_background_red.setOpaque(true);
//		jButton_background_red.setBorderPainted(false);
		jButton_background_red.addActionListener(myColorListener);
		
		JButton jButton_background_blue = new JButton("Blue Background");
		jButton_background_blue.setFont(font);
		jButton_background_blue.setBackground(Color.BLUE);
//		jButton_background_blue.setOpaque(true);
//		jButton_background_blue.setBorderPainted(false);
		jButton_background_blue.addActionListener(myColorListener);
		
		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
//		jButton_background_green.setOpaque(true);
//		jButton_background_green.setBorderPainted(false);
		jButton_background_green.addActionListener(myColorListener);
		
		
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_blue);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_blue);
		jPanel.add(jButton_background_green);
		
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}
	
	public void changerBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
		
	}
	
}
