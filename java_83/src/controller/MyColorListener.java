package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener{
	private MyColorView myColorView;	

	public MyColorListener(MyColorView myColorView) {
		this.myColorView = myColorView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Red Text")) {
			this.myColorView.changeTextColor(Color.RED);
		} else if (src.equals("Blue Text")) {
			this.myColorView.changeTextColor(Color.BLUE);
		} else if (src.equals("Green Text")) {
			this.myColorView.changeTextColor(Color.GREEN);
		}
		else if (src.equals("Red Background")) {
			this.myColorView.changerBackgroundColor(Color.RED);
		} else if (src.equals("Blue Background")) {
			this.myColorView.changerBackgroundColor(Color.BLUE);
		} else if (src.equals("Green Background")) {
			this.myColorView.changerBackgroundColor(Color.GREEN);
		}
	}

}
