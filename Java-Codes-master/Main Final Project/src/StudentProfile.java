package main.student;

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import main.course.*;
import main.login.*;
import main.user.*;


public class StudentProfile {

	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JButton b4 ;
	JButton b5 ;
	JButton b6 ;
	JButton b7 ;
	JButton b8 ;
	
	//JScrollPane scroller;

	JPanel topBar,thePanel,midBar;
	Box  leftBar,rightBar;
        
	
	
	public StudentProfile(JFrame home,StudentClass s1 , UserClass u){
		JFrame layout = new JFrame();
		layout.setSize(1024,800);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle(s1.getLastName()+"'s profile");
		thePanel = new JPanel();
		thePanel.setLayout( new BorderLayout() );




		// ########################TOP BAR GOES HERE############################################# 

		topBar = new JPanel();
		topBar.setLayout(new FlowLayout ( FlowLayout.RIGHT) );

		b1 = new JButton("HOME");
		b1.setForeground(Color.BLACK);
		
		b1.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b1){

		  
		        		layout.setVisible(false);
		        		home.setVisible(true);

			            }
			            
		     		}
		     	

		});

		topBar.add(b1);

		b2 = new JButton("PROFILE");
    	b2.setForeground(Color.BLACK);
    	b2.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b1){

		        		layout.setVisible(false);

		        		layout.setVisible(true);
		        		

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
		        		new Course(home);


			            }
			            
		     		}
		     	

		});


		b4.setPreferredSize(new Dimension(180, 120));
		leftBar.add(Box.createVerticalStrut(30));
		leftBar.add(b4);

       	
      

		leftBar.setBorder(new LineBorder(Color.GRAY));

		//############################### MID BAR GOES HERE ##########################################


	  	midBar = new JPanel();
		midBar.setLayout( new GridBagLayout() );


		JLabel l1 = new JLabel("NAME");
		JLabel l2 = new JLabel(s1.getLastName()+" , "+s1.getFirstName() );
		l2.setBorder(BorderFactory.createEtchedBorder());
        l2.setOpaque(true);         // required for background colors
        l2.setBackground(UIManager.getColor("TextField.background"));
        l2.setFont(UIManager.getFont("TextField.font"));
		addComp(midBar, l1, 0, 0, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l2, 1, 0, 1, 1, GridBagConstraints.WEST);

		JLabel l3 = new JLabel("BIRTH DATE");
		JLabel l4 = new JLabel(s1.getBirthDate());
		l4.setBorder(BorderFactory.createEtchedBorder());
        l4.setOpaque(true);         // required for background colors
        l4.setBackground(UIManager.getColor("TextField.background"));
        l4.setFont(UIManager.getFont("TextField.font"));
		addComp(midBar, l3, 0, 1, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l4, 1, 1, 1, 1, GridBagConstraints.WEST);

		JLabel l5 = new JLabel("ADDRESS");
		JLabel l6 = new JLabel(s1.getAddress());
		l6.setBorder(BorderFactory.createEtchedBorder());
        l6.setOpaque(true);         // required for background colors
        l6.setBackground(UIManager.getColor("TextField.background"));
        l6.setFont(UIManager.getFont("TextField.font"));
		addComp(midBar, l5, 0, 2, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l6, 1, 2, 1, 1, GridBagConstraints.WEST);


		JLabel l7 = new JLabel("CONTACT NUMBER");
		JLabel l8 = new JLabel(s1.getContactNo());
		l8.setBorder(BorderFactory.createEtchedBorder());
        l8.setOpaque(true);         // required for background colors
        l8.setBackground(UIManager.getColor("TextField.background"));
        l8.setFont(UIManager.getFont("TextField.font"));
		addComp(midBar, l7, 0, 3, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l8, 1, 3, 1, 1, GridBagConstraints.WEST);
		//addComp(midBar, b7, 2, 4, 1, 1, GridBagConstraints.WEST);	

		JLabel l9 = new JLabel("EMAIL");
		JLabel l10 = new JLabel(s1.getEmail());
		l10.setBorder(BorderFactory.createEtchedBorder());
        l10.setOpaque(true);         // required for background colors
        l10.setBackground(UIManager.getColor("TextField.background"));
        l10.setFont(UIManager.getFont("TextField.font"));
	
		addComp(midBar, l9, 0, 5, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l10, 1, 5, 1, 1, GridBagConstraints.WEST);
		//addComp(midBar, b7, 2, 6, 1, 1, GridBagConstraints.WEST);



		JLabel l11 = new JLabel("PARENTS NAME");

		JLabel l12 = new JLabel(s1.getParentsName());
		l12.setBorder(BorderFactory.createEtchedBorder());
        l12.setOpaque(true);         // required for background colors
        l12.setBackground(UIManager.getColor("TextField.background"));
        l12.setFont(UIManager.getFont("TextField.font"));
	
		addComp(midBar, l11, 0, 7, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l12, 1, 7, 1, 1, GridBagConstraints.WEST);


		JLabel l13 = new JLabel("PARENTS CONTACT NUMBER");
		JLabel l14 = new JLabel(s1.getParentsContactNo());
		l14.setBorder(BorderFactory.createEtchedBorder());
        l14.setOpaque(true);         // required for background colors
        l14.setBackground(UIManager.getColor("TextField.background"));
        l14.setFont(UIManager.getFont("TextField.font"));
	
		addComp(midBar, l13, 0, 8, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l14, 1, 8, 1, 1, GridBagConstraints.WEST);





			midBar.setBorder(new LineBorder(Color.GRAY));

		//################################### Right Bar ################################

		//rightBar = Box.createVerticalBox();





	  	thePanel.add(midBar,BorderLayout.CENTER);
		thePanel.add(leftBar, BorderLayout.WEST);
		thePanel.add(topBar, BorderLayout.NORTH);
		//thePanel.add(rightBar, BorderLayout.EAST);


		layout.add(thePanel);
		layout.setVisible(true);




	}


	 private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place){



	    	GridBagConstraints gridConstraints = new GridBagConstraints();

	         

	        gridConstraints.gridx = xPos;

	        gridConstraints.gridy = yPos;

	        gridConstraints.gridwidth = compWidth;

	        gridConstraints.gridheight = compHeight;

	        gridConstraints.weightx = 20;

	        gridConstraints.weighty = 20;

	        gridConstraints.insets = new Insets(2,2,2,2);

	        gridConstraints.anchor = place;

	        gridConstraints.fill = GridBagConstraints.HORIZONTAL;

	        

	        thePanel.add(comp, gridConstraints);

         

    }

  
	

}