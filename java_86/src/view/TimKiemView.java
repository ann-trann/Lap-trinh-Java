package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.TimKiemModel;
import controller.TimKiemListener;

public class TimKiemView extends JFrame {
	private TimKiemModel timKiemModel;
	private JTextArea jTextArea_vanBan;
	private JTextField jTextField_tuKhoa;
	private JLabel jLabel_ketQua;

	public TimKiemView() throws HeadlessException {
		this.timKiemModel = new TimKiemModel();
		this.init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setTitle("Tim Kiem");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 30);
		
		// Center
		JLabel jLabel_vanBan = new JLabel("Van ban");
		jLabel_vanBan.setFont(font);
		jTextArea_vanBan = new JTextArea(100, 100);
		jTextArea_vanBan.setFont(font);
		
		
		// Thanh cuon
//		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan);		

		
		// Footer
		TimKiemListener timKiemListener = new TimKiemListener(this);
		
		JLabel jLabel_tuKhoa = new JLabel("Tu khoa");
		jLabel_tuKhoa.setFont(font);
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);
		
		JButton jButton_thongKe = new JButton("Thong ke");
		jButton_thongKe.setFont(font);
		jButton_thongKe.addActionListener(timKiemListener);
		jButton_thongKe.setBackground(Color.BLUE);
		jButton_thongKe.setBorderPainted(false);
		jButton_thongKe.setOpaque(true);
		
		jLabel_ketQua = new JLabel();
		jLabel_ketQua.setBackground(Color.YELLOW);
		jLabel_ketQua.setFont(font);
		jLabel_ketQua.setOpaque(true);
		
		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jLabel_ketQua);
		
		
		this.setLayout(new BorderLayout());
		this.add(jLabel_vanBan, BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER); // Thanh cuon
		this.add(jPanel_footer, BorderLayout.SOUTH);
		
	}
	
	public void TimKiem() {
		this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
		this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
		this.timKiemModel.timKiem();
		this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
				
	}

}
