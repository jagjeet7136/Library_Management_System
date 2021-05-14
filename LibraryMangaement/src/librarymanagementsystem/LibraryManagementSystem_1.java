package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class LibraryManagementSystem_1 extends JFrame implements ActionListener{

	JLabel l1;
	JButton b1;
	JLabel l2;

	public LibraryManagementSystem_1() {
		initGUI();
	}
	private void initGUI() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setVisible(true);
		setBounds(0,0,950,450);
		getContentPane().setLayout(null);
		setLocation(300,300);
		l1 = new JLabel("Library Management System");



		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/new.jpg"));
		Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		l1 = new JLabel(i2);
		l1.setBounds(0, 0, 934, 411);
		getContentPane().add(l1);

		l2 = new JLabel("Library Management System");
		l2.setForeground(Color.WHITE);
		l2.setBounds(28, 100, 896, 98);
		l2.setFont(new Font("Tahoma", Font.PLAIN, 70));

		b1 = new JButton("Login/Signup");
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b1.setFont(new Font("Tahoma", Font.BOLD, 17));

		b1.setBackground(new Color(250, 128, 114));
		b1.setForeground(Color.BLACK);
		b1.setBounds(360,233,200,60);
		b1.addActionListener(this);
		l1.add(b1);
		l1.add(l2);


	}

	public void actionPerformed(ActionEvent ae){
		new Login_user().setVisible(true);
		this.setVisible(false);

	}

	public static void main(String[] args) {
		new LibraryManagementSystem_1();


	}
}