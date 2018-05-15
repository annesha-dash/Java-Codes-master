package main.grade;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.*;
import java.awt.event.*;
import main.connection.*;
import java.util.*;




public class StudentResult{

	ArrayList<JLabel> mLabel = new ArrayList<>();
	ArrayList<JTextField> mTextField = new ArrayList<>();
	ArrayList<JLabel> fLabel = new ArrayList<>();
	ArrayList<JTextField> fTextField = new ArrayList<>();


	public StudentResult(JFrame home , String cId,String sId){

				
		JFrame layout = new JFrame();
		layout.setSize(800,640);
		layout.setLocationRelativeTo(null);
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setTitle("See Grade");
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
	    cs.insets = new Insets(5,5,5,5);


	 


		ArrayList<String> col = ResultQuery.getCollumName("MID_GRADE");


		for(String x : col){
			if(!x.equals("M_ID")){
			mLabel.add(new JLabel(x));
			mTextField.add(new JTextField(10));
		}

		}

		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;


		for(JLabel x : mLabel){


			midPanel.add(x,cs);
			cs.gridy++;

		}


		int[] num = new int[6];

		num[0] = m1.getMQ1();
			num[1] = m1.getMQ2();
				num[2] = m1.getMQ3();
					num[3] = m1.getMAttendance();
						num[4] = m1.getMPerformence();
							num[5] = m1.getMWritten();


		int i=5;

		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=2;

		for(JTextField x : mTextField){

			x.setEnabled(false);
			x.setBackground(bgColor);
	        x.setDisabledTextColor(fgColor);
	        x.setBorder(BorderFactory.createEtchedBorder());
			x.setText( ""+ num[i]);
			midPanel.add(x,cs);


			cs.gridy++;
			i--;


		}


		JButton mCancel = new JButton("Cancel");

		mCancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});


		midPanel.add(mCancel,cs);




		tabbedPane.addTab("Mid Grade",midPanel);




		







		// ########################################################################################################################################################## //
		// ##################################################       			Final Tab                ############################################################ //
		// ########################################################################################################################################################## //



		JPanel finalPanel = new JPanel();
		finalPanel.setLayout( new GridBagLayout() );
		
		FinalGradeClass f1 = FinalGradeClass.getFinalGrade(cId,sId);



		ArrayList<String> colF = ResultQuery.getCollumName("FINAL_GRADE");


		for(String x : colF){
			if(!x.equals("F_ID")){
			fLabel.add(new JLabel(x));
			fTextField.add(new JTextField(10));
		}

		}





		cs.gridx=0;
		cs.gridy=0;
		cs.gridwidth=1;


		for(JLabel x : fLabel){


			finalPanel.add(x,cs);
			cs.gridy++;

		}


		int[] numF = new int[6];

		numF[0] = f1.getFQ1();
			numF[1] = f1.getFQ2();
				numF[2] = f1.getFQ3();
					numF[3] = f1.getFAttendance();
						numF[4] = f1.getFPerformence();
							numF[5] = f1.getFWritten();


		int j=5;

		cs.gridx=1;
		cs.gridy=0;
		cs.gridwidth=2;

		for(JTextField x : fTextField){

			x.setEnabled(false);
			x.setBackground(bgColor);
	        x.setDisabledTextColor(fgColor);
	        x.setBorder(BorderFactory.createEtchedBorder());
			x.setText( ""+ numF[j]);
			finalPanel.add(x,cs);


			cs.gridy++;
			j--;


		}


		JButton fCancel = new JButton("Cancel");

		fCancel.addActionListener(e->{

			home.setVisible(true);
			layout.dispose();


		});


		finalPanel.add(fCancel,cs);



		tabbedPane.addTab("Final Grade",finalPanel);




		layout.add(tabbedPane);







	}	






}

