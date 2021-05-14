package librarymanagementsystem;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton b1,b2,b3,b4,b5,b6;
	private final JLabel lblNewLabel = new JLabel("Issue/Return");
	private JLabel l5_1;
	private JLabel l6_1;
	private JLabel l7_1;
	private JLabel l2_1;
	private JLabel l3_1;
	private JLabel l4_1;

	public static void main(String[] args) {
		new Home().setVisible(true);
	}

	public Home() {
		initGUI();
	}
	private void initGUI() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 

		setBounds(400, 150, 808, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 11, 792, 35);
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(222, 184, 135));
		contentPane.add(menuBar);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Tahoma", Font.BOLD, 17));


		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setBackground(new Color(211, 211, 211));
		mntmLogout.setForeground(new Color(105, 105, 105));
		mntmLogout.addActionListener(this);
		mnExit.add(mntmLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(105, 105, 105));
		mntmExit.setBackground(new Color(211, 211, 211));
		mntmExit.addActionListener(this);
		mnExit.add(mntmExit);

		JMenu mnRecord = new JMenu("Record");
		mnRecord.setFont(new Font("Tahoma", Font.BOLD, 17));


		JMenuItem bookdetails = new JMenuItem("Book Details");
		bookdetails.addActionListener(this);
		bookdetails.setBackground(new Color(211, 211, 211));
		bookdetails.setForeground(Color.DARK_GRAY);
		mnRecord.add(bookdetails);

		JMenuItem studentdetails = new JMenuItem("Student Details");
		studentdetails.setBackground(new Color(211, 211, 211));
		studentdetails.setForeground(Color.DARK_GRAY);
		studentdetails.addActionListener(this);
		mnRecord.add(studentdetails);

		menuBar.add(mnRecord);
		menuBar.add(mnExit);


		JLabel l1 = new JLabel("Home Page");
		l1.setBounds(10, 44, 428, 54);
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(l1);

		JLabel l2 = new JLabel("");
		l2.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_add_120px.png"));
		Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_google_docs_120px.png"));
		Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);

		ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_add_administrator_120px.png"));
		Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);

		JPanel panel = new JPanel();
		panel.setBounds(20, 155, 750, 260);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		b1 = new JButton("Add Books");
		b1.setBounds(32, 198, 146, 39);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setBackground(new Color(222, 184, 135));
		b1.setForeground(Color.WHITE);

		b2 = new JButton("Statistics");
		b2.setBounds(294, 198, 146, 39);
		panel.add(b2);
		b2.addActionListener(this);
		b2.setBackground(new Color(222, 184, 135));
		b2.setForeground(Color.WHITE);

		b3 = new JButton("Add Student");
		b3.setBounds(550, 198, 146, 39);
		panel.add(b3);
		b3.addActionListener(this);
		b3.setBackground(new Color(222, 184, 135));
		b3.setForeground(Color.WHITE);
		l2_1 = new JLabel(i3);
		l2_1.setBounds(32, 11, 159, 152);
		panel.add(l2_1);
		l3_1 = new JLabel(i6);
		l3_1.setBounds(294, 11, 146, 175);
		panel.add(l3_1);
		l4_1 = new JLabel(i9);
		l4_1.setBounds(503, 11, 225, 152);
		panel.add(l4_1);

		ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_books_120px.png"));
		Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);

		ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_return_book_120px.png"));
		Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);

		ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("icons/icons8_about_120px.png"));
		Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);

		JPanel panel2 = new JPanel();
		panel2.setBounds(20, 461, 750, 270);
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBackground(Color.WHITE);
		contentPane.add(panel2);
		panel2.setLayout(null);

		b4 = new JButton("Issue Book");
		b4.setBounds(41, 204, 143, 41);
		panel2.add(b4);
		b4.addActionListener(this);
		b4.setBackground(new Color(222, 184, 135));
		b4.setForeground(Color.WHITE);

		b5 = new JButton("Return Book");
		b5.setBounds(296, 204, 143, 41);
		panel2.add(b5);
		b5.addActionListener(this);
		b5.setBackground(new Color(222, 184, 135));
		b5.setForeground(Color.WHITE);

		b6 = new JButton("About Us");
		b6.setBounds(553, 204, 143, 41);
		panel2.add(b6);
		b6.addActionListener(this);
		b6.setBackground(new Color(222, 184, 135));
		b6.setForeground(Color.WHITE);
		l5_1 = new JLabel(i12);
		l5_1.setBounds(40, 27, 159, 163);
		panel2.add(l5_1);
		l6_1 = new JLabel(i15);
		l6_1.setBounds(300, 27, 139, 152);
		panel2.add(l6_1);
		l7_1 = new JLabel(i18);
		l7_1.setBounds(553, 27, 157, 152);
		panel2.add(l7_1);

		getContentPane().setBackground(new Color(245, 245, 220));
		contentPane.setBackground(Color.WHITE);
		lblNewLabel.setBounds(20, 440, 134, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		contentPane.add(lblNewLabel);

		JLabel lblAddDetails = new JLabel("Add Details");
		lblAddDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddDetails.setBounds(20, 130, 134, 14);
		contentPane.add(lblAddDetails);
	}


	public void actionPerformed(ActionEvent ae){
		String msg = ae.getActionCommand();
		if(msg.equals("Logout")){
			setVisible(false);
			new Login_user().setVisible(true);
		}else if(msg.equals("Exit")){
			System.exit(ABORT);

		}else if(msg.equals("Read Me")){

		}else if(msg.equals("About Us")){
			setVisible(false);
			new aboutUs().setVisible(true);

		}else if(msg.equals("Book Details")){
			setVisible(false);
			new BookDetails().setVisible(true);
		}else if(msg.equals("Student Details")){
			setVisible(false);
			new StudentDetails().setVisible(true);

		}

		if(ae.getSource() == b1){
			this.setVisible(false);
			new AddBook().setVisible(true);
		}
		if(ae.getSource() == b2){
			this.setVisible(false);
			new Statistics().setVisible(true);
		}
		if(ae.getSource() == b3){
			this.setVisible(false);
			new AddStudent().setVisible(true);
		}
		if(ae.getSource() == b4){
			this.setVisible(false);
			new IssueBook().setVisible(true);
		}
		if(ae.getSource() == b5){
			this.setVisible(false);
			new ReturnBook().setVisible(true);

		}
		if(ae.getSource() == b6){
			this.setVisible(false);
			new aboutUs().setVisible(true);

		}

	}
}
