package swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IP_finder {
	JFrame frame;
	JPanel mainpanel;
JLabel l; 
JLabel exc;
JTextField field;
JButton button;
	public static void main(String[] args) {
		IP_finder p = new IP_finder();
		p.go();
	}
	private void go() {
		// TODO Auto-generated method stub
		 frame = new JFrame("IP Finder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 mainpanel = new JPanel();
		 field = new JTextField(20);		
		 button = new JButton("Find IP");
		button.addActionListener(new ButtonActionListener());
		 JLabel label = new JLabel("Enter website:");
		  l = new JLabel();
		 exc = new JLabel();
		 mainpanel.add(label);
		 mainpanel.add(field);
		 mainpanel.add(button);
		 mainpanel.add(l);
		 mainpanel.add(exc);
		 frame.getContentPane().add(mainpanel);		 
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	 class ButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try{  
		        String host=field.getText();  
		        
		        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
		        l.setText("IP of "+host+" is: "+ip+".");
		        field.setText("");
		        exc.setText("");
		        }catch(Exception ex){
		        	 exc.setText("Not a correct website name");
		        	}  
		    }  
		}
		
	}


