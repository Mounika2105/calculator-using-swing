package calculators;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculators {

	private JFrame frame;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculators window = new Calculators();
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
	public Calculators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 246, 42);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//..............................row 1...............................
		
				JButton btnBackSpace = new JButton("\uF0E7");
				btnBackSpace.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String backspace=null;
						
						if(txtDisplay.getText().length()>0) {
							StringBuilder strB=new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length()-1);
							backspace=strB.toString();
							txtDisplay.setText(backspace);
						}
						
					}
				});
				btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
				btnBackSpace.setBounds(10, 64, 58, 50);
				frame.getContentPane().add(btnBackSpace);
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						txtDisplay.setText(null);
					}
				});
				btnClear.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnClear.setBounds(72, 64, 58, 50);
				frame.getContentPane().add(btnClear);
				
				JButton btnMod = new JButton("%");
				btnMod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="%";
					}
				});
				btnMod.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnMod.setBounds(135, 64, 58, 50);
				frame.getContentPane().add(btnMod);
				
				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="+";
						
					}
				});
				btnPlus.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnPlus.setBounds(198, 64, 58, 50);
				frame.getContentPane().add(btnPlus);
	
		//..............................row 2...............................
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(SystemColor.desktop);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btn7.setBounds(10, 120, 58, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btn8.setBounds(72, 120, 58, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber= txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btn9.setBounds(135, 120, 58, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnMinus.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMinus.setBounds(198, 120, 58, 50);
		frame.getContentPane().add(btnMinus);
		
		
		// ..............................row 3...............................
		
				
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn4.setBounds(10, 178, 58, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 =  new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
			    btn5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn5.setBounds(72, 178, 58, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn6.setBounds(135, 178, 58, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnMul = new JButton("*");
				btnMul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="*";
					}
				});
				btnMul.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnMul.setBounds(198, 178, 58, 50);
				frame.getContentPane().add(btnMul);
				
// ..............................row 4...............................
		
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn1.setBounds(10, 235, 58, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn2.setBounds(72, 235, 58, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn3.setBounds(135, 235, 58, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="/";
					}
				});
				btnDiv.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnDiv.setBounds(198, 235, 58, 50);
				frame.getContentPane().add(btnDiv);
				
// ..............................row 5...............................
		
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber= txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btn0.setBounds(10, 291, 58, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber= txtDisplay.getText() + btnDot.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btnDot.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnDot.setBounds(72, 291, 58, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+/-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops=ops*(-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnPM.setBounds(134, 291, 60, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String answer;
						secondnum=Double.parseDouble(txtDisplay.getText());
						if(operations=="+")
						{
						result=firstnum+secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if (operations=="-")
						{
							result=firstnum-secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
							
						}
						else if (operations=="*")
						{
							result=firstnum*secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
							
						}
						else if (operations=="/")
						{
							result=firstnum/secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
							
						}
						else if (operations=="%")
						{
							result=firstnum%secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
							
						}
						
				     }
				});
				btnEqual.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
				btnEqual.setBounds(198, 291,58, 50);
				frame.getContentPane().add(btnEqual);
	}
}
