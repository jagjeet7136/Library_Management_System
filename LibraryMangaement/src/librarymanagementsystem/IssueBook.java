package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class IssueBook extends JFrame implements ActionListener{

	private JPanel contentPane;
	JDateChooser dateChooser;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	private JButton b1,b2,b3,b4;
	private JLabel lblNewLabel;
	private JLabel lblIssueBook;

	public static void main(String[] args) {
		new IssueBook().setVisible(true);

	}

	public IssueBook() {
		initGUI();
	}
	private void initGUI() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(300, 200, 900, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.setBounds(10, 63, 353, 347);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel l1 = new JLabel("Book_id");
		l1.setBounds(26, 28, 100, 23);
		panel.add(l1);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setForeground(new Color(0, 0, 0));

		JLabel l7 = new JLabel("Pages");
		l7.setBounds(26, 232, 100, 23);
		panel.add(l7);
		l7.setForeground(new Color(0, 0, 0));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));

		t7 = new JTextField();
		t7.setBackground(new Color(255, 255, 255));
		t7.setBounds(127, 234, 208, 20);
		panel.add(t7);
		t7.setEditable(false);
		t7.setForeground(new Color(47, 79, 79));
		t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t7.setColumns(10);

		JLabel l6 = new JLabel("Price");
		l6.setBounds(26, 198, 100, 23);
		panel.add(l6);
		l6.setForeground(new Color(0, 0, 0));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));

		t6 = new JTextField();
		t6.setBackground(new Color(255, 255, 255));
		t6.setBounds(127, 200, 208, 20);
		panel.add(t6);
		t6.setEditable(false);
		t6.setForeground(new Color(47, 79, 79));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);

		JLabel l5 = new JLabel("Edition");
		l5.setBounds(26, 164, 100, 23);
		panel.add(l5);
		l5.setForeground(new Color(0, 0, 0));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));

		t5 = new JTextField();
		t5.setBackground(new Color(255, 255, 255));
		t5.setBounds(127, 166, 208, 20);
		panel.add(t5);
		t5.setEditable(false);
		t5.setForeground(new Color(47, 79, 79));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);

		JLabel l4 = new JLabel("Publisher");
		l4.setBounds(26, 130, 100, 23);
		panel.add(l4);
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));

		t4 = new JTextField();
		t4.setBackground(new Color(255, 255, 255));
		t4.setBounds(127, 132, 208, 20);
		panel.add(t4);
		t4.setEditable(false);
		t4.setForeground(new Color(47, 79, 79));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);

		JLabel l3 = new JLabel("ISBN");
		l3.setBounds(26, 96, 100, 23);
		panel.add(l3);
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));

		t3 = new JTextField();
		t3.setBackground(new Color(255, 255, 255));
		t3.setBounds(127, 98, 208, 20);
		panel.add(t3);
		t3.setEditable(false);
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);

		JLabel l2 = new JLabel("Name");
		l2.setBounds(26, 62, 100, 23);
		panel.add(l2);
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));

		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 255));
		t2.setBounds(127, 64, 208, 20);
		panel.add(t2);
		t2.setEditable(false);
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(127, 30, 86, 20);
		panel.add(t1);
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

		b1 = new JButton("Search");
		b1.setBounds(235, 25, 100, 30);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		b1.setBackground(new Color(0, 0, 0));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

		JLabel l15 = new JLabel(" Date of Issue:");
		l15.setBackground(new Color(0, 0, 0));
		l15.setBounds(19, 266, 107, 26);
		panel.add(l15);
		l15.setForeground(new Color(0, 0, 0));
		l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));

		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBackground(new Color(255, 255, 255));
		dateChooser.setBounds(127, 266, 208, 29);
		panel.add(dateChooser);
		dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		dateChooser.setForeground(new Color(105, 105, 105));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setForeground(new Color(0, 100, 0));
		panel_1.setBounds(459, 63, 378, 273);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		b2 = new JButton("Search");
		b2.setBounds(254, 24, 100, 30);
		panel_1.add(b2);
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		t8 = new JTextField();
		t8.setBackground(new Color(255, 255, 255));
		t8.setBounds(144, 29, 86, 20);
		panel_1.add(t8);
		t8.setForeground(new Color(47, 79, 79));
		t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t8.setColumns(10);

		JLabel l8 = new JLabel("Student_id");
		l8.setBounds(23, 27, 100, 23);
		panel_1.add(l8);
		l8.setForeground(new Color(0, 0, 0));
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));

		t9 = new JTextField();
		t9.setBackground(new Color(255, 255, 255));
		t9.setBounds(144, 65, 210, 20);
		panel_1.add(t9);
		t9.setForeground(new Color(47, 79, 79));
		t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t9.setEditable(false);
		t9.setColumns(10);

		JLabel l9 = new JLabel("Name");
		l9.setBounds(23, 61, 100, 23);
		panel_1.add(l9);
		l9.setForeground(new Color(0, 0, 0));
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));

		t10 = new JTextField();
		t10.setBackground(new Color(255, 255, 255));
		t10.setBounds(144, 96, 210, 20);
		panel_1.add(t10);
		t10.setForeground(new Color(47, 79, 79));
		t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t10.setEditable(false);
		t10.setColumns(10);

		JLabel l10 = new JLabel("Father's Name");
		l10.setBounds(23, 95, 100, 23);
		panel_1.add(l10);
		l10.setForeground(new Color(0, 0, 0));
		l10.setFont(new Font("Tahoma", Font.BOLD, 14));

		t11 = new JTextField();
		t11.setBackground(new Color(255, 255, 255));
		t11.setBounds(144, 127, 210, 20);
		panel_1.add(t11);
		t11.setForeground(new Color(47, 79, 79));
		t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t11.setEditable(false);
		t11.setColumns(10);

		JLabel l11 = new JLabel("Course");
		l11.setBounds(23, 129, 100, 23);
		panel_1.add(l11);
		l11.setForeground(new Color(0, 0, 0));
		l11.setFont(new Font("Tahoma", Font.BOLD, 14));

		t12 = new JTextField();
		t12.setBackground(new Color(255, 255, 255));
		t12.setBounds(144, 158, 210, 20);
		panel_1.add(t12);
		t12.setForeground(new Color(47, 79, 79));
		t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t12.setEditable(false);
		t12.setColumns(10);

		JLabel l12 = new JLabel("Branch");
		l12.setBounds(23, 156, 100, 23);
		panel_1.add(l12);
		l12.setForeground(new Color(0, 0, 0));
		l12.setFont(new Font("Tahoma", Font.BOLD, 14));

		t13 = new JTextField();
		t13.setBackground(new Color(255, 255, 255));
		t13.setBounds(144, 189, 210, 20);
		panel_1.add(t13);
		t13.setForeground(new Color(47, 79, 79));
		t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t13.setEditable(false);
		t13.setColumns(10);

		JLabel l13 = new JLabel("Year");
		l13.setBounds(23, 190, 100, 23);
		panel_1.add(l13);
		l13.setForeground(new Color(0, 0, 0));
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));

		t14 = new JTextField();
		t14.setBackground(new Color(255, 255, 255));
		t14.setBounds(144, 220, 210, 20);
		panel_1.add(t14);
		t14.setForeground(new Color(47, 79, 79));
		t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t14.setEditable(false);
		t14.setColumns(10);

		JLabel l14 = new JLabel("Semester");
		l14.setBounds(23, 218, 100, 23);
		panel_1.add(l14);
		l14.setForeground(new Color(0, 0, 0));
		l14.setFont(new Font("Tahoma", Font.BOLD, 14));

		b3 = new JButton("Issue");
		b3.addActionListener(this);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		b3.setBounds(459, 377, 118, 33);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		contentPane.add(b3);

		b4 = new JButton("Back");
		b4.addActionListener(this);
		b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		b4.setBounds(719, 377, 118, 33);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		contentPane.add(b4);

		lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(459, 38, 118, 14);
		contentPane.add(lblNewLabel);

		lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueBook.setBounds(10, 40, 118, 14);
		contentPane.add(lblIssueBook);
	}

	public void actionPerformed(ActionEvent ae){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");
			if(ae.getSource() == b1){
				String sql = "select * from book where book_id = ?";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("isbn"));
					t4.setText(rs.getString("publisher"));
					t5.setText(rs.getString("edition"));
					t6.setText(rs.getString("price"));
					t7.setText(rs.getString("pages"));
				}
				st.close();
				rs.close();

			}
			if(ae.getSource() == b2){
				String sql = "select * from student where student_id = ?";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, t8.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					t9.setText(rs.getString("name"));
					t10.setText(rs.getString("father"));
					t11.setText(rs.getString("course"));
					t12.setText(rs.getString("branch"));
					t13.setText(rs.getString("year"));
					t14.setText(rs.getString("semester"));
				}
				st.close();
				rs.close();

			}
			if(ae.getSource() == b3){
				try{
					String sql = "insert into issueBook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t8.getText());
					st.setString(3, t2.getText());
					st.setString(4, t9.getText());
					st.setString(5, t11.getText());
					st.setString(6, t12.getText());
					st.setString(7, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
					int i = st.executeUpdate();
					if (i > 0)
						JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
					else
						JOptionPane.showMessageDialog(null, "error");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(ae.getSource() == b4){
				this.setVisible(false);
				new Home().setVisible(true);

			}

			con.close();
		}catch(Exception e){

		}
	}
}
