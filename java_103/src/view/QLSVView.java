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
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.Action;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

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
	public JComboBox comboBox_QueQuan_TimKiem;
	public TextField textField_ID_TimKiem;

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
		menuOpen.addActionListener(action);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(action);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.addActionListener(action);
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
		
		textField_ID_TimKiem = new TextField();
		textField_ID_TimKiem.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField_ID_TimKiem.setBounds(480, 8, 150, 40);
		contentPane.add(textField_ID_TimKiem);
		
		JButton btn_Tim = new JButton("Tìm");
		btn_Tim.addActionListener(action);
		btn_Tim.setFont(new Font("Tahoma", Font.PLAIN, 19));
//		btn_Tim.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		btn_Tim.setBounds(640, 10, 70, 40);
		contentPane.add(btn_Tim);
		

		JButton btn_HuyTim = new JButton("Hủy tìm");
		btn_HuyTim.addActionListener(action);
		btn_HuyTim.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btn_HuyTim.setBounds(720, 10, 100, 40);
		contentPane.add(btn_HuyTim);
		
		comboBox_QueQuan_TimKiem = new JComboBox();
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
		table.setRowHeight(25);
		
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
	
	public void themThiSinhVaoTable(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
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

	public void themHoacCapNhatThiSinh(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel(); // ma trận dữ liệu
		
		if (!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);
			// Đưa thí sinh vào JTable
			this.themThiSinhVaoTable(ts);
		}
		else {
			// Cap nhat thi sinh
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
	
	public ThiSinh getThiSinhDangChon() {
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
		
		// tao ra thi sinh moi
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1,diemMon2, diemMon3);;
		return ts;
	}


	public void hienThiThongTinThiSinhDaChon() {
//		DefaultTableModel model_table = (DefaultTableModel) table.getModel(); // ma trận dữ liệu
//		int i_row = table.getSelectedRow();
//		
//		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
//		String tenThiSinh = model_table.getValueAt(i_row, 1)+"";
//		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
//		String s_ngaySinh = model_table.getValueAt(i_row, 3)+"";
//		Date ngaySinh = new Date(s_ngaySinh);
//		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
//		Boolean gioiTinh = textGioiTinh.equals("Nam");
//		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
//		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
//		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		ThiSinh ts = getThiSinhDangChon();
		
		this.textField_ID.setText(ts.getMaThiSinh()+"");
		this.textField_Hoten.setText(ts.getTenThiSinh()+"");
		this.comboBox_QueQuan.setSelectedItem(ts.getQueQuan().getTenTinh());
		String s_ngaySinh = ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900);
		this.textField_Ngaysinh.setText(s_ngaySinh+"");
		
		if (ts.isGioiTinh()) {
			rdbt_Nam.setSelected(true);
		} else {
			rdbt_Nu.setSelected(true);
		}
		this.textField_Mon1.setText(ts.getDiemMon1()+"");
		this.textField_Mon2.setText(ts.getDiemMon2()+"");
		this.textField_Mon3.setText(ts.getDiemMon3()+"");
	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn.");
		if (luaChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangChon(); // lay ra thi sinh da chon
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
		
	}

	public void thucHienThemThiSinh() {
		// Get du lieu
		int maThiSinh = Integer.valueOf(this.textField_ID.getText());
		String tenThiSinh = this.textField_Hoten.getText();
		int queQuan = this.comboBox_QueQuan.getSelectedIndex()-1; // id tinh tru di 1
		Tinh tinh = Tinh.getTinhById(queQuan);
		Date ngaySinh = new Date(this.textField_Ngaysinh.getText());
		Boolean gioiTinh = true;
		if (this.rdbt_Nam.isSelected()) {
			gioiTinh = true;
		} else if (this.rdbt_Nu.isSelected()) {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_Mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_Mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_Mon3.getText());
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1,diemMon2, diemMon3);;
		this.themHoacCapNhatThiSinh(ts);
		
		
	}

	public void thucHienTim() {
		// Goi ham huy tim kiem
		this.thucHienTaiLaiDuLieu();
		
		// Thuc hien tim kiem
		int queQuan = this.comboBox_QueQuan_TimKiem.getSelectedIndex()-1; // id tinh tru di 1
		String maThiSinhTimKiem = this.textField_ID_TimKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		
		Set<Integer> idThiSinhCanXoa = new TreeSet<Integer>();
		
		if (queQuan >= 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
			
			for (int i = 0; i < soLuongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2)+"";
				String id = model_table.getValueAt(i, 0) + "";
				
				if (!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		if (maThiSinhTimKiem.length()>0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				// ma thi sinh da loc khong bang
				if (!id.equals(maThiSinhTimKiem)) {
					// xoa di sinh vien do
					idThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		
		// moi ban sv ktra xem table co bi bien doi so luong dong khong
		for (Integer idCanXoa : idThiSinhCanXoa) {
			soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				// lay id cua bn do ra
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				System.out.println("idTrongTable: "+idTrongTable);
				// id trong table = id can xoa
				if (idTrongTable.equals(idCanXoa.toString())) {
					// xoa dong tai vi tri thu i
					System.out.println("Đã xóa: "+i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// thoat khoi vong lap để xóa idtable khác
					break;
				}
			}
		}
		
	}
	
	
	
	public void thucHienTaiLaiDuLieu() {
		// xoa het thi sinh
		while(true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0) {
				break;
			} 
			else {
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (ThiSinh ts : this.model.getDsThiSinh()) {
			this.themThiSinhVaoTable(ts);
		}
		
	}

	public void hienThiAboutMe() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
		
	}

	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(
				this, 
				"Bạn có muốn thoát khỏi chương trình?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
		if (luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void thucHienSaveFile() {
		if (this.model.getTenFile().length()>0) {
			saveFile(this.model.getTenFile());
		}
		else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
		
	}
	

	public void openFile(File file) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ThiSinh ts = null;
			while ((ts = (ThiSinh) ois.readObject()) != null) { // ep kieu
				ds.add(ts);
			}
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsThiSinh(ds);
	}

	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHienTaiLaiDuLieu();
		}
		
	}

}




