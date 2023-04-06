package myPackage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simple_calculator {

	private JFrame frmSimpleCalculator;
	private JTextField number_1_field;
	private JTextField number_2_field;
	private JTextField result_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simple_calculator window = new simple_calculator();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public simple_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setBounds(100, 100, 834, 652);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.setBounds(100, 100, 879, 691);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		number_1_field = new JTextField();
		number_1_field.setFont(new Font("Arial", Font.PLAIN, 12));
		number_1_field.setText("3");
		number_1_field.setBounds(45, 98, 124, 45);
		frmSimpleCalculator.getContentPane().add(number_1_field);
		number_1_field.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(44, 64, 84, 24);
		frmSimpleCalculator.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number 2:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(256, 64, 84, 24);
		frmSimpleCalculator.getContentPane().add(lblNewLabel_1_1);
		
		number_2_field = new JTextField();
		number_2_field.setFont(new Font("Arial", Font.PLAIN, 12));
		number_2_field.setText("4");
		number_2_field.setColumns(10);
		number_2_field.setBounds(257, 98, 124, 45);
		frmSimpleCalculator.getContentPane().add(number_2_field);
		
		JLabel Result = new JLabel("Number 1:");
		Result.setFont(new Font("Arial", Font.PLAIN, 12));
		Result.setBounds(483, 64, 84, 24);
		frmSimpleCalculator.getContentPane().add(Result);
		
		result_field = new JTextField();
		result_field.setFont(new Font("Arial", Font.PLAIN, 12));
		result_field.setColumns(10);
		result_field.setBounds(484, 98, 124, 45);
		frmSimpleCalculator.getContentPane().add(result_field);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel.setBounds(406, 108, 52, 30);
		frmSimpleCalculator.getContentPane().add(lblNewLabel);
		
		JLabel operator_label = new JLabel("");
		operator_label.setFont(new Font("굴림", Font.PLAIN, 53));
		operator_label.setBounds(179, 98, 52, 45);
		frmSimpleCalculator.getContentPane().add(operator_label);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/// step 1) convert text "3" and "4" into integer  (int 3 , int 4)
				/// String : brings text
				
				String number_1_string, number_2_string ; // String version two new variables
				
				number_1_string = number_1_field.getText(); // number_1_string = "3"
				
				number_2_string = number_2_field.getText(); // field 에 있는 text를 선언해준 string 변수에 넣기
															// number_2_string = "4"
				
				if((number_1_string.length()>0)&&(number_2_string.length()>0)){
					
					
				
				
				int int_number_1 , int_number_2 ; // int version two new variables
				
				int_number_1 = Integer.parseInt(number_1_string); // text를 int형으로 바꾸는 방법 
				
				int_number_2 = Integer.parseInt(number_2_string);
				
				int int_result ;
				
				int_result = int_number_1 + int_number_2 ;
				
				// Now we have to make integer result into string to display in textbox
				
				String result_string;
				
				result_string = String.valueOf(int_result); // integer를 text형으로 바꾸는 방법
				
				
				result_field.setText(result_string); // textbox에 text를 넣는 방법
				
				operator_label.setText("+");
				
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btn_plus.setFont(new Font("Arial", Font.PLAIN, 36));
		btn_plus.setBounds(45, 299, 111, 45);
		frmSimpleCalculator.getContentPane().add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				String number_1_string, number_2_string ; 
				
				number_1_string = number_1_field.getText(); 
				
				number_2_string = number_2_field.getText(); 
				
				if((number_1_string.length()>0)&&(number_2_string.length()>0)){
				
				int int_number_1 , int_number_2 ; 
				
				int_number_1 = Integer.parseInt(number_1_string); 
				
				int_number_2 = Integer.parseInt(number_2_string);
				
				int int_result ;
				
				int_result = int_number_1 - int_number_2 ;
				
				
				
				String result_string;
				
				result_string = String.valueOf(int_result); 
				
				
				result_field.setText(result_string); 
				
				operator_label.setText("-");
				
				}
				
				
				
				
			}
		});
		btn_minus.setFont(new Font("Arial", Font.PLAIN, 36));
		btn_minus.setBounds(45, 398, 111, 45);
		frmSimpleCalculator.getContentPane().add(btn_minus);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	String number_1_string, number_2_string ; 
				
				number_1_string = number_1_field.getText(); 
				
				number_2_string = number_2_field.getText(); 
				
				if((number_1_string.length()>0)&&(number_2_string.length()>0)){
				
				int int_number_1 , int_number_2 ; 
				
				int_number_1 = Integer.parseInt(number_1_string); 
				
				int_number_2 = Integer.parseInt(number_2_string);
				
				int int_result ;
				
				int_result = int_number_1 * int_number_2 ;
				
				
				
				String result_string;
				
				result_string = String.valueOf(int_result); 
				
				
				result_field.setText(result_string); 
				
				
				
				operator_label.setText("*");
				
				}
				
				
			}
			
			
		});
		btn_multiply.setFont(new Font("Arial", Font.PLAIN, 36));
		btn_multiply.setBounds(45, 488, 111, 45);
		frmSimpleCalculator.getContentPane().add(btn_multiply);
	}

}
