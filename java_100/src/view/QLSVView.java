package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.Action;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;

import java.util.ArrayList;
import java.util.Date;

import controller.QLSVController;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTable table;
	public TextField textField_Hoten;
	public TextField textField_ID;
	public TextField textField_Mon1;
	public TextField textField_Mon2;
	public TextField textField_Mon3;
	public TextField textField_Ngaysinh;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_QueQuan;
	public JRadioButton rdbt_Nam;
	public  JRadioButton rdbt_Nu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 50, 850, 720);
		
		Action action = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelQueQuan = new JLabel("Quê quán");
		labelQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelQueQuan.setBounds(30, 10, 90, 30);
		contentPane.add(labelQueQuan);
		
		JLabel label_ID_Nhap = new JLabel("Mã thí sinh");
		label_ID_Nhap.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_ID_Nhap.setBounds(370, 8, 100, 30);
		contentPane.add(label_ID_Nhap);
		
		TextField textField_ID_Nhap = new TextField();
		textField_ID_Nhap.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_ID_Nhap.setBounds(480, 8, 200, 40);
		contentPane.add(textField_ID_Nhap);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(700, 10, 100, 40);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_QueQuan_TimKiem = new JComboBox();
		comboBox_QueQuan_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan_TimKiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan_TimKiem.addItem(tinh.getTenTinh());
		}
		
		comboBox_QueQuan_TimKiem.setBounds(140, 8, 200, 40);
		contentPane.add(comboBox_QueQuan_TimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 60, 800, 1);
		contentPane.add(separator_1);
		
		JLabel lbl_DSThiSinh = new JLabel("Danh sách thí sinh");
		lbl_DSThiSinh.setFont(new Font("Tahoma", Font.BOLD, 19));
		lbl_DSThiSinh.setBounds(30, 65, 180, 40);
		contentPane.add(lbl_DSThiSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 105, 800, 200);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 320, 800, 1);
		contentPane.add(separator_1_1);
		
		JLabel lbl_ThongTin = new JLabel("Thông tin thí sinh");
		lbl_ThongTin.setFont(new Font("Tahoma", Font.BOLD, 19));
		lbl_ThongTin.setBounds(30, 330, 200, 40);
		contentPane.add(lbl_ThongTin);
		
		JLabel label_ID = new JLabel("Mã thí sinh");
		label_ID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_ID.setBounds(35, 380, 110, 30);
		contentPane.add(label_ID);
		
		textField_ID = new TextField();
		textField_ID.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_ID.setBounds(150, 375, 200, 40);
		contentPane.add(textField_ID);
		
		JLabel label_Hoten = new JLabel("Họ và tên");
		label_Hoten.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Hoten.setBounds(35, 430, 110, 30);
		contentPane.add(label_Hoten);
		
		textField_Hoten = new TextField();
		textField_Hoten.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_Hoten.setBounds(150, 425, 200, 40);
		contentPane.add(textField_Hoten);
		
		JLabel lbl_NgaySinh = new JLabel("Ngày sinh");
		lbl_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_NgaySinh.setBounds(35, 530, 110, 30);
		contentPane.add(lbl_NgaySinh);
		
		textField_Ngaysinh = new TextField();
		textField_Ngaysinh.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_Ngaysinh.setBounds(150, 525, 200, 40);
		contentPane.add(textField_Ngaysinh);
		
		JLabel label_QueQuan_1 = new JLabel("Quê quán");
		label_QueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_QueQuan_1.setBounds(35, 480, 110, 30);
		contentPane.add(label_QueQuan_1);
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 19));
//		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan.addItem(tinh.getTenTinh());
		}
		
		comboBox_QueQuan.setBounds(150, 475, 200, 40);
		contentPane.add(comboBox_QueQuan);
		
		JLabel lbl_GioiTinh = new JLabel("Giới tính");
		lbl_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_GioiTinh.setBounds(450, 380, 103, 32);
		contentPane.add(lbl_GioiTinh);
		
		rdbt_Nam = new JRadioButton("Nam");
		rdbt_Nam.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbt_Nam.setBounds(575, 380, 80, 30);
		contentPane.add(rdbt_Nam);
		
		rdbt_Nu = new JRadioButton("Nữ");
		rdbt_Nu.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rdbt_Nu.setBounds(660, 380, 80, 30);
		contentPane.add(rdbt_Nu);
		
		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(rdbt_Nam);
		btn_gioiTinh.add(rdbt_Nu);
		
		JLabel lbl_Mon1 = new JLabel("Môn 1");
		lbl_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_Mon1.setBounds(450, 430, 110, 30);
		contentPane.add(lbl_Mon1);
		
		textField_Mon1 = new TextField();
		textField_Mon1.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_Mon1.setBounds(565, 425, 200, 40);
		contentPane.add(textField_Mon1);
		
		JLabel lbl_Mon2 = new JLabel("Môn 2");
		lbl_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_Mon2.setBounds(450, 480, 110, 30);
		contentPane.add(lbl_Mon2);
		
		textField_Mon2 = new TextField();
		textField_Mon2.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_Mon2.setBounds(565, 475, 200, 40);
		contentPane.add(textField_Mon2);
		
		JLabel lbl_Mon3 = new JLabel("Môn 3");
		lbl_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl_Mon3.setBounds(450, 530, 110, 30);
		contentPane.add(lbl_Mon3);
		
		textField_Mon3 = new TextField();
		textField_Mon3.setFont(new Font("tahoma", Font.PLAIN, 19));
		textField_Mon3.setBounds(565, 531, 200, 40);
		contentPane.add(textField_Mon3);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.addActionListener(action);
