package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements Action{
	public QLSVView view;
	
		
	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: " + cm);
		if (cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} 
		else if (cm.equals("Lưu")) {
			try {
				
				// Get du lieu
				int maThiSinh = Integer.valueOf(this.view.textField_ID.getText());
				String tenThiSinh = this.view.textField_Hoten.getText();
				
				int queQuan = this.view.comboBox_QueQuan.getSelectedIndex()-1; // id tinh tru di 1
				Tinh tinh = Tinh.getTinhById(queQuan);
				
				Date ngaySinh = new Date(this.view.textField_Ngaysinh.getText());
				
				Boolean gioiTinh = true;
				if (this.view.rdbt_Nam.isSelected()) {
					gioiTinh = true;
				} else if (this.view.rdbt_Nu.isSelected()) {
					gioiTinh = false;
				}
				float diemMon1 = Float.valueOf(this.view.textField_Mon1.getText());
				float diemMon2 = Float.valueOf(this.view.textField_Mon2.getText());
				float diemMon3 = Float.valueOf(this.view.textField_Mon3.getText());
				
				
				ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1,diemMon2, diemMon3);;
				this.view.themHoacCapNhatThiSinh(ts);
				
				
				// bỏ
//				if (this.view.model.getLuaChon().equals("") || this.view.model.getLuaChon().equals("Thêm")) {
//					this.view.themThiSinh(ts);
//				}
//				else if (this.view.model.getLuaChon().equals("Cập nhật")) {
//					this.view.capNhapThiSinh(ts);
//				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} 
		else if (cm.equals("Cập nhật")) {
			this.view.hienThiThongTinThiSinhDaChon();
			
		}
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

}
