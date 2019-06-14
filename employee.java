import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.EmployeeDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	JFrame frame;
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
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);
		
		JLabel lblemployee = new JLabel("Employee");
		lblemployee.setBounds(161, 16, 88, 25);
		contentPane.add(lblemployee);
		
		JLabel lblEmployeeName = new JLabel("Employee name");
		lblEmployeeName.setBounds(30, 53, 108, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployeeId = new JLabel("Employee id");
		lblEmployeeId.setBounds(30, 90, 108, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeePhno = new JLabel("Employee phno");
		lblEmployeePhno.setBounds(30, 122, 94, 14);
		contentPane.add(lblEmployeePhno);
		
		textField = new JTextField();
		textField.setBounds(195, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 84, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 119, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			private JLabel textField_3;

			public void actionPerformed(ActionEvent e) {
				String employee_name=textField_1.getText();
	
				int Employee_id=Integer.parseInt(textField_2.getText());
				
				String Employee_phno= (textField_3.getText());
		

				if(EmployeeDao.checkemployee(Employee_id)){
				
				int i=EmployeeDao.save(employee_name, Employee_id, Employee_phno);
				if(i>0){
					JOptionPane.showMessageDialog(employee.this,"employee added  successfully!");
					menu.main(new String[]{});
				
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(employee.this,"Sorry does n't exist ");
				}//end of save if-else
				
				}
				}
			});
		btnSubmit.setBounds(100, 186, 138, 23);
		contentPane.add(btnSubmit);
	}
}
