package librarymanagementsystem;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class ReturnBook extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton b1,b2,b3;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		new ReturnBook().setVisible(true);
	}

	public void delete() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");
			String sql = "delete from issueBook where book_id=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, textField.getText());
			int i = st.executeUpdate();
			if (i > 0)
				JOptionPane.showConfirmDialog(null, "Book Returned");
			else
				JOptionPane.showMessageDialog(null, "error in Deleting");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	}


	public ReturnBook() {
		initGUI();
	}
	private void initGUI() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(450, 300, 517, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(20, 52, 463, 376);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblDateOfReturn = new JLabel("Date of Return");
		lblDateOfReturn.setBounds(10, 191, 118, 29);
		panel.add(lblDateOfReturn);
		lblDateOfReturn.setForeground(Color.BLACK);
		lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));

		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBackground(new Color(255, 255, 255));
		dateChooser.setBounds(146, 191, 172, 29);
		panel.add(dateChooser);
		dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));

		JLabel lblDateOfIssue = new JLabel("Date of Issue");
		lblDateOfIssue.setBounds(10, 151, 105, 29);
		panel.add(lblDateOfIssue);
		lblDateOfIssue.setForeground(Color.BLACK);
		lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField_6 = new JTextField();
		textField_6.setBounds(146, 156, 172, 20);
		panel.add(textField_6);
		textField_6.setForeground(new Color(0, 0, 0));
		textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_6.setEditable(false);
		textField_6.setColumns(10);

		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 116, 87, 24);
		panel.add(lblCourse);
		lblCourse.setForeground(Color.BLACK);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField_4 = new JTextField();
		textField_4.setBounds(146, 119, 172, 20);
		panel.add(textField_4);
		textField_4.setEditable(false);
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_4.setColumns(10);

		JLabel lblBook = new JLabel("Book");
		lblBook.setBounds(10, 81, 71, 24);
		panel.add(lblBook);
		lblBook.setForeground(Color.BLACK);
		lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField_2 = new JTextField();
		textField_2.setBounds(146, 84, 172, 20);
		panel.add(textField_2);
		textField_2.setEditable(false);
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_2.setColumns(10);

		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(10, 266, 68, 24);
		panel.add(lblBranch);
		lblBranch.setForeground(Color.BLACK);
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblNewLabel = new JLabel("Book_id");
		lblNewLabel.setBounds(10, 46, 87, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField = new JTextField();
		textField.setBounds(146, 49, 172, 20);
		panel.add(textField);
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		textField.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 231, 71, 24);
		panel.add(lblName);
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblStudentid = new JLabel("Student_id");
		lblStudentid.setBounds(10, 11, 87, 24);
		panel.add(lblStudentid);
		lblStudentid.setForeground(Color.BLACK);
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField_1 = new JTextField();
		textField_1.setBounds(146, 14, 172, 20);
		panel.add(textField_1);
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		textField_1.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(146, 234, 172, 20);
		panel.add(textField_3);
		textField_3.setEditable(false);
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_3.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(146, 269, 172, 20);
		panel.add(textField_5);
		textField_5.setForeground(new Color(0, 0, 0));
		textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		textField_5.setEditable(false);
		textField_5.setColumns(10);

		b2 = new JButton("Return");
		b2.setBounds(149, 322, 80, 30);
		panel.add(b2);
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		b3 = new JButton("Back");
		b3.setBounds(239, 322, 79, 30);
		panel.add(b3);
		b3.addActionListener(this);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);

		b1 = new JButton("Search");
		b1.setBounds(337, 11, 105, 29);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		lblNewLabel_1 = new JLabel("Return Book");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 22, 105, 14);
		contentPane.add(lblNewLabel_1);
	}

	public void actionPerformed(ActionEvent ae){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root"); 
			if(ae.getSource() == b1){
				String sql = "select * from issueBook where student_id = ? and book_id =?";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, textField_1.getText());
				st.setString(2, textField.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					textField_2.setText(rs.getString("bname"));
					textField_3.setText(rs.getString("sname"));
					textField_4.setText(rs.getString("course"));
					textField_5.setText(rs.getString("branch"));
					textField_6.setText(rs.getString("dateOfIssue"));
				}
				st.close();
				rs.close();

			}
			if(ae.getSource() == b2){
				String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, textField.getText());
				st.setString(2, textField_1.getText());
				st.setString(3, textField_2.getText());
				st.setString(4, textField_3.getText());
				st.setString(5, textField_4.getText());
				st.setString(6, textField_5.getText());
				st.setString(7, textField_6.getText());

				st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
				int i = st.executeUpdate();
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "Processing..");
					delete();
				} else
					JOptionPane.showMessageDialog(null, "error");

			}
			if(ae.getSource() == b3){
				this.setVisible(false);
				new Home().setVisible(true);

			}
		}catch(Exception e){

		}
	}
}
