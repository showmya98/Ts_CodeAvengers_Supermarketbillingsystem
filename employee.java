import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee frame = new employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnEmployee = new JButton("employee");
		btnEmployee.setBounds(163, 11, 89, 23);
		contentPane.add(btnEmployee);
		
		JLabel lblEmployeeId = new JLabel("employee ID");
		lblEmployeeId.setBounds(23, 51, 80, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("employee name");
		lblEmployeeName.setBounds(23, 76, 97, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel label = new JLabel(" ");
		label.setBounds(23, 107, 63, 14);
		contentPane.add(label);
		
		JLabel lblMobileNo = new JLabel("mobile no.");
		lblMobileNo.setBounds(23, 101, 80, 14);
		contentPane.add(lblMobileNo);
		
		JLabel lblAdress = new JLabel("adress");
		lblAdress.setBounds(23, 121, 80, 14);
		contentPane.add(lblAdress);
		
		JLabel lblEmailAdress = new JLabel("email adress");
		lblEmailAdress.setBounds(23, 146, 80, 14);
		contentPane.add(lblEmailAdress);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(23, 181, 46, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(188, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 73, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 101, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(188, 140, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 178, 86, 20);
		contentPane.add(passwordField);
	}
}
