package main.teacher;


import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import main.connection.*;
import main.student.*;
import main.grade.*;
import main.excel.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;



public class ViewStudent {


	
    JPanel thisPanel,mainLayout;
    JButton b1,b2,b3 ;
    JList<String> list = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();
    GridBagConstraints cs = new GridBagConstraints();
	
	
    public ViewStudent(JFrame home , String cId){




    	JFrame layout = new JFrame();
    	layout.setSize(800,720);
    	layout.setVisible(true);

    	layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		mainLayout  = new JPanel();
		mainLayout.setLayout(new BorderLayout());





    	thisPanel = new JPanel();

    	thisPanel.setLayout(new GridBagLayout());




	  	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


	  	ArrayList<StudentClass> studentlist = StudentClass.viewCourseStudents(cId);

	  	for(StudentClass x : studentlist){


	  	 model.addElement(x.toString());
	  	
	  	 
	  	
	  	}



	  	list.setModel(model);


	  	cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		cs.fill= GridBagConstraints.HORIZONTAL;



		thisPanel.add(new JScrollPane(list),cs);
	  	thisPanel.setBorder(new LineBorder(Color.GRAY));





	  	Box bottomPanel = Box.createVerticalBox();


	  	b1 = new JButton("Go home");

	  	b1.addActionListener(e->{


	  		home.setVisible(true);
	  		layout.dispose();


	  	});



	  	b2 = new JButton("Set Grade");

	  	b2.addActionListener(e->{

	  	try {
	  		String sId=list.getSelectedValue().substring(0,8);
	  		new Grade(layout,cId,sId);

	  	}catch(Exception a){JOptionPane.showMessageDialog(null, "Nothing is Selected!!");}
	  		

	  	});


	  	
	  		

	  	

	  	cs.gridy=1;
	  	thisPanel.add(b1,cs);
	 	
	 	cs.gridy=2;
	  	thisPanel.add(b2,cs);




	  	Box leftBar = Box.createVerticalBox();

	  	b3 = new JButton("See Grade Table");

	  	b3.addActionListener(e->{

	  		
	  		new GradeTable(layout,cId);

	  		});



	  	leftBar.add(Box.createVerticalStrut(100));
	  	leftBar.add(b3);












         
	  	JButton b4 = new JButton("Open Grade File..");


	  	b4.addActionListener(e->{


	  	try{

        JFileChooser jFileChooser = new JFileChooser();

        jFileChooser.setCurrentDirectory(new File("C:/"));

         

        int result = jFileChooser.showOpenDialog(new JFrame());

     	FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS files", "xls");
		jFileChooser.setFileFilter(filter);
		jFileChooser.setAcceptAllFileFilterUsed(true);
     

        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = jFileChooser.getSelectedFile();

             Excel.readExcel(cId ,selectedFile.getAbsolutePath() );

        }




    }catch(Exception a){ JOptionPane.showMessageDialog(null, " Choose a XLS file! "); }
    	 
 



    });




	  	leftBar.add(Box.createVerticalStrut(30));
	  	leftBar.add(b4);
    
































	  	mainLayout.add(thisPanel , BorderLayout.CENTER);
	  	mainLayout.add(leftBar , BorderLayout.EAST);

		layout.add(mainLayout);
	  

		}

		




    }