package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		// Tao controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		// Tao thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		
		// Tao 1 menu
		JMenu jMenu_file = new JMenu("File");
		
		// Tao menu con
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N); // CTRL + N 
		jMenuItem_new.addActionListener(menuExampleController);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O); // CTRL + O
		jMenuItem_open.addActionListener(menuExampleController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X); // ALT + X
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		
		
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		
		// Menu View - java_93
		JMenu jMenu_view = new JMenu("View");
		JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toolbar"); 
		
		jCheckBoxMenuItem_toolbar.addActionListener(menuExampleController);
		jMenu_view.add(jCheckBoxMenuItem_toolbar);
		
		
		// Menu Help
		JMenu jMenu_help = new JMenu("Help"); // ALT + L
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		jMenu_help.setDisplayedMnemonicIndex(0);
		
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		
		// Add JMenu
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		jMenuBar.add(jMenu_view);
		
		
		// Them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		
		// Tao ToolBar (Thanh cong cu)
		jToolBar = new JToolBar();
		
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.setToolTipText("Nhan vao day de quay lai thao tac !");
		jButton_Undo.addActionListener(menuExampleController);
		
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.addActionListener(menuExampleController);
		jButton_Redo.setToolTipText("Nhan vao day de di toi thao tac vua quay lai !");
		
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.addActionListener(menuExampleController);
		jButton_Copy.setToolTipText("Nhan vao day de sao chep !");
		
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.addActionListener(menuExampleController);
		jButton_Cut.setToolTipText("Nhan vao day de cat !");
		
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.addActionListener(menuExampleController);
		jButton_Paste.setToolTipText("Nhan vao day de dan !");
		
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);
		
			
				
		
		// Menu chuot phai JPopupMenu
		jPopupMenu = new JPopupMenu();
		
		JMenu jMenuPopupFont = new JMenu("Font");
		JMenuItem jMenuItemType = new JMenuItem("Type");
		jMenuItemType.addActionListener(menuExampleController);
		JMenuItem jMenuItemSize = new JMenuItem("Size");
		jMenuItemSize.addActionListener(menuExampleController);
		
		jMenuPopupFont.add(jMenuItemType);
		jMenuPopupFont.add(jMenuItemSize);
		
		JMenuItem jMenuItemCut = new JMenuItem("Cut");
		jMenuItemCut.addActionListener(menuExampleController);
		JMenuItem jMenuItemCopy = new JMenuItem("Copy");
		jMenuItemCopy.addActionListener(menuExampleController);
		JMenuItem jMenuItemPaste = new JMenuItem("Paste"); 
		jMenuItemPaste.addActionListener(menuExampleController);
		
		jPopupMenu.add(jMenuPopupFont);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItemCut);
		jPopupMenu.add(jMenuItemCopy);
		jPopupMenu.add(jMenuItemPaste);
		this.add(jPopupMenu);
		
		// Them su kien phai chuot vao Jlabel
		MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
		this.addMouseListener(menuExampleMouseListener);
		
		
		
		
		// Tao label hien thi
		Font font = new Font("Arial", Font.BOLD, 40);
		jLabel = new JLabel();
		
		
		this.add(jLabel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
	
	public void enableToolbar() {
		this.add(jToolBar, BorderLayout.NORTH);
		this.refresh();
	}
	
	public void disableToolbar() {
		this.remove(jToolBar);
		this.refresh();
	}
	
	public void refresh() {
		this.pack();
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
	}
	
}
