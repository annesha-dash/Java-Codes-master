package sample;

//package main.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;

//import main.student.*;
//import main.teacher.*;
public class StudentReg{


    JPanel thePanel ;
    JLabel username , password,confirmPassword,name , birthdate ,address ,contactNo , parentsName , parentsNo;
    JTextField userField,nameField , birthdateField ,contactNoField ,addressField, parentsNameField , parentsNoField;
    JPasswordField passField;
    JPasswordField confirmPassField;
    JButton reg;



    public StudentReg(){

        JFrame layout = new JFrame();
        layout.setSize(800,640);
        layout.setLocationRelativeTo(null);
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setTitle("Student Registation");


        thePanel = new JPanel();
        thePanel.setLayout( new GridBagLayout() );

        GridBagConstraints cs = new GridBagConstraints();
        cs.fill= GridBagConstraints.HORIZONTAL;



        username = new JLabel("Username");
        cs.gridx=0;
        cs.gridy=0;
        cs.gridwidth=1;
        cs.insets = new Insets(5,5,5,5);
        thePanel.add(username,cs);



        userField = new JTextField(15);
        cs.gridx=1;
        cs.gridy=0;
        cs.gridwidth=2;
        thePanel.add(userField,cs);

        password = new JLabel("Password");
        cs.gridx=0;
        cs.gridy=1;
        cs.gridwidth=1;
        thePanel.add(password,cs);

        passField = new JPasswordField(15);
        cs.gridx=1;
        cs.gridy=1;
        cs.gridwidth=2;
        thePanel.add(passField,cs);

        confirmPassword = new JLabel(" Confirm Password");
        cs.gridx=0;
        cs.gridy=2;
        cs.gridwidth=1;
        thePanel.add(confirmPassword,cs);

        confirmPassField = new JPasswordField(15);
        cs.gridx=1;
        cs.gridy=2;
        cs.gridwidth=2;
        thePanel.add(confirmPassField,cs);

        name = new JLabel("Name");
        cs.gridx=0;
        cs.gridy=3;
        cs.gridwidth=1;
        cs.insets = new Insets(5,5,5,5);
        thePanel.add(name,cs);



        nameField = new JTextField(15);
        cs.gridx=1;
        cs.gridy=3;
        cs.gridwidth=2;
        thePanel.add(nameField,cs);

        birthdate = new JLabel("birthdate");
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


        address = new JLabel("Address");
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


        parentsName = new JLabel("Parents Name :");
        cs.gridx=0;
        cs.gridy=7;
        cs.gridwidth=1;
        cs.insets = new Insets(5,5,5,5);
        thePanel.add(parentsName,cs);



        parentsNameField = new JTextField(15);
        cs.gridx=1;
        cs.gridy=7;
        cs.gridwidth=2;
        thePanel.add(parentsNameField,cs);

        parentsNo = new JLabel("Parents Contact :");
        cs.gridx=0;
        cs.gridy=8;
        cs.gridwidth=1;
        cs.insets = new Insets(5,5,5,5);
        thePanel.add(parentsNo,cs);



        parentsNoField = new JTextField(15);
        cs.gridx=1;
        cs.gridy=8;
        cs.gridwidth=2;
        thePanel.add(parentsNoField,cs);



		/*reg = new JButton("Confirm");


			login.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){

		        	if(e.getSource() == login){

		        		String passText = new String(passField.getPassword());

		            if(LoginChecker.login( userField.getText(), passText ) ){

		               layout.setVisible(false);
		               new Student(userField.getText());

			            }

		     		}
		     	}

		});*/


        cs.gridx=1;
        cs.gridy=9;
        cs.gridwidth=1;
        thePanel.add(reg,cs);

        thePanel.setBorder(new LineBorder(Color.GRAY));


        layout.add(thePanel);
        layout.setVisible(true);





    }



    public static void main(String[] args){

        new StudentReg();

    }


}
