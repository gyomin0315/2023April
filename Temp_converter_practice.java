package myPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temp_converter_practice {

	private JFrame frame;
	private JTextField num;
	private final ButtonGroup rb_group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temp_converter_practice window = new Temp_converter_practice();
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
	public Temp_converter_practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 828, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		num = new JTextField();
		num.setBounds(12, 26, 766, 114);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JRadioButton FtoC = new JRadioButton("F to C");
		rb_group.add(FtoC);
		FtoC.setFont(new Font("굴림", Font.PLAIN, 25));
		FtoC.setBounds(12, 171, 182, 39);
		frame.getContentPane().add(FtoC);
		
		JRadioButton CtoF = new JRadioButton("C to F");
		rb_group.add(CtoF);
		CtoF.setFont(new Font("굴림", Font.PLAIN, 25));
		CtoF.setBounds(12, 242, 182, 39);
		frame.getContentPane().add(CtoF);
		
		JButton bt_compute = new JButton("Compute");
		bt_compute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double c,f,number;
				
				number = Float.parseFloat(num.getText().toString());
				
				if(CtoF.isSelected())
				{
					c = number;
					f = 1.8*c+32;
					
					num.setText(c+"C     =" + f + "      F"  );
					
				}
				else
				{
					f=number;
					c = (f-32)*5/9;
					num.setText(f+"F     =" + c + "      C"  );
					
				}
				
				
				
				
				
			}
		});
		bt_compute.setBounds(12, 310, 211, 39);
		frame.getContentPane().add(bt_compute);
		
		JButton bt_clear = new JButton("Clear");
		bt_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num.setText("");
				
				rb_group.clearSelection();
				
			}
		});
		bt_clear.setBounds(12, 387, 211, 39);
		frame.getContentPane().add(bt_clear);
	}
}
