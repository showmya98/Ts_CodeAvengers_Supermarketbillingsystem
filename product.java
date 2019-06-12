import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					product frame = new product();
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
	public product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduct = new JLabel("");
		lblProduct.setBounds(50, 47, 89, 14);
		contentPane.add(lblProduct);
		
		JLabel lblProductId = new JLabel("product id");
		lblProductId.setBounds(10, 47, 79, 14);
		contentPane.add(lblProductId);
		
		JButton btnProduct = new JButton("product");
		btnProduct.setBounds(141, 11, 89, 23);
		contentPane.add(btnProduct);
		
		JLabel lblProductName_1 = new JLabel("product name");
		lblProductName_1.setBounds(10, 80, 79, 14);
		contentPane.add(lblProductName_1);
		
		JLabel lblQuantity = new JLabel("quantity");
		lblQuantity.setBounds(10, 116, 46, 14);
		contentPane.add(lblQuantity);
		
		textField = new JTextField();
		textField.setBounds(252, 41, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 77, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(252, 113, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAmount = new JLabel("amount");
		lblAmount.setBounds(10, 155, 46, 14);
		contentPane.add(lblAmount);
		
		textField_3 = new JTextField();
		textField_3.setBounds(252, 144, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
