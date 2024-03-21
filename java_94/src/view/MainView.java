package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.*;

public class MainView extends JFrame {
    private JMenu menu, submenu;
    private JMenuItem i1, i2, i3, i4, i5;
    private JMenuBar mb = new JMenuBar();
    private JButton jButton;
    private JLabel jLabel;

    public MainView() {
        this.setTitle("Hello");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Set Icon => JFrame
        URL url_IconNotepad = MainView.class.getResource("icon_notepad.png");
        if (url_IconNotepad != null) {
            Image img = Toolkit.getDefaultToolkit().createImage(url_IconNotepad);
            this.setIconImage(img);
        } else {
            System.err.println("Icon file not found!");
        }

        // JMenuBar
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("New");
        i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));;
        i2 = new JMenuItem("Save");
        i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
        i3 = new JMenuItem("Save As");
        i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_saveas.png"))));
        i4 = new JMenuItem("Exit");
        i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
        i5 = new JMenuItem("Test");
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        // JLabel
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("image.png"))));
        
        // JButton
        jButton = new JButton("TEST BUTTON");
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
        jButton.setFont(new Font("Arial", Font.BOLD, 30));
        jButton.setSize(50, 50);

        this.setJMenuBar(mb);
        this.add(jLabel, BorderLayout.CENTER);
        this.add(jButton, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
