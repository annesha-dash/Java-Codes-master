import java.awt.*;

class Registration extends Frame{
	
	TextField t1,t2,t3,t4,t5,t6;
	Button b1,b2;

	Registration(){
		
		
		
		setLayout(new FlowLayout());
		this.setLayout(null);
		
		
		Label l1 = new Label("First name",Label.CENTER);
		t1 = new TextField(40);
		this.add(l1);
		this.add(t1);
		
		Label l2 = new Label("Last name",Label.CENTER);
		t2 = new TextField(40);
		this.add(l2);
		this.add(t2);
		
		
		Label l3 = new Label("Username",Label.CENTER);
		t3 = new TextField(40);
		this.add(l3);
		this.add(t3);
		
		
		Label l4 = new Label("Password",Label.CENTER);
		t4 = new TextField(40);
		t4.setEchoChar('*');
		this.add(l4);
		this.add(t4);
		
		Label l5 = new Label("Confirm Password",Label.CENTER);
		t5 = new TextField(40);
		t5.setEchoChar('*');
		this.add(l5);
		this.add(t5);
		
		Label l6 = new Label("Contact Number",Label.CENTER);
		t6 = new TextField(40);
		this.add(l6);
		this.add(t6);
		
		b1 = new Button("Cancel");
		b2 = new Button("Confirm");
		
		this.add(b1);
		this.add(b2);
		
		l1.setBounds(10,20,40,40);
		l2.setBounds(10,100,40,40);
		l3.setBounds(10,170,40,40);
		l4.setBounds(10,240,40,40);
		l5.setBounds(10,310,40,40);
		l6.setBounds(10,380,40,40);
		
		
		t1.setBounds(80,20,40,120);
		t2.setBounds(80,100,40,120);
		t3.setBounds(80,170,40,120);
		t4.setBounds(80,240,40,120);
		t5.setBounds(80,310,40,120);
		t6.setBounds(80,380,40,120);
		
		b1.setBounds(10,420,40,40);
		b2.setBounds(100,420,40,40);
		
	}
	
	public static void main(String args[]){
		Registration ml=new Registration();
		ml.setVisible(true);
		ml.setSize(800,800);
		ml.setTitle("my Registration window");

}
}