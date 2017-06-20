//by Eunsun Kim (055219141)
// GUI : Temperature conversion app
// convert from Fahrenheit to Cesius.  User input from the keyboard(via a JTextField)

import java.awt.*;
import java.awt.event.ActionListener;   //addActionListener
import java.awt.event.ActionEvent;
import javax.swing.*;

@SuppressWarnings("serial")
public class Part3TempConvert extends JFrame {
	
	private JLabel title, display;           
	private JTextField inputField, result;
		
	public Part3TempConvert(){                    // constructor , setup GUI
		super("Temperature Converter");
				
		title = new JLabel(" Enter Fahrenheit Temp : ");      // title
		inputField = new JTextField(10);	                  // input
				
		inputField.addActionListener(				          // action listner regist
				new ActionListener() {                         
					public void actionPerformed(ActionEvent e){  // perform conversions
												
						int temperature = Integer.parseInt( inputField.getText());
						int celcius = (int)( 5.0f/9.0f * ( temperature - 32 ));
						result.setText( String.valueOf( celcius ) );				
					}  //end perform conversions
				}  //end action listner regist
			); // end call to addActionListener
	
		display = new JLabel(" Celcius is : " );
		result = new JTextField(10);
		Container container = getContentPane();
		container.setLayout( new GridLayout(4,1) );
		container.add(title);                         //add components to GUI
		container.add(inputField);
		container.add(display);
		container.add(result);
	}	
	
	public static void main(String[] args) {          // main
		Part3TempConvert gui = new Part3TempConvert();
		gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gui.setSize(350,150);
		gui.setVisible( true );
	}
}  //end class Part3TempConvert
