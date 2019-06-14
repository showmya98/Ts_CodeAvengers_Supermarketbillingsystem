import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.EmployeeDao;
import Dao.categoryDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class category extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	protected JLabel textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					category frame = new category();
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
	public category() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategoryType = new JLabel("category type");
		lblCategoryType.setBounds(26, 60, 111, 14);
		contentPane.add(lblCategoryType);
		
		JLabel lblCategoryId = new JLabel("category id");
		lblCategoryId.setBounds(26, 107, 96, 14);
		contentPane.add(lblCategoryId);
		
		textField = new JTextField();
		textField.setBounds(209, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 104, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String category_type=textField_1.getText();
				int category_id=Int(textField_2.getText());
				if(categoryDao.checkemployee(category_id)){
				
				int i=categoryDao.save(category_id, category_type);
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
		btnSubmit.setBounds(120, 160, 89, 23);
		contentPane.add(btnSubmit);
		
		protected int Int(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
		JLabel lblCategory = new JLabel("category");
		lblCategory.setBounds(166, 11, 46, 14);
		contentPane.add(lblCategory);
	}
}
