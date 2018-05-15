import javax.swing.*;
import java.awt.event.*;


class Registration extends JFrame{
	JButton b1 = new JButton("CANCEL");
	JButton b2 = new JButton("SUBMIT");
        
	JTextField f1 = new JTextField();
	JTextField f2 = new JTextField();
	JTextField f3 = new JTextField();
	JTextField f4 = new JTextField();
	JTextField f5 = new JTextField();
	JTextField f6 = new JTextField();
	JTextField f7 = new JTextField();
	
	JLabel l1 = new JLabel("First Name");
	JLabel l2 = new JLabel("Last Name");
	JLabel l3 = new JLabel("User Name");
	JLabel l4 = new JLabel("Password");
	JLabel l5 = new JLabel("Confirm Password");
	JLabel l6 = new JLabel("Contact Number");
	JLabel l7 = new JLabel("Email");
	
	public Registration(){
		setSize(400,800);
		setVisible(true);
		setLayout(null);
		
		b1.setBounds(150,540,75,25);
		add(b1);
		b2.setBounds(246,540,75,25);
		add(b2);
		
		f1.setBounds(170,50,150,40);
		add(f1);
		f2.setBounds(170,120,150,40);
		add(f2);
		f3.setBounds(170,190,150,40);
		add(f3);
		f4.setBounds(170,260,150,40);
		add(f4);
		f5.setBounds(170,330,150,40);
		add(f5);
		f6.setBounds(170,400,150,40);
		add(f6);
		f7.setBounds(170,470,150,40);
		add(f7);
		
		l1.setBounds(50,50,100,50);
		add(l1);
		l2.setBounds(50,120,100,50);
		add(l2);
		l3.setBounds(50,190,100,50);
		add(l3);
		l4.setBounds(50,260,100,50);
		add(l4);
		l5.setBounds(50,330,150,50);
		add(l5);
		l6.setBounds(50,400,150,50);
		add(l6);
		l7.setBounds(50,470,100,50);
		add(l7);
	}
}