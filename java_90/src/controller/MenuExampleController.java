package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if (button.equals("New")) {
			this.menuExampleView.setTextJLabel("Ban da click JMenuItem New");
		} else if (button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Ban da click JMenuItem Open");
		} else if (button.equals("Exit")) {
			// this.menuExampleView.setTextJLabel("Ban da click JMenuItem Exit");
			System.exit(0);
		} else if (button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Ban da click JMenuItem Welcome");
		}
	}

}
