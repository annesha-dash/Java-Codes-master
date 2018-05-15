package main.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;
import main.course.*;
import main.connection.*;


public class CourseReg{


	JPanel thePanel ;
	JLabel name ,tId, seat, section , semester ;
	JTextField nameField,tIdField, seatField ,sectionField,semesterField;
	JPasswordField passField;
	JPasswordField confirmPassField;
	JButton reg,cancel;



	public CourseReg(JFrame home){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("Course Registation");


		thePanel = new JPanel();
		thePanel.setLayout( new GridBagLayout() );

		GridBagConstraints cs = new GridBagConstraints();
		cs.fill= GridBagConstraints.HORIZONTAL;

		

		name = new JLabel("Course Name :");
		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(name,cs);



		nameField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=2;
		thePanel.add(nameField,cs);

		tId = new JLabel("Teacher's ID :");
		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		thePanel.add(tId,cs);

		tIdField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=1;
		cs.gridwidth=2;
		thePanel.add(tIdField,cs);

		seat = new JLabel("Seat :");
		cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		thePanel.add(seat,cs);

		seatField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=2;
		thePanel.add(seatField,cs);

		section = new JLabel("Section :");
		cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(section,cs);



		sectionField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=3;
		cs.gridwidth=2;
		thePanel.add(sectionField,cs);

		semester = new JLabel("Semester ID :");
		cs.gridx=0;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		thePanel.add(semester,cs);



		semesterField = new JTextField(15);
		cs.gridx=1;
		cs.gridy=4;
		cs.gridwidth=2;
		thePanel.add(semesterField,cs);


		

		reg = new JButton("Confirm");

	
			reg.addActionListener(e->{
			
		        	if(e.getSource() == reg){


		        		int temp = Integer.parseInt(seatField.getText());

		        		CourseClass c1 = new CourseClass(nameField.getText(), temp ,sectionField.getText() ,
		        										 semesterField.getText(), tIdField.getText() );

		        		ResultQuery.createCourse(c1);
		        		layout.setVisible(false);
		        		home.setVisible(true);

			            }
			            
		     		
		     	

		});

		
		cs.gridx=1;
		cs.gridy=5;
		cs.gridwidth=1;
		thePanel.add(reg,cs);


		cancel = new JButton("Cancel");

		cancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});

		cs.gridx=0;
		cs.gridy=5;
		cs.gridwidth=1;
		thePanel.add(cancel,cs);

		thePanel.setBorder(new LineBorder(Color.GRAY));


		layout.add(thePanel);
		layout.setVisible(true);
		

	


 }



 
 

}
