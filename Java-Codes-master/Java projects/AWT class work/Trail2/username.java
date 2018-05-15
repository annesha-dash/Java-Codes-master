import java.awt.*;
import java.awt.event.*;

class MyLoginWindow extends Frame implements ActionListener
		{
			
		TextField name,pass;
		Button b1,b2;
		
		
		MyLoginWindow()
		{
		setLayout(new FlowLayout());
		this.setLayout(null);
		Label n=new Label("Name:",Label.CENTER);
		Label p=new Label("password:",Label.CENTER);
		
		
		name=new TextField(40);
		pass=new TextField(40);
		pass.setEchoChar('*');
		b1=new Button("Register");
		b2=new Button("LOGIN");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.add(n);
		this.add(name);
		this.add(p);
		this.add(pass);
		this.add(b1);
		this.add(b2);
		
		
		n.setBounds(70,90,90,60);
		p.setBounds(70,130,90,60);
		name.setBounds(200,100,90,20);
		pass.setBounds(200,140,90,20);
		b1.setBounds(100,260,70,40);
		b2.setBounds(180,260,70,40);
		
		
		
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == b2 ){
				

				
				if (name.getText().equals("abc") && pass.getText().equals("123")) {
				Welcome w1 = new Welcome();
				this.setVisible(false);
				
				}
				
				else System.out.println("INVALID");
			
			}
			
			else{
				Registration r1 = new Registration();
				this.setVisible(false);
				
		}

}
		}