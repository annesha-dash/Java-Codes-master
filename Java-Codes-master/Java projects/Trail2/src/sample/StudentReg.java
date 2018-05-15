
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;

public class Course {
    JButton b1 ;
    JButton b2 ;
    JButton b3 ;
    JButton b4 ;
    JButton b5 ;
    JButton b6 ;
    JPanel topBar,thePanel,midBar;
    Box  leftBar;
    DefaultListModel defListModel = new DefaultListModel();
    JScrollPane scroller;
    JList courseList;

    public Course(String name){

        JFrame layout = new JFrame();
        layout.setSize(800,640);
        layout.setLocationRelativeTo(null);
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setTitle(name+"'s Home");

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
    	/*b2.addActionListener(new ActionListener(){

			 public void actionPerformed(ActionEvent e){
			
		        	if(e.getSource() == b2){

		        		layout.setVisible(false);
		        		new StudentProfile(layout);


			            }
			            
		     		}
		     	

		});*/

        topBar.add(b2);

        b3 = new JButton("LOGOUT");
        b3.setForeground(Color.BLACK);

        topBar.add(b3);
        //topBar.setBorder(new LineBorder(Color.GRAY));


        //############################### LEFT BAR GOES HERE #####################################

        leftBar = Box.createVerticalBox();


        b4 = new JButton("ALL COURSES");
        b4.setForeground(Color.BLACK);
        leftBar.add(b4);
        b4.setPreferredSize(new Dimension(180, 120));
        leftBar.add(Box.createVerticalStrut(30));



        b5 = new JButton("CURRENT COURSES");
        b5.setForeground(Color.BLACK);
        leftBar.add(b5);
        b5.setPreferredSize(new Dimension(180, 120));
        leftBar.add(Box.createVerticalStrut(30));


        b6 = new JButton("PREVIOUS COURSES");
        b6.setForeground(Color.BLACK);
        leftBar.add(b6);
        b6.setPreferredSize(new Dimension(180, 120));
        leftBar.add(Box.createVerticalStrut(30));




        //############################### MID BAR GOES HERE ##########################################
        midBar = new JPanel();
        midBar.setLayout(new FlowLayout(FlowLayout.CENTER));

        String[] courseNames = {"0001-Algorithem [A]\nCourse Teacher:MD A", "0026-COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION [M]\nCourse Teacher:Mrs B",
                "0011-OBJECT ORIENTED PROGRAMMING 1 (JAVA) [E]\nCourse Teacher:Mr C"};

        for(String course: courseNames){

            defListModel.addElement(course);
        }

        courseList= new JList(defListModel);
        courseList.setFixedCellHeight(60);
        courseList.setFixedCellWidth(150);

        scroller = new JScrollPane(courseList,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        midBar.add(scroller);
        midBar.add(courseList);




        //############################ Add off the Panels ##################################################

        thePanel.add(midBar,BorderLayout.CENTER);
        thePanel.add(leftBar, BorderLayout.WEST);
        thePanel.add(topBar, BorderLayout.NORTH);


        layout.add(thePanel);
        layout.setVisible(true);

    }

    public static void main(String[] args){

        new Course("courses");
    }



}