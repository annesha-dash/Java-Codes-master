package main.student;


import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.*;
import java.awt.BorderLayout;
import main.course.*;
import main.login.*;
import main.user.*;
import main.grade.*;
import java.util.*;
import javax.swing.border.*;

public class Student {
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JButton b4 ;
	JButton b5 ;
	JButton b6 ;
	JButton b7 ;
	JButton b8 ;
    JPanel topBar,thePanel,midBar;
    Box  leftBar,rightPanel;

    JList<String> list = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();
	GridBagConstraints cs = new GridBagConstraints();


	public Student(StudentClass s1 , UserClass u){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle(s1.getLastName()+"'s HOME");
		
		thePanel = new JPanel();
		thePanel.setLayout( new BorderLayout() );


		
		


		//  ##################################### TOP BAR GOES HERE ############################################# 
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
		        		new StudentProfile(layout, s1 , u);


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

		//b4.setPreferredSize(new Dimension(180, 120));
		leftBar.add(Box.createVerticalStrut(30));
		leftBar.add(b4);




	

	  	leftBar.setBorder(new LineBorder(Color.GRAY));

	  	
		
		

		//############################### MID BAR GOES HERE ##########################################
 	

	  	midBar = new JPanel();
	  	midBar.setLayout(new GridBagLayout());
	  	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	  	ArrayList<CourseClass> courseList = CourseClass.getCurrentCourse(u.getFId());
	  	cs.fill= GridBagConstraints.HORIZONTAL;


	  	for(CourseClass x : courseList){


	  	 model.addElement(x.toString());
	  	 
	  	
	  	}

	  	



	  	list.setModel(model);


	  	cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(new JScrollPane(list),cs);


		 b7 = new JButton("See Grade");
	  	 b7.addActionListener(e-> {
	  	 	String str1 = new String();
	  		String str2 = new String();

	  	 	str1=list.getSelectedValue();

	  	 	
	  	 	str2= CourseClass.viewDetail(str1.substring(0,8));

	  	 	
	  	 	new StudentResult(layout , str1.substring(0,8),u.getFId());
	  	 });


		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
        midBar.add(b7,cs);




       

	

        //############################ RIGHT PANEL ####################################################


      	 rightPanel = Box.createVerticalBox();
      
		b8 = new JButton("REGISTER COURSE");
	  	b8.setForeground(Color.BLACK);

	  	b8.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b8){


						new StudentCourseReg(s1,u);
		        		layout.dispose();


			            }
			            
		     		}
		     	

		});
	  	
	 
	  	rightPanel.add(Box.createVerticalStrut(30));
		rightPanel.add(b8);


	  	rightPanel.setBorder(new LineBorder(Color.GRAY));

	  	//############################ Add off the Panels ##################################################

	  	thePanel.add(midBar,BorderLayout.CENTER);
		thePanel.add(leftBar, BorderLayout.WEST);
		thePanel.add(topBar, BorderLayout.NORTH);
		thePanel.add(rightPanel ,BorderLayout.EAST);


		layout.add(thePanel);
		layout.setVisible(true);
		
	}


	
	
	
}