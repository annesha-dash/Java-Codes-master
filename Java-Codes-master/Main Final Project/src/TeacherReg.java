package main.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;
import main.course.*;
import main.teacher.*;
import main.connection.*;

public class TeacherReg{


	JPanel thePanel ;
	JLabel firstName ,lastName ,  password, confirmPassword,  birthdate ,address ,contactNo ,email;
	JTextField firstNameField ,lastNameField ,  birthdateField ,contactNoField ,addressField , emailField;
	JPasswordField passField;
	JPasswordField confirmPassField;
	JButton reg,cancel;



	public TeacherReg(JFrame home){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("Teacher's Registation");


		thePanel = new JPanel();
		thePanel.setLayout( new GridBagLayout() );

		GridBagConstraints cs = new GridBagConstraints();
		cs.fill= GridBagConstraints.HORIZONTAL;

		
		firstName = new JLabel("First Name :");
		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(firstName,cs);



		firstNameField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=2;
		thePanel.add(firstNameField,cs);


		lastName = new JLabel("Last Name :");
		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(lastName,cs);



		lastNameField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=1;
		cs.gridwidth=2;
		thePanel.add(lastNameField,cs);

		password = new JLabel("Password :");
		cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		thePanel.add(password,cs);

		passField = new JPasswordField(15);
		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=2;
		thePanel.add(passField,cs);

		confirmPassword = new JLabel("Confirm Password :");
		cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		thePanel.add(confirmPassword,cs);

		confirmPassField = new JPasswordField(15);
		cs.gridx=1;
		cs.gridy=3;
		cs.gridwidth=2;
		thePanel.add(confirmPassField,cs);


		birthdate = new JLabel("birthdate :");
		cs.gridx=0;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(birthdate,cs);



		birthdateField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=4;
		cs.gridwidth=2;
		thePanel.add(birthdateField,cs);


		address = new JLabel("Address :");
		cs.gridx=0;
		cs.gridy=5;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(address,cs);



		addressField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=5;
		cs.gridwidth=2;
		thePanel.add(addressField,cs);


		contactNo = new JLabel("Contact :");
		cs.gridx=0;
		cs.gridy=6;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(contactNo,cs);



		contactNoField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=6;
		cs.gridwidth=2;
		thePanel.add(contactNoField,cs);


		email = new JLabel("Email :");
		cs.gridx=0;
		cs.gridy=7;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(email,cs);



		emailField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=7;
		cs.gridwidth=2;
		thePanel.add(emailField,cs);


		reg = new JButton("Confirm");

	
			reg.addActionListener(e ->{
			
		        	if(e.getSource() == reg){

		        		
		        		String temp1 = new String(passField.getPassword());
		        		String temp2 = new String(confirmPassField.getPassword());

		        		
		        		if(temp1.equals(temp2) ){

		        				String passFieldTemp =new String( passField.getPassword() );
		        				TeacherClass t1 = new TeacherClass(firstNameField.getText(), lastNameField.getText(), birthdateField.getText(), addressField.getText() ,

		        													 contactNoField.getText(), emailField.getText());

		        				t1.setUserPassword(passFieldTemp);

		        				ResultQuery.createTeacher(t1);



		        		layout.dispose();
		        		home.setVisible(true);


		        		}

		        		else{

		        			JOptionPane.showMessageDialog(null, "Passwords don't match !! ");
		        		}

		        		
			            }
		     	

		});



		
		cs.gridx=2;
		cs.gridy=8;
		cs.gridwidth=1;
		thePanel.add(reg,cs);


		cancel = new JButton("Cancel");

		cancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});

		cs.gridx=1;
		cs.gridy=8;
		cs.gridwidth=1;
		thePanel.add(cancel,cs);



		thePanel.setBorder(new LineBorder(Color.GRAY));


		layout.add(thePanel);
		layout.setVisible(true);
		

	


 }



 
 

}
