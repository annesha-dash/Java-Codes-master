package main.login;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;
import main.student.*;
import main.teacher.*;
import main.admin.*;
import main.connection.*;
import main.user.*;

public class Login{
	JPanel thePanel = new JPanel();
	JLabel username , password;
	JTextField userField ;
	JPasswordField passField;
	JButton login;



	public Login(){

		JFrame layout = new JFrame();
		layout.setSize(400,400);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("Login");


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

		login = new JButton("Login");

	
			login.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == login){


		        		String passText = new String(passField.getPassword());

		            if(ResultQuery.login( userField.getText(), passText ) ){

		      			 	      			

		               layout.setVisible(false);
					   String id = userField.getText();


					   if(id.length() == 8 ){

					   UserClass u = new UserClass(userField.getText(),passText);
					   u.setStudentFId();
					   StudentClass s1 = ResultQuery.findStudent( u.getFId() );
		               new Student(s1,u);


					   }
					   
					   else if (id.length() == 10){


					   UserClass u = new UserClass( userField.getText(), passText );

					   u.setTeacherFId();

					   TeacherClass t1 = ResultQuery.findTeacher( u.getFId() );
		               new Teacher(t1,u);


					   }
					   
					   else if (id.length() == 9){

					   UserClass u = new UserClass( userField.getText(), passText );

					   u.setAdminFId();

					   AdminClass a1 = ResultQuery.findAdmin( u.getFId() );


		               new Admin(a1, u);
					   }

					  


			            
		     		}


		     		else {

					   	JOptionPane.showMessageDialog(null, "Wrong Username or password! \n Please re-enter");
					   }
		     	}


			}
			            
		     		
		     	

		});



    passField.addKeyListener (new KeyAdapter() {

         public void keyPressed(KeyEvent e) {
				

				 if (e.getKeyCode()==KeyEvent.VK_ENTER){




		        		String passText = new String(passField.getPassword());

		            if(ResultQuery.login( userField.getText(), passText ) ){

		      			 	      			

		               layout.setVisible(false);
					   String id = userField.getText();


					   if(id.length() == 8 ){

					   UserClass u = new UserClass(userField.getText(),passText);
					   u.setStudentFId();
					   StudentClass s1 = ResultQuery.findStudent( u.getFId() );
		               new Student(s1,u);


					   }
					   
					   else if (id.length() == 10){


					   UserClass u = new UserClass( userField.getText(), passText );

					   u.setTeacherFId();

					   TeacherClass t1 = ResultQuery.findTeacher( u.getFId() );
		               new Teacher(t1,u);


					   }
					   
					   else if (id.length() == 9){

					   UserClass u = new UserClass( userField.getText(), passText );

					   u.setAdminFId();

					   AdminClass a1 = ResultQuery.findAdmin( u.getFId() );


		               new Admin(a1, u);
					   }

					  


			            
		     		}


		     		else {

					   	JOptionPane.showMessageDialog(null, "Wrong Username or password! \n Please re-enter");
					   }


					}
	        
	    
	    		}

			});


		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=1;
		thePanel.add(login,cs);

		thePanel.setBorder(new LineBorder(Color.GRAY));


		layout.add(thePanel);
		layout.setVisible(true);
		

	


 }




 

}