//		btn_Them.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_Them.setBounds(50, 590, 120, 40);
		contentPane.add(btn_Them);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.addActionListener(action);
//		btn_Xoa.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		btn_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_Xoa.setBounds(200, 590, 120, 40);
		contentPane.add(btn_Xoa);
		
		JButton btn_CapNhat = new JButton("Cập nhật");
		btn_CapNhat.addActionListener(action);
		btn_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_CapNhat.setBounds(350, 590, 120, 40);
		contentPane.add(btn_CapNhat);
		
		JButton btn_Luu = new JButton("Lưu");
		btn_Luu.addActionListener(action);
		btn_Luu.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_Luu.setBounds(500, 590, 120, 40);
		contentPane.add(btn_Luu);
		
		JButton btn_Huy = new JButton("Hủy bỏ");
		btn_Huy.addActionListener(action);
		btn_Huy.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_Huy.setBounds(650, 590, 120, 40);
		contentPane.add(btn_Huy);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(20, 580, 800, 1);
		contentPane.add(separator_1_2);
		
		this.setVisible(true);
	}

	public void xoaForm() {
		textField_ID.setText("");
		textField_Hoten.setText("");
		textField_Ngaysinh.setText("");
		textField_Mon1.setText("");
		textField_Mon2.setText("");
		textField_Mon3.setText("");
		comboBox_QueQuan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
		
	}

	public void themHoacCapNhatThiSinh(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel(); // ma trận dữ liệu
		
		if (!this.model.kiemTraTonTai(ts)) {
		
			this.model.insert(ts);
			// Đưa thí sinh vào JTable
			model_table.addRow(new Object[] {
					ts.getMaThiSinh()+"", 
					ts.getTenThiSinh(),
					ts.getQueQuan().getTenTinh(),
					ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900),
					(ts.isGioiTinh()?"Nam":"Nữ"),
					ts.getDiemMon1()+"",
					ts.getDiemMon2()+"",
					ts.getDiemMon3()+"",
					});
		}
		else {
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if (id.equals(ts.getMaThiSinh()+"")) {
					model_table.setValueAt(ts.getMaThiSinh()+"", i, 0);
					model_table.setValueAt(ts.getTenThiSinh()+"", i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh()+"", i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900), i, 3);
					model_table.setValueAt((ts.isGioiTinh()?"Nam":"Nữ"), i, 4);
					model_table.setValueAt(ts.getDiemMon1()+"", i, 5);
					model_table.setValueAt(ts.getDiemMon2()+"", i, 6);
					model_table.setValueAt(ts.getDiemMon3()+"", i, 7);
				}
			}
		}
		
	}


	public void hienThiThongTinThiSinhDaChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel(); // ma trận dữ liệu
		int i_row = table.getSelectedRow();
		
		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		
		String tenThiSinh = model_table.getValueAt(i_row, 1)+"";

		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		
		String s_ngaySinh = model_table.getValueAt(i_row, 3)+"";
		Date ngaySinh = new Date(s_ngaySinh);
		
		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
		Boolean gioiTinh = textGioiTinh.equals("Nam");
				
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		
		this.textField_ID.setText(maThiSinh+"");
		this.textField_Hoten.setText(tenThiSinh+"");
		this.comboBox_QueQuan.setSelectedItem(tinh.getTenTinh());
		this.textField_Ngaysinh.setText(s_ngaySinh+"");
		
		if (gioiTinh) {
			rdbt_Nam.setSelected(true);
		} else {
			rdbt_Nu.setSelected(true);
		}
		this.textField_Mon1.setText(diemMon1+"");
		this.textField_Mon2.setText(diemMon2+"");
		this.textField_Mon3.setText(diemMon3+"");
	}
}




