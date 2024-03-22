package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

import view.ThucDonView;

public class ThucDonController implements ActionListener {
	private ThucDonView thucDonView;
	
	
	public ThucDonController(ThucDonView thucDonView) {
		this.thucDonView = thucDonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();
		
		String monPhu = "";
		Object[] luaChonMonPhu = thucDonView.jList_MonPhu.getSelectedValues(); 
		
		for (Object o : luaChonMonPhu) {
			monPhu = monPhu+o.toString() + "; ";
		}
		
		thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
		thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		thucDonView.hienThiKetQua();
		
		String soTien_Chuoi = (String) JOptionPane.showInputDialog(
				thucDonView,
				thucDonView.jLabel_ThongTin.getText()
				+ "\nNhap vao so tien: ",
				"Thong bao",
				JOptionPane.PLAIN_MESSAGE);
		
		try {
			double soTien = Double.valueOf(soTien_Chuoi);
			JOptionPane.showMessageDialog(thucDonView,
					"Thoi tien lai cho khach: " + (soTien - thucDonView.thucDonModel.getTongTien()),
					"Infor",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(thucDonView,
					"Nhap du lieu sai!",
					"Error",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
}
