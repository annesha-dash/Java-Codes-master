import java.awt.*;


class Registration extends Frame{

	Label L1 =new Label("First Name : ");
	Label L2 =new Label("Last Name : ");
    Label L3 =new Label("User Name : ");
    Label L4 =new Label("Password : "); 
    Label L5 =new Label("Confirm Password : ");
    Label L6 =new Label("Contact Number : ");
    Label L7 =new Label("Email : ");


	TextField T1 = new TextField();
	TextField T2 = new TextField();
	TextField T3 = new TextField();
	TextField T4 = new TextField();
	TextField T5 = new TextField();
	TextField T6 = new TextField();
	TextField T7 = new TextField();
	

	Button B1 = new Button("Submit");
	Button B2 = new Button("Cancel");






	public Registration(){
		setVisible(true);
		setSize(550,500);
		setLayout(null);
		

        L1.setBounds(60,60,80,20);
		add (L1);

		L2.setBounds(60,100,80,20);
		add (L2);

		L3.setBounds(60,140,80,20);
		add (L3);

		L4.setBounds(60,180,80,20);
		add (L4);

		L5.setBounds(60,220,110,20);
		add (L5);

		L6.setBounds(60,260,110,20);
		add (L6);

		L7.setBounds(60,300,60,20);
		add (L7);

		T1.setBounds(150,60,330,25);
		add (T1);

		T2.setBounds(150,100,330,25);
		add (T2);

		T3.setBounds(150,140,330,25);
		add (T3);

		T4.setBounds(150,180,330,25);
		add (T4);

		T5.setBounds(180,220,310,25);
		add (T5);

		T6.setBounds(180,260,310,25);
		add (T6);

		T7.setBounds(130,300,310,25);
		add (T7);

		B1.setBounds(130,400,70,30);
		add (B1);

		B2.setBounds(300,400,60,30);
		add (B2);


	}

	
}