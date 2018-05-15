package main.admin;


import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import main.course.*;
import main.grade.*;
import main.login.*;
import main.user.*;



public class Admin {
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JButton b4 ;
	JButton b5 ;
	JButton b6 ;
    JPanel topBar,thePanel,midBar;
    Box  leftBar;
	
	public Admin( AdminClass a1, UserClass u ){

		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle(a1.getLastName()+"'s Home");
		
		thePanel = new JPanel();
		thePanel.setLayout( new BorderLayout() );


		
		


		//  ########################TOP BAR GOES HERE############################################# 
		topBar = new JPanel();
		topBar.setLayout(new FlowLayout ( FlowLayout.RIGHT) );

		b1 = new JButton("HOME");
		b1.setForeground(Color.BLACK);

		b1.addActionListener( e ->{
			
		        	if(e.getSource() == b1){

		        		layout.setVisible(false);

		        		layout.setVisible(true);
		        		

			            }
			            
		     		
		     	

		});

		topBar.add(b1);


		b2 = new JButton("PROFILE");
    	b2.setForeground(Color.BLACK);
    	b2.addActionListener( e -> {
			
		        	if(e.getSource() == b2){

		        		layout.setVisible(false);
		        		new AdminProfile(layout,a1,u);


			            }
			            
		     		
		     	

		});
    
    	topBar.add(b2);

		b3 = new JButton("LOGOUT");
	  	b3.setForeground(Color.BLACK);
	  	b3.addActionListener(e ->{
			
		        	if(e.getSource() == b3){

		        		layout.dispose();
		        		new Login();


			            }
			            
		     		
	  	
		     	

		});

	  	topBar.add(b3);
		//topBar.setBorder(new LineBorder(Color.GRAY));


		//############################### LEFT BAR GOES HERE #####################################

		leftBar = Box.createVerticalBox();

		
		b4 = new JButton("ALL COURSES");
		b4.setForeground(Color.BLACK);
		b4.setPreferredSize(new Dimension(180, 120));
		leftBar.add(Box.createVerticalStrut(30));
		b4.addActionListener( e -> {

			
			
		        	if(e.getSource() == b4){

		        		layout.setVisible(false);
		        		new Course(layout);


			            }
			            
		     		
		     	

		});

	


	  

		leftBar.add(b4);
		

		//############################### MID BAR GOES HERE ##########################################

	  	midBar = new JPanel();
	  	midBar.setLayout(new GridBagLayout());
	  	GridBagConstraints cs = new GridBagConstraints();
		cs.fill= GridBagConstraints.HORIZONTAL;

		

		JLabel addStudents = new JLabel("Add Students :");
		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(addStudents,cs);



		JButton studentBtn = new JButton("Add");
		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=2;
		midBar.add(studentBtn,cs);
		studentBtn.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == studentBtn){

		        		StudentReg s1 = new StudentReg(layout);
		        		layout.setVisible(false);
			            }
			            
		     		
		     	}

		});


		JLabel addTeacher = new JLabel("Add Teacher :");
		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(addTeacher,cs);



		JButton teacherBtn = new JButton("Add");
		cs.gridx=1;
		cs.gridy=1;
		cs.gridwidth=2;
		midBar.add(teacherBtn,cs);
		teacherBtn.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == teacherBtn){

		        		TeacherReg s1 = new TeacherReg(layout);
		        		layout.setVisible(false);
			            }
			            
		     		
		     	}

		});



		JLabel addCourses = new JLabel("Add Courses :");
		cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(addCourses,cs);



		JButton courseBtn = new JButton("Add");
		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=2;
		courseBtn.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == courseBtn){

		        		CourseReg s1 = new CourseReg(layout);
		        		layout.setVisible(false);
			            }
			            
		     		
		     	}

		});
		midBar.add(courseBtn,cs);


		midBar.setBorder(new LineBorder(Color.GRAY));






		JLabel addSemester = new JLabel("Add Semester :");
		cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midBar.add(addSemester,cs);



		JButton semesterBtn = new JButton("Add");
		cs.gridx=1;
		cs.gridy=3;
		cs.gridwidth=2;
		
		semesterBtn.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == semesterBtn){

		        		JFrame temp = new JFrame("New Semester");
						temp.setSize(300,300);
						temp.setLocationRelativeTo(null);
						temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						temp.setVisible(true);


						JPanel cTempPanel = new JPanel();
						cTempPanel.setLayout( new FlowLayout() );

						JLabel semesterName = new JLabel("Semester Name :");
						JTextField semesterText = new JTextField(10);

						JButton create = new JButton("Create Semester");
						create.addActionListener(r-> {


						SemesterClass s1 = new SemesterClass(semesterText.getText() );

							SemesterClass.createSemester(s1);
							temp.dispose();



						});

						cTempPanel.add(semesterName);
						cTempPanel.add(semesterText);
						cTempPanel.add(create);

						temp.add(cTempPanel);

					    }
			            
		     		
		     	}

		});
		midBar.add(semesterBtn,cs);





		//#################################### RIGHT BAR ##################################################



	



	  	//############################ Add off the Panels ##################################################

	  	thePanel.add(midBar,BorderLayout.CENTER);
		thePanel.add(leftBar, BorderLayout.WEST);
		//thePanel.add(rightBar, BorderLayout.EAST);
		thePanel.add(topBar, BorderLayout.NORTH);


		layout.add(thePanel);
		layout.setVisible(true);
		
	}


	

}