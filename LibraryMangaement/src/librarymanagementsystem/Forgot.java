package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Forgot extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5;
	private JButton b1,b2,b3;

	public static void main(String[] args) {
		new Forgot().setVisible(true);
	}

	public Forgot() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 

		setBounds(500, 200, 621, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Username");
		l1.setFont(new Font("Tahoma", Font.BOLD, 13));
		l1.setBounds(109, 83, 87, 29);
		contentPane.add(l1);

		JLabel l2 = new JLabel("Name");
		l2.setFont(new Font("Tahoma", Font.BOLD, 13));
		l2.setBounds(109, 122, 75, 21);
		contentPane.add(l2);

		JLabel l3 = new JLabel("Your Security Question");
		l3.setFont(new Font("Tahoma", Font.BOLD, 13));
		l3.setBounds(109, 154, 156, 27);
		contentPane.add(l3);

		JLabel l4 = new JLabel("Answer");
		l4.setFont(new Font("Tahoma", Font.BOLD, 13));
		l4.setBounds(109, 192, 104, 21);
		contentPane.add(l4);

		JLabel l5 = new JLabel("Password");
		l5.setFont(new Font("Tahoma", Font.BOLD, 13));
		l5.setBounds(109, 224, 104, 21);
		contentPane.add(l5);

		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t1.setForeground(new Color(105, 105, 105));
		t1.setBounds(277, 88, 139, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setEditable(false);
		t2.setFont(new Font("Tahoma", Font.BOLD, 13));
		t2.setForeground(new Color(165, 42, 42));
		t2.setColumns(10);
		t2.setBounds(277, 123, 139, 20);
		contentPane.add(t2);

		t3 = new JTextField();
		t3.setEditable(false);
		t3.setFont(new Font("Tahoma", Font.BOLD, 12));
		t3.setForeground(new Color(72, 61, 139));
		t3.setColumns(10);
		t3.setBounds(277, 161, 221, 20);
		contentPane.add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("Tahoma", Font.BOLD, 13));
		t4.setForeground(new Color(205, 92, 92));
		t4.setColumns(10);
		t4.setBounds(277, 193, 139, 20);
		contentPane.add(t4);

		t5 = new JTextField();
		t5.setEditable(false);
		t5.setFont(new Font("Tahoma", Font.BOLD, 13));
		t5.setForeground(new Color(50, 205, 50));
		t5.setColumns(10);
		t5.setBounds(277, 225, 139, 20);
		contentPane.add(t5);

		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.setBounds(428, 83, 80, 29);
		b1.setBackground(new Color(255, 255, 255));
		b1.setForeground(new Color(0, 0, 0));
		contentPane.add(b1);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(47, 45, 508, 281);
		panel.setBackground(new Color(144, 238, 144));
		contentPane.add(panel);
		panel.setLayout(null);

		b3 = new JButton("Back");
		b3.setBounds(330, 223, 85, 29);
		panel.add(b3);
		b3.addActionListener(this);
		b3.setFont(new Font("Tahoma", Font.BOLD, 13));
		b3.setBackground(new Color(255, 255, 255));
		b3.setForeground(new Color(0, 0, 0));

		b2 = new JButton("Check");
		b2.setBounds(222, 223, 85, 29);
		panel.add(b2);
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.setBackground(new Color(255, 255, 255));
		b2.setForeground(new Color(0, 0, 0));
	}

	public void actionPerformed(ActionEvent ae){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root"); 
			if(ae.getSource() == b1){
				String sql = "select * from account where username=?";
				PreparedStatement st = con.prepareStatement(sql);

				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("sec_q"));
				}

			}
			if(ae.getSource() == b2){
				String sql = "select * from account where sec_ans=?";
				PreparedStatement st = con.prepareStatement(sql);

				st.setString(1, t4.getText());
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					t5.setText(rs.getString("password"));
				}

			}
			if(ae.getSource() == b3){
				this.setVisible(false);
				new Login_user().setVisible(true);

			}
		}catch(Exception e){

		}
	}

}
