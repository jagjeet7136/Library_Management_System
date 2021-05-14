package librarymanagementsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Statistics extends JFrame{

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	public static void main(String[] args) {
		new Statistics().setVisible(true);
	}

	public void issueBook() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");
			String sql = "select * from issueBook";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void returnBook() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");
			String sql = "select * from returnBook";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Statistics() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(400, 200, 810, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(22, 65, 751, 263);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setForeground(new Color(0, 128, 128));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 731, 241);
		panel.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		scrollPane.setViewportView(table);

		JLabel l1 = new JLabel("Back");
		l1.setBounds(715, 27, 58, 27);
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(l1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 360, 751, 263);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 21, 731, 231);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		scrollPane_1.setViewportView(table_1);

		JLabel lblNewLabel = new JLabel("Return Book Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 339, 169, 22);
		contentPane.add(lblNewLabel);

		JLabel lblIssueBookDetails = new JLabel("Issue Book Details");
		lblIssueBookDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueBookDetails.setBounds(22, 44, 169, 22);
		contentPane.add(lblIssueBookDetails);


		issueBook();
		returnBook();
	}
}
