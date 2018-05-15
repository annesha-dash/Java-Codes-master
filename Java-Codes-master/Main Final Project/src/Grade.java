package main.grade;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;
import main.connection.*;




public class Grade{


	JPanel thePanel ;
	JLabel quiz1 ,quiz2, quiz3, attendance , performance , written, quiz1Limit ,quiz2Limit, quiz3Limit, attendanceLimit , performanceLimit , writtenLimit ;
	JLabel fQuiz1 ,fQuiz2, fQuiz3, fAttendance , fPerformance , fWritten, fQuiz1Limit ,fQuiz2Limit, fQuiz3Limit, fAttendanceLimit , fPerformanceLimit , fWrittenLimit ;
	JTextField quiz1Field,quiz2Field, quiz3Field , attendanceField , performanceField , writtenField ;
	JTextField fQuiz1Field,fQuiz2Field, fQuiz3Field , fAttendanceField , fPerformanceField , fWrittenField ;
	JButton upload , cancel;
	JButton fUpload , fCancel;
	JButton c1 , c2 , c3, c4, c5, c6;
	JButton c7 , c8 , c9, c10, c11, c12;
	
	public Grade(JFrame home,String cId,String sId){
		
		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("Upload Grade");
		layout.setVisible(true);

		JTabbedPane tabbedPane = new JTabbedPane();

		

		GridBagConstraints cs = new GridBagConstraints();
		cs.fill = GridBagConstraints.HORIZONTAL;





		// ########################################################################################################################################################## //
		// ##################################################       			Mid Tab                ############################################################## //
		// ########################################################################################################################################################## //

		JPanel midPanel = new JPanel();
		midPanel.setLayout( new GridBagLayout() );
		Color fgColor = UIManager.getColor("TextField.foreground");
	    Color bgColor = UIManager.getColor("TextField.background");



	    MidGradeClass m1 = MidGradeClass.getMidGrade(cId,sId);

		quiz1 = new JLabel("Quiz 1 :");

		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz1,cs);



		quiz1Field = new JTextField(10);
		quiz1Field.setText( ""+ m1.getMQ1());

		if(m1.getMQ1() != 0 ){

			quiz1Field.setEnabled(false);
	        quiz1Field.setBackground(bgColor);
	        quiz1Field.setDisabledTextColor(fgColor);
	        quiz1Field.setBorder(BorderFactory.createEtchedBorder());

	        c1 = new JButton("Change");
	        c1.addActionListener(e->{

	        quiz1Field.setEnabled(true);


	        });

	        cs.gridx=3;
			cs.gridy=0;
			cs.gridwidth=1;
			midPanel.add(c1,cs);


    	}	



		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=1;
		midPanel.add(quiz1Field,cs);

