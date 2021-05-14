package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

@SuppressWarnings("serial")
public class AddStudent extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField t1,t2,t3;
	private JComboBox<String> comboBox, comboBox_1, comboBox_2, comboBox_3;
	JButton b1,b2;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		new AddStudent().setVisible(true);
	}

	public void random() {
		Random rd = new Random();
		t1.setText("" + rd.nextInt(10000 + 1));
	}

	public AddStudent() {

		super("Add Student");
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(700, 200, 392, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 38, 358, 348);

		contentPane.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);

		contentPane.add(panel);
		panel.setLayout(null);

		JLabel l1 = new JLabel("Student_id");
		l1.setBounds(32, 21, 102, 22);
		panel.add(l1);
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));

		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(157, 23, 156, 20);
		panel.add(t1);
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setColumns(10);

		JLabel l2 = new JLabel("Name");
		l2.setBounds(32, 54, 40, 22);
		panel.add(l2);
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));

		t2 = new JTextField();
		t2.setBounds(157, 54, 156, 20);
		panel.add(t2);
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);

		JLabel l3 = new JLabel("Father's Name");
		l3.setBounds(32, 92, 102, 22);
		panel.add(l3);
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));

		t3 = new JTextField();
		t3.setBounds(157, 94, 156, 20);
		panel.add(t3);
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);

		JLabel l7 = new JLabel("Course");
		l7.setBounds(32, 125, 102, 22);
		panel.add(l7);
		l7.setForeground(new Color(0, 0, 0));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));

		comboBox_3 = new JComboBox<>();
		comboBox_3.setBackground(new Color(255, 255, 255));
		comboBox_3.setBounds(157, 125, 156, 20);
		panel.add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel<>(
				new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
		comboBox_3.setForeground(new Color(47, 79, 79));
		comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

		JLabel l4 = new JLabel("Branch");
		l4.setBounds(32, 158, 102, 22);
		panel.add(l4);
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));

		comboBox = new JComboBox<>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(157, 160, 156, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
		comboBox.setForeground(new Color(47, 79, 79));
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

		JLabel l5 = new JLabel("Year");
		l5.setBounds(32, 191, 102, 22);
		panel.add(l5);
		l5.setForeground(new Color(0, 0, 0));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));

		comboBox_1 = new JComboBox<>();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(157, 193, 156, 20);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] { "First", "Second", "Third", "Four" }));
		comboBox_1.setForeground(new Color(47, 79, 79));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

		JLabel l6 = new JLabel("Semester");
		l6.setBounds(32, 224, 102, 22);
		panel.add(l6);
		l6.setForeground(new Color(0, 0, 0));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));

		comboBox_2 = new JComboBox<>();
		comboBox_2.setBackground(new Color(255, 255, 255));
		comboBox_2.setBounds(157, 226, 156, 20);
		panel.add(comboBox_2);
		comboBox_2.setModel(
				new DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
		comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		comboBox_2.setForeground(new Color(47, 79, 79));

		b1 = new JButton("ADD");
		b1.setBounds(157, 267, 72, 33);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2 = new JButton("Back");
		b2.setBounds(241, 267, 72, 33);
		panel.add(b2);
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 13, 130, 14);
		contentPane.add(lblNewLabel);
		random();
	}

	public void actionPerformed(ActionEvent ae){
		try{

			if(ae.getSource() == b1){
				try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
							"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root"); 
					String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					st.setString(3, t3.getText());
					st.setString(4, (String) comboBox_3.getSelectedItem());
					st.setString(5, (String) comboBox.getSelectedItem());
					st.setString(6, (String) comboBox_1.getSelectedItem());
					st.setString(7, (String) comboBox_2.getSelectedItem());

					int i = st.executeUpdate();
					if (i > 0){
						JOptionPane.showMessageDialog(null, "Successfully Added");
						this.setVisible(false);
						new Home().setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null, "error");
				}catch(Exception e){
					e.printStackTrace();
				}
			}

			if(ae.getSource() == b2){
				this.setVisible(false);
				new Home().setVisible(true);		
			}
		}catch(Exception e){

		}
	}
}

