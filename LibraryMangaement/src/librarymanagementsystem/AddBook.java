package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

@SuppressWarnings("serial")
public class AddBook extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6;
	private JButton b1,b2;
	JComboBox<String> comboBox;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		new AddBook().setVisible(true);
	}

	public void random() {
		Random rd = new Random();
		t1.setText("" + rd.nextInt(1000 + 1));
	}

	public AddBook() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(600, 200, 518, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(51, 40, 398, 352);
		contentPane.add(panel);

		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		b2 = new JButton("Back");
		b2.setBounds(225, 293, 98, 33);
		panel.add(b2);
		b2.addActionListener(this);
		b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		b1 = new JButton("Add");
		b1.setBounds(124, 293, 90, 33);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		t6 = new JTextField();
		t6.setBounds(125, 248, 198, 20);
		panel.add(t6);
		t6.setForeground(new Color(47, 79, 79));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);

		JLabel l5 = new JLabel("Pages");
		l5.setBounds(25, 246, 90, 22);
		panel.add(l5);
		l5.setForeground(new Color(0, 0, 0));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));

		t5 = new JTextField();
		t5.setBounds(125, 217, 198, 20);
		panel.add(t5);
		t5.setForeground(new Color(47, 79, 79));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);

		JLabel l4 = new JLabel("Price");
		l4.setBounds(25, 213, 90, 22);
		panel.add(l4);
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));

		comboBox = new JComboBox<>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(125, 186, 198, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

		JLabel l7 = new JLabel("Edition");
		l7.setBounds(25, 180, 90, 22);
		panel.add(l7);
		l7.setForeground(new Color(0, 0, 0));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));

		t4 = new JTextField();
		t4.setBounds(125, 155, 198, 20);
		panel.add(t4);
		t4.setForeground(new Color(47, 79, 79));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);

		t3 = new JTextField();
		t3.setBounds(125, 124, 198, 20);
		panel.add(t3);
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(125, 93, 198, 20);
		panel.add(t2);
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setBounds(125, 62, 198, 20);
		panel.add(t1);
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setColumns(10);

		JLabel l3 = new JLabel("Publisher");
		l3.setBounds(25, 147, 90, 22);
		panel.add(l3);
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel l2 = new JLabel("ISBN");
		l2.setBounds(25, 122, 90, 22);
		panel.add(l2);
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel l1 = new JLabel("Name");
		l1.setBounds(25, 89, 90, 22);
		panel.add(l1);
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel l6 = new JLabel("Book_id");
		l6.setBounds(25, 60, 90, 22);
		panel.add(l6);
		l6.setForeground(new Color(0, 0, 0));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.setBackground(Color.WHITE);

		lblNewLabel = new JLabel("Add Books");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(53, 11, 179, 29);
		contentPane.add(lblNewLabel);
		random();

	}

	public void actionPerformed(ActionEvent ae){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");

			if(ae.getSource() == b1){
				String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement st = con.prepareStatement(sql);
				// st.setInt(1, Integer.parseInt(textField.getText()));
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, (String) comboBox.getSelectedItem());
				st.setString(6, t5.getText());
				st.setString(7, t6.getText());

				int rs = st.executeUpdate();
				if (rs > 0)
					JOptionPane.showMessageDialog(null, "Successfully Added");
				else
					JOptionPane.showMessageDialog(null, "Error");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				st.close();
			}
			if(ae.getSource() == b2){
				this.setVisible(false);
				new Home().setVisible(true);

			}
			con.close();
		}catch(Exception e){

		}
	}
}