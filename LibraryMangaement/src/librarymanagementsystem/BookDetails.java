package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class BookDetails extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTextField search;
	private JButton b1_1,b2_1;

	public static void main(String[] args) {
		new BookDetails().setVisible(true);
	}

	public void Book() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root");
			String sql = "select * from book";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {

		}
	}

	public BookDetails() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 
		setBounds(350, 200, 890, 488);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Book Details");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 30));
		l1.setBounds(22, 11, 400, 47);
		contentPane.add(l1);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(22, 58, 828, 367);
		contentPane.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 64, 796, 282);
		panel.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				search.setText(table.getModel().getValueAt(row, 1).toString());
			}
		});
		table.setBackground(new Color(240, 248, 255));
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);

		search = new JTextField();
		search.setBounds(22, 12, 357, 33);
		panel.add(search);
		search.setBackground(new Color(255, 255, 255));
		search.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		search.setForeground(new Color(47, 79, 79));
		search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		search.setColumns(10);

		b1_1 = new JButton("Search");
		b1_1.setBackground(new Color(255, 255, 255));
		b1_1.setBounds(406, 11, 138, 33);
		panel.add(b1_1);
		b1_1.addActionListener(this);
		b1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b1_1.setForeground(new Color(0, 0, 0));
		b1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));

		b2_1 = new JButton("Delete");
		b2_1.setBackground(new Color(255, 255, 255));
		b2_1.setBounds(554, 11, 138, 33);
		panel.add(b2_1);
		b2_1.addActionListener(this);
		b2_1.setForeground(new Color(0, 0, 0));
		b2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		b2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

		JLabel l3 = new JLabel("   Back");
		l3.setBackground(new Color(255, 255, 255));
		l3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		l3.setBounds(702, 11, 72, 33);
		panel.add(l3);
		l3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		Book();
	}

	public void actionPerformed(ActionEvent ae){
		try{

			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/practice?characterEncoding=utf8","root","root"); 
			if(ae.getSource() == b1_1){

				String sql = "select * from book where concat(name, book_id) like ?";
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, "%" + search.getText() + "%");
				ResultSet rs = st.executeQuery();

				table.setModel(DbUtils.resultSetToTableModel(rs));
				rs.close();
				st.close();

			}
			if(ae.getSource() == b2_1){
				String sql = "delete from book where name = '" + search.getText() + "'";
				PreparedStatement st = con.prepareStatement(sql);

				JDialog.setDefaultLookAndFeelDecorated(true);
				int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.NO_OPTION) {

				} else if (response == JOptionPane.YES_OPTION) {
					st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Deleted !!");
				} else if (response == JOptionPane.CLOSED_OPTION) {

				}
				st.close();


			}

			con.close();
		}catch(Exception e){

		}
	}
}
