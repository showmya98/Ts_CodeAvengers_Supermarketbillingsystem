import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnEmployee);
		JMenuItem mntmViewcashier = new JMenuItem("update");
		mntmViewcashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			}
		});
		mnEmployee.add(mntmViewcashier);
		
		JMenuItem mntmView = new JMenuItem("view");
		mnEmployee.add(mntmView);
		
		JMenuItem mntmDelete = new JMenuItem("delete");
		mnEmployee.add(mntmDelete);
		
		JMenuItem mntmAddEmployee = new JMenuItem("AddEmployee");
		mntmAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employee ep=new employee();
				ep.setVisible(true);
			}
		});
		mntmAddEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		mnEmployee.add(mntmAddEmployee);
		
		JMenu mnCategory_1 = new JMenu("category");
		menuBar.add(mnCategory_1);
		
		JMenuItem mntmAdd_1 = new JMenuItem("add");
		mnCategory_1.add(mntmAdd_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("delete");
		mnCategory_1.add(mntmDelete_1);
		
		JMenuItem mntmUpdate = new JMenuItem("update");
		mnCategory_1.add(mntmUpdate);
		
		JMenu mnProduct = new JMenu("product");
		menuBar.add(mnProduct);
		JMenuItem mntmAdd_2 = new JMenuItem("add");
		mnProduct.add(mntmAdd_2);
		
		JMenuItem mntmDelete_2 = new JMenuItem("delete");
		mnProduct.add(mntmDelete_2);
		
		JMenuItem mntmUpdate_1 = new JMenuItem("update");
		mnProduct.add(mntmUpdate_1);
		contentPane = new JPanel();
		menuBar.add(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		JMenuItem menuItem = new JMenuItem("");
		menuItem.setBounds(-11, 94, 129, 22);
		contentPane.add(menuItem);	
		JMenu mnBill = new JMenu("bill");
		mnBill.setHorizontalAlignment(SwingConstants.LEFT);
		mnBill.setBounds(0, 0, 107, 22);
		contentPane.add(mnBill);
		JMenuItem mntmAdd_3 = new JMenuItem("add");
		mnBill.add(mntmAdd_3);
		JMenuItem mntmDelete_3 = new JMenuItem("delete");
		mnBill.add(mntmDelete_3);
		JMenuItem mntmUpdate_2 = new JMenuItem("update");
		mnBill.add(mntmUpdate_2);
		JMenuItem menuItem_1 = new JMenuItem("");
		menuBar.add(menuItem_1);
	}
}
