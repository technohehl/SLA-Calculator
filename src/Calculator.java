import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Canvas;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;

public class Calculator {

	private JFrame frame;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblPerYear;
	private JLabel lblPerMonth;
	private JLabel lblPerDay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		lblNewLabel = new JLabel("SLA level");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		lblNewLabel_1 = new JLabel("potential downtime");
		panel_1.add(lblNewLabel_1);
		
		lblPerDay = new JLabel("per day");
		panel_1.add(lblPerDay);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblPerMonth = new JLabel("per month");
		panel_1.add(lblPerMonth);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		lblPerYear = new JLabel("per year");
		panel_1.add(lblPerYear);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
	}

}
