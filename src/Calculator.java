import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sla;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JLabel lblPerYear;
	private JLabel lblPerMonth;
	private JLabel lblPerDay;
	private JButton calculate;
	private JPanel panel_2;

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
		
		sla = new JTextField();
		panel.add(sla);
		sla.setColumns(10);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		calculate = new JButton("Calculate");
		panel_2.add(calculate);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Fetch SLA level from field and convert all "," to "."
				 */
				float sla_level;
				sla_level = Float.valueOf(sla.getText().replace(",", "."));
				/*
				 * secondes of day, month, year
				 */
				float day = 60 * 60 * 24;
				float month = day * 28;
				float year = month * 12;
			}
		});
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		lblNewLabel_1 = new JLabel("potential downtime");
		panel_1.add(lblNewLabel_1);
		
		lblPerDay = new JLabel("per day");
		panel_1.add(lblPerDay);
		
		day = new JTextField();
		day.setEditable(false);
		panel_1.add(day);
		day.setColumns(10);
		
		lblPerMonth = new JLabel("per month");
		panel_1.add(lblPerMonth);
		
		month = new JTextField();
		month.setEditable(false);
		panel_1.add(month);
		month.setColumns(10);
		
		lblPerYear = new JLabel("per year");
		panel_1.add(lblPerYear);
		
		year = new JTextField();
		year.setEditable(false);
		panel_1.add(year);
		year.setColumns(10);
	}

}
