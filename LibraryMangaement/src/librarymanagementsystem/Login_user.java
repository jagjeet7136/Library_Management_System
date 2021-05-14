package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class Login_user extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton b1,b2,b3;


	public Login_user() {

		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 

		setBackground(new Color(169, 169, 169));	
		setBounds(600, 300, 531, 400);

		panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		setContentPane(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(210, 93, 157, 30);
		panel.add(textField);

		passwordField = new JPasswordField();
		passwordField.setBounds(210, 128, 157, 30);
		panel.add(passwordField);

		JLabel l4 = new JLabel("");
		l4.setBounds(377, 124, 46, 34);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(144, 238, 144));
		panel2.setBounds(70, 42, 381, 263);
		panel.add(panel2);
		panel2.setLayout(null);

		b1 = new JButton("Login");
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.setBounds(137, 127, 84, 39);
		panel2.add(b1);
		b1.addActionListener(this);

		b1.setForeground(new Color(0, 0, 0));
		b1.setBackground(new Color(250, 250, 210));

		b2 = new JButton("SignUp");
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.setBounds(222, 127, 84, 39);
		panel2.add(b2);
		b2.addActionListener(this);

		b2.setForeground(new Color(0, 0, 0));
		b2.setBackground(new Color(255, 235, 205));

		JLabel l1 = new JLabel("Username : ");
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		l1.setBounds(55, 54, 75, 24);
		panel2.add(l1);

		JLabel l2 = new JLabel("Password : ");
		l2.setFont(new Font("Tahoma", Font.BOLD, 12));
		l2.setBounds(55, 89, 75, 24);
		panel2.add(l2);

		b3 = new JButton("Forgot Password");
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.setBounds(136, 172, 170, 39);
		panel2.add(b3);
		b3.addActionListener(this);

		b3.setForeground(new Color(0, 0, 0));
		b3.setBackground(new Color(253, 245, 230));
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == b1){
			try {
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");  

				String sql = "select * from account where username=? and password=?";
				PreparedStatement st = con.prepareStatement(sql);

				st.setString(1, textField.getText());
				st.setString(2, passwordField.getText());

				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					this.setVisible(false);
					new Home().setVisible(true);
				} else
					JOptionPane.showMessageDialog(null, "Invalid Login...!.");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(ae.getSource() == b2){
			setVisible(false);
			Signup su = new Signup();
			su.setVisible(true);
		}   
		if(ae.getSource() == b3){
			setVisible(false);
			Forgot forgot = new Forgot();
			forgot.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Login_user().setVisible(true);
	}

}
