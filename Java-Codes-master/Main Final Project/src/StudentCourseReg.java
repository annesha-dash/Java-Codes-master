package main.course;

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;
import main.login.*;
import java.util.*;
import main.course.*;
import main.student.*;
import main.user.*;



public class StudentCourseReg {
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JButton b4 ;
	JButton b5 ;
	JButton b6 ;
	JButton b7 ;
	JButton b8 ;
    JPanel topBar,thePanel,midBar;
    Box  leftBar;
    JList<String> list = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();

    
	
	public StudentCourseReg(StudentClass s1,UserClass u){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("REGISTER COURSE");
		
		thePanel = new JPanel();
		thePanel.setLayout( new BorderLayout() );


		
		


		//  ########################TOP BAR GOES HERE############################################# 
		topBar = new JPanel();
		topBar.setLayout(new FlowLayout ( FlowLayout.RIGHT) );

		b1 = new JButton("HOME");
		b1.setForeground(Color.BLACK);
		b1.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b1){

		  
		        		layout.dispose();
		        		new Student(s1,u);

			            }
			            
		     		}
		     	

		});

		topBar.add(b1);

	

		b3 = new JButton("LOGOUT");
	  	b3.setForeground(Color.BLACK);
	  	b3.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b3){

		        		layout.dispose();
		        		new Login();


			            }
			            
		     		}
		     	

		});
	  	topBar.add(b3);
	  	

		//############################### LEFT BAR GOES HERE #####################################

		

		//############################### MID BAR GOES HERE ##########################################
	  	midBar = new JPanel();
	  	midBar.setLayout(new FlowLayout(FlowLayout.CENTER));
	  	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	  	ArrayList<CourseClass> courseList = CourseClass.regCourseAll(u.getFId());

	  	for(CourseClass x : courseList){


	  	 model.addElement(x.toString());
	  	 
	  	
	  	}

	  	
	  	 b7 = new JButton("Register");
	  	 b7.addActionListener(e-> {

	  	 	String str1=list.getSelectedValue();

	  	 	StudentClass.registerCourse(u.getFId() , str1.substring(0,8));

	  	 	JOptionPane.showMessageDialog(null, "You have registered to \n"+str1);
	  	 	
	  	 });
	  	list.setModel(model);
		midBar.add(new JScrollPane(list));
        midBar.add(b7);

  
	



	  	//############################ Add off the Panels ##################################################

	  	thePanel.add(midBar,BorderLayout.CENTER);
		//thePanel.add(leftBar, BorderLayout.WEST);
		thePanel.add(topBar, BorderLayout.NORTH);


		layout.add(thePanel);
		layout.setVisible(true);
		
	}

	
	

	
}