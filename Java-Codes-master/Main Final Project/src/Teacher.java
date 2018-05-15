package main.teacher;


import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;
import main.course.*;
import main.login.*;
import main.user.*;
import main.course.*;
import main.student.*;
import main.connection.*;
import java.util.*;
import main.grade.*;

import main.excel.*;


public class Teacher {
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JButton b4 ;
	JButton b5 ;
	JButton b6 ;
	JButton b7 ;
	JButton b8 ;
    JPanel topBar,thePanel,midBar;
    Box  leftBar,rightBar;


    JList<String> list = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();
	GridBagConstraints cs = new GridBagConstraints();



	public Teacher(TeacherClass t1, UserClass u){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle(t1.getLastName() + " Home");
		
		thePanel = new JPanel();
		thePanel.setLayout( new BorderLayout() );


		
		


		//  ########################TOP BAR GOES HERE############################################# 
		topBar = new JPanel();
		topBar.setLayout(new FlowLayout ( FlowLayout.RIGHT) );

		b1 = new JButton("HOME");
		b1.setForeground(Color.BLACK);
		topBar.add(b1);
		b1.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b1){

		        		layout.setVisible(false);

		        		layout.setVisible(true);
		        		

			            }
			            
		     		}
		     	

		});


		b2 = new JButton("PROFILE");
    	b2.setForeground(Color.BLACK);
    	b2.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b2){

		        		layout.setVisible(false);
		        		new TeacherProfile(layout,t1,u);


			            }
			            
		     		}
		     	

		});
    
    	topBar.add(b2);

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
		topBar.setBorder(new LineBorder(Color.GRAY));


		//############################### LEFT BAR GOES HERE #####################################

		leftBar = Box.createVerticalBox();

		
		b4 = new JButton("ALL COURSES");
		b4.setForeground(Color.BLACK);
		
		b4.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b4){

		        		layout.setVisible(false);
		        		new Course(layout);


			            }
			            
		     		}
		     	

		});

		b4.setPreferredSize(new Dimension(180, 120));
		leftBar.add(Box.createVerticalStrut(30));
		leftBar.add(b4);


		

		
		
	  	leftBar.setBorder(new LineBorder(Color.GRAY));
		//############################### MID BAR GOES HERE ##########################################
		midBar = new JPanel();
	  	midBar.setLayout(new GridBagLayout());
	  	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	  	ArrayList<CourseClass> courseList = CourseClass.getTeacherCourses(u);
	  	cs.fill= GridBagConstraints.HORIZONTAL;


	  	for(CourseClass x : courseList){

	  	//System.out.println(x.toString());
	  	 model.addElement(x.toString());
	  	 
	  	
	  	}


	  	
	  	 b7 = new JButton("See Students");
	  	 b7.addActionListener(e-> {

	  	 	try{

	  	 	String cId = new String();
	  	

	  	 	cId=list.getSelectedValue().substring(0,8);

	  	 	//layout.setVisible(false);

	  	 	new ViewStudent(layout ,cId);
	  	 	
	  		
	  	}catch(Exception a){JOptionPane.showMessageDialog(null, "Nothing is Selected!!");}



	  	 });


	  	 b8 = new JButton("Create Excel");
	  	 b8.addActionListener(e-> {


	  	 	String cId = new String();
	  		
	  		try {

	  	 	cId=list.getSelectedValue().substring(0,8);

	  	 	ArrayList<StudentClass> studentList = ResultQuery.viewCourseStudents(cId);

	  	 	Excel.writeExcel(cId , studentList);
	  	 	
	  

	  	}catch(Exception a){JOptionPane.showMessageDialog(null, "Nothing is Selected!!");}


	  	 });




	  JButton	 b9 = new JButton("Create Grade Excel");
	  	 b9.addActionListener(e-> {


	  	 	String cId = new String();
	  		
	  		try {

	  	 	cId=list.getSelectedValue().substring(0,8);

	  	 	ArrayList<StudentClass> studentList = ResultQuery.viewCourseStudents(cId);

	  	 	Excel.writeResultExcel(cId , studentList);
	  	 	
	  

	  	}catch(Exception a){JOptionPane.showMessageDialog(null, "Nothing is Selected!!");}


	  	 });


	  
		list.setModel(model);


	  	cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(new JScrollPane(list),cs);


		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
        midBar.add(b7,cs);


        cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
        midBar.add(b8,cs);


         cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
        midBar.add(b9,cs);

        midBar.setBorder(new LineBorder(Color.GRAY));

        //################################## Right bar ######################################################


        

        Box rightBar = Box.createVerticalBox();

		
		b5 = new JButton("Set All course Grade");
		b5.setForeground(Color.BLACK);
		
		b5.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b5){

			        		GradeClass.gradeCourse(u);


			            }
			            
		     		}
		     	

		});

		b5.setPreferredSize(new Dimension(180, 120));
		rightBar.add(Box.createVerticalStrut(30));
		rightBar.add(b5);






	  	//############################ Add off the Panels ##################################################

	  	thePanel.add(midBar,BorderLayout.CENTER);
		thePanel.add(leftBar, BorderLayout.WEST);
		thePanel.add(rightBar, BorderLayout.EAST);
		thePanel.add(topBar, BorderLayout.NORTH);


		layout.add(thePanel);
		layout.setVisible(true);
		
	}


	
	
	
}