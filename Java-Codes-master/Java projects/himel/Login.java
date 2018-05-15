import javax.swing.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener{
	JButton b1 = new JButton("LOGIN");
	JButton b2 = new JButton("REGISTER");
    //Button login = new Button ("Button");
	
	JTextField f1 = new JTextField();
	JTextField f2 = new JTextField();
	
	JLabel l1 = new JLabel("UserName");
	JLabel l2 = new JLabel("Password");

	public Login(){
		setSize(800,640);
		setVisible(true);
		setLayout(null);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b1.setBounds(265,200,50,25);
		add(b1);
		b2.setBounds(170,200,75,25);
		add(b2);

		f1.setBounds(170,50,150,40);
		add(f1);
		f2.setBounds(170,120,150,40);
		add(f2);
		
		l1.setBounds(250,50,100,50);
		add(l1);
		l2.setBounds(250,120,100,50);
		add(l2);
	}
public void actionPerformed(ActionEvent e)
  { 
    if (e.getSource()==b1)
	{ if (l1.getText().equals("abc")&& l2.getText().equals("123")){
	Registration r = new Registration();
		 this.setVisible(false);
		 }
		 
		  else System.out.println("Invalid");

	}
	 
	 else {
		 Registration r = new Registration();
         this.setVisible(false);
         }
   }
}