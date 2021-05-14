package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class aboutUs extends JFrame{

	private JPanel contentPane;
	private final JButton b3 = new JButton("Back");

	public static void main(String[] args) {
		new aboutUs().setVisible(true);			
	}

	public aboutUs() {

		super("About me - Jagjeet Singh");
		initGUI();
	}
	private void initGUI() {
		Image icon = Toolkit.getDefaultToolkit().getImage("D://icons8_magazine_20px.png");  
		setIconImage(icon); 

		setBackground(new Color(173, 216, 230));
		setBounds(500, 250, 564, 395);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l3 = new JLabel("Library Mangement System");
		l3.setForeground(new Color(222, 184, 135));
		l3.setFont(new Font("Tahoma", Font.BOLD, 34));
		l3.setBounds(51, 40, 493, 55);
		contentPane.add(l3);


		JLabel l6 = new JLabel("Developed By : Jagjeet Singh");
		l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		l6.setBounds(51, 106, 600, 35);
		contentPane.add(l6);

		JLabel l7 = new JLabel("Contact Me : jagjeet7136@gmail.com");
		l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l7.setBounds(51, 167, 600, 34);
		contentPane.add(l7);

		JLabel l8 = new JLabel("Github Profile : www.github.com/jagjeet7136");
		l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l8.setBounds(51, 212, 600, 34);
		contentPane.add(l8);


		contentPane.setBackground(Color.WHITE);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		b3.setBackground(Color.BLACK);
		b3.setBounds(429, 293, 79, 30);

		contentPane.add(b3);
	}
}