		quiz1Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz1Limit,cs);





		quiz2 = new JLabel("Quiz 2 :");
		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz2,cs);



		quiz2Field = new JTextField(10);

		quiz2Field.setText(""+m1.getMQ2());

		if(m1.getMQ2() != 0 ){
		
		quiz2Field.setEnabled(false);
        quiz2Field.setBackground(bgColor);
        quiz2Field.setDisabledTextColor(fgColor);
        quiz2Field.setBorder(BorderFactory.createEtchedBorder());

        c2 = new JButton("Change");
        c2.addActionListener(e->{

        	quiz2Field.setEnabled(true);


        });

        cs.gridx=3;
		cs.gridy=1;
		cs.gridwidth=1;
		midPanel.add(c2,cs);

   		 }


		cs.gridx=1;
		cs.gridy=1;
		cs.gridwidth=1;
		midPanel.add(quiz2Field,cs);

		quiz2Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz2Limit,cs);




		quiz3 = new JLabel("Quiz 3 :");
		cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz3,cs);



		quiz3Field = new JTextField(10);
		quiz3Field.setText(""+m1.getMQ3());

		if(m1.getMQ3() != 0 ){


			quiz3Field.setEnabled(false);
	        quiz3Field.setBackground(bgColor);
	        quiz3Field.setDisabledTextColor(fgColor);
	        quiz3Field.setBorder(BorderFactory.createEtchedBorder());

	        c3 = new JButton("Change");
	        c3.addActionListener(e->{

	        	quiz3Field.setEnabled(true);


	        });

	        cs.gridx=3;
			cs.gridy=2;
			cs.gridwidth=1;
			midPanel.add(c3,cs);
    	}

		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=1;
		midPanel.add(quiz3Field,cs);

		quiz3Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(quiz3Limit,cs);





		attendance = new JLabel("Attendance :");

		cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(attendance,cs);


		attendanceField = new JTextField(10);
		attendanceField.setText(""+m1.getMAttendance());

		if(m1.getMAttendance() != 0 ){

			attendanceField.setEnabled(false);
	        attendanceField.setBackground(bgColor);
	        attendanceField.setDisabledTextColor(fgColor);
	        attendanceField.setBorder(BorderFactory.createEtchedBorder());


	        c4 = new JButton("Change");
	        c4.addActionListener(e->{

	        	attendanceField.setEnabled(true);


	        });

	        cs.gridx=3;
			cs.gridy=3;
			cs.gridwidth=1;
			midPanel.add(c4,cs);
    	
    	}

		cs.gridx=1;
		cs.gridy=3;
		cs.gridwidth=1;
		midPanel.add(attendanceField,cs);


		attendanceLimit = new JLabel("/10 ");
		cs.gridx=2;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(attendanceLimit,cs);




		performance = new JLabel("Performance :");
		cs.gridx=0;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(performance,cs);


		performanceField = new JTextField(10);
		performanceField.setText(""+m1.getMPerformence());


		if(m1.getMAttendance() != 0 ){
				

			performanceField.setEnabled(false);
	        performanceField.setBackground(bgColor);
	        performanceField.setDisabledTextColor(fgColor);
	        performanceField.setBorder(BorderFactory.createEtchedBorder());

	        c5 = new JButton("Change");
	        c5.addActionListener(e->{

	        	performanceField.setEnabled(true);


	        });

	        cs.gridx=3;
			cs.gridy=4;
			cs.gridwidth=1;
			midPanel.add(c5,cs);

    	}


		cs.gridx=1;
		cs.gridy=4;
		cs.gridwidth=1;
		midPanel.add(performanceField,cs);


		performanceLimit = new JLabel("/10 ");
		cs.gridx=2;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(performanceLimit,cs);






		written = new JLabel("written :");
		cs.gridx=0;
		cs.gridy=5;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(written,cs);


		writtenField = new JTextField(10);
		writtenField.setText(""+ m1.getMWritten() );

		if(m1.getMAttendance() != 0 ){
			
			
			writtenField.setEnabled(false);
	        writtenField.setBackground(bgColor);
	        writtenField.setDisabledTextColor(fgColor);
	        writtenField.setBorder(BorderFactory.createEtchedBorder());


	        c6 = new JButton("Change");
	        c6.addActionListener(e->{

	        	writtenField.setEnabled(true);


	        });

	        cs.gridx=3;
			cs.gridy=5;
			cs.gridwidth=1;
			midPanel.add(c6,cs);

    	}


		cs.gridx=1;
		cs.gridy=5;
		cs.gridwidth=1;
		midPanel.add(writtenField,cs);


		writtenLimit = new JLabel("/40 ");
		cs.gridx=2;
		cs.gridy=5;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		midPanel.add(writtenLimit,cs);



		
		upload = new JButton("Confirm");

	
			upload.addActionListener(e->{
			
		        	if(e.getSource() == upload){


		        		


		        			int q1   =  Integer.parseInt( quiz1Field.getText() );
		        			int q2   =  Integer.parseInt( quiz2Field.getText() );
		        			int q3   =  Integer.parseInt( quiz3Field.getText() );
		        			int at   =  Integer.parseInt( attendanceField.getText() );
		        			int per  =  Integer.parseInt( performanceField.getText() );
		        			int writ =  Integer.parseInt( writtenField.getText() );






		        			MidGradeClass mg = new MidGradeClass(q1 , q2 , q3, at , per , writ);


		        			ResultQuery.createMidGrade(mg,cId,sId);



			        		layout.dispose();
			        		home.setVisible(true);

			            }

			            
		     		
		     	

		});

		
		cs.gridx=1;
		cs.gridy=7;
		cs.gridwidth=1;
		midPanel.add(upload,cs);


		cancel = new JButton("Cancel");

		cancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});

		cs.gridx=0;
		cs.gridy=7;
		cs.gridwidth=1;
		midPanel.add(cancel,cs);

		midPanel.setBorder(new LineBorder(Color.GRAY));

		
		tabbedPane.addTab("Mid Grade",midPanel);



		// ########################################################################################################################################################## //
		// ##################################################       			Final Tab                ############################################################ //
		// ########################################################################################################################################################## //









		JPanel finalPanel = new JPanel();
		finalPanel.setLayout( new GridBagLayout() );
		
		FinalGradeClass f1 = FinalGradeClass.getFinalGrade(cId,sId);



		fQuiz1 = new JLabel("Quiz 1 :");

		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz1,cs);


		fQuiz1Field = new JTextField(10);
		fQuiz1Field.setText(""+f1.getFQ1());



		if(f1.getFQ1() != 0){

			fQuiz1Field.setEnabled(false);
	        fQuiz1Field.setBackground(bgColor);
	        fQuiz1Field.setDisabledTextColor(fgColor);
	        fQuiz1Field.setBorder(BorderFactory.createEtchedBorder());

	         c7 = new JButton("Change");
		     c7.addActionListener(e->{

		        	fQuiz1Field.setEnabled(true);


		        });

		        cs.gridx=3;
				cs.gridy=0;
				cs.gridwidth=1;
				finalPanel.add(c7,cs);

    	}


    
		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=1;
		finalPanel.add(fQuiz1Field,cs);

		fQuiz1Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=0;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz1Limit,cs);





		fQuiz2 = new JLabel("Quiz 2 :");

		cs.gridx=0;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz2,cs);




		fQuiz2Field = new JTextField(10);
		fQuiz2Field.setText(""+f1.getFQ2());


		if(f1.getFQ2() != 0){

	
		fQuiz2Field.setEnabled(false);
        fQuiz2Field.setBackground(bgColor);
        fQuiz2Field.setDisabledTextColor(fgColor);
        fQuiz2Field.setBorder(BorderFactory.createEtchedBorder());


        c8 = new JButton("Change");
		     c8.addActionListener(e->{

		        	fQuiz2Field.setEnabled(true);


		        });

		        cs.gridx=3;
				cs.gridy=1;
				cs.gridwidth=1;
				finalPanel.add(c8,cs);

    	}

		cs.gridx=1;
		cs.gridy=1;
		cs.gridwidth=1;
		finalPanel.add(fQuiz2Field,cs);

		fQuiz2Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=1;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz2Limit,cs);








		fQuiz3 = new JLabel("Quiz 3 :");
		cs.gridx=0;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz3 , cs);



		fQuiz3Field = new JTextField(10);
		fQuiz3Field.setText(""+f1.getFQ3());

		if(f1.getFQ3() != 0){

		fQuiz3Field.setEnabled(false);
        fQuiz3Field.setBackground(bgColor);
        fQuiz3Field.setDisabledTextColor(fgColor);
        fQuiz3Field.setBorder(BorderFactory.createEtchedBorder());

        c9 = new JButton("Change");
		     c9.addActionListener(e->{

		        	fQuiz3Field.setEnabled(true);


		        });

		        cs.gridx=3;
				cs.gridy=2;
				cs.gridwidth=1;
				finalPanel.add(c9,cs);

    	}



		cs.gridx=1;
		cs.gridy=2;
		cs.gridwidth=1;
		finalPanel.add(fQuiz3Field,cs);


		fQuiz3Limit = new JLabel("/20 ");
		cs.gridx=2;
		cs.gridy=2;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fQuiz3Limit , cs);



		fAttendance = new JLabel("Attendance :");
		cs.gridx=0;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fAttendance,cs);


		fAttendanceField = new JTextField(10);
		fAttendanceField.setText(""+f1.getFAttendance());

		if(f1.getFAttendance() != 0){

			fAttendanceField.setEnabled(false);
	        fAttendanceField.setBackground(bgColor);
	        fAttendanceField.setDisabledTextColor(fgColor);
	        fAttendanceField.setBorder(BorderFactory.createEtchedBorder());

	        c10 = new JButton("Change");
			     c10.addActionListener(e->{

			        	fAttendanceField.setEnabled(true);


			        });

			        cs.gridx=3;
					cs.gridy=3;
					cs.gridwidth=1;
					finalPanel.add(c10,cs);

    	}


		cs.gridx=1;
		cs.gridy=3;
		cs.gridwidth=1;
		finalPanel.add(fAttendanceField,cs);


		fAttendanceLimit = new JLabel("/10 ");
		cs.gridx=2;
		cs.gridy=3;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fAttendanceLimit,cs);




		fPerformance = new JLabel("Performance :");
		cs.gridx=0;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fPerformance,cs);


		fPerformanceField = new JTextField(10);
		fPerformanceField.setText(""+f1.getFPerformence());


		if(f1.getFPerformence() != 0){

		fPerformanceField.setEnabled(false);
        fPerformanceField.setBackground(bgColor);
        fPerformanceField.setDisabledTextColor(fgColor);
        fPerformanceField.setBorder(BorderFactory.createEtchedBorder());
         c11 = new JButton("Change");
			     c11.addActionListener(e->{

			        	fPerformanceField.setEnabled(true);


			        });

			        cs.gridx=3;
					cs.gridy=4;
					cs.gridwidth=1;
					finalPanel.add(c11,cs);

    	}


		cs.gridx=1;
		cs.gridy=4;
		cs.gridwidth=1;
		finalPanel.add(fPerformanceField,cs);


		fPerformanceLimit = new JLabel("/10 ");
		cs.gridx=2;
		cs.gridy=4;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fPerformanceLimit,cs);




		fWritten = new JLabel("written :");
		cs.gridx=0;
		cs.gridy=5;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fWritten,cs);


		fWrittenField = new JTextField(10);
		fWrittenField.setText(""+f1.getFWritten());

		if(f1.getFWritten() != 0){


		fWrittenField.setEnabled(false);
        fWrittenField.setBackground(bgColor);
        fWrittenField.setDisabledTextColor(fgColor);
        fWrittenField.setBorder(BorderFactory.createEtchedBorder());
        c12 = new JButton("Change");
			     c12.addActionListener(e->{

			        	fWrittenField.setEnabled(true);


			        });

			        cs.gridx=3;
					cs.gridy=5;
					cs.gridwidth=1;
					finalPanel.add(c12,cs);

    	}

		cs.gridx=1;
		cs.gridy=5;
		cs.gridwidth=1;
		finalPanel.add(fWrittenField,cs);


		fWrittenLimit = new JLabel("/40 ");
		cs.gridx=2;
		cs.gridy=5;
		cs.gridwidth=1;
		cs.insets = new Insets(5,5,5,5);
		finalPanel.add(fWrittenLimit,cs);



		

		fUpload = new JButton("Confirm");

	
			fUpload.addActionListener(e->{
			
		        



		        			int q1 =  Integer.parseInt(fQuiz1Field.getText() );
		        			int q2 =  Integer.parseInt(fQuiz2Field.getText() );
		        			int q3 =  Integer.parseInt(fQuiz3Field.getText() );
		        			int at =  Integer.parseInt(fAttendanceField.getText() );
		        			int per =  Integer.parseInt(fPerformanceField.getText() );
		        			int writ =  Integer.parseInt(fWrittenField.getText() );

		        			

		        			FinalGradeClass fg = new FinalGradeClass(q1 , q2 , q3, at , per , writ);


		        			ResultQuery.createFinalGrade(fg , cId , sId);


		        		

		        		layout.dispose();
		        		home.setVisible(true);

			            		            
		     		
		     	

		});

		
		cs.gridx=1;
		cs.gridy=7;
		cs.gridwidth=1;
		finalPanel.add(fUpload,cs);


		fCancel = new JButton("Cancel");

		fCancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});

		cs.gridx=0;
		cs.gridy=7;
		cs.gridwidth=1;
		finalPanel.add(fCancel,cs);

		finalPanel.setBorder(new LineBorder(Color.GRAY));

		
		tabbedPane.addTab("Final Grade" ,finalPanel);








		layout.add(tabbedPane);
		layout.setVisible(true);
		

	


 }



 
 

}
