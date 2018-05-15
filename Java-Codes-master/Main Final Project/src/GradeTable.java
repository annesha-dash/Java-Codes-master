package main.grade;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.border.*;
import java.awt.event.*;
import main.connection.*;
import main.student.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class GradeTable{


	JFrame layout;
	JPanel midPanel;
	JPanel finalPanel;

	JTable table;
    JScrollPane tablePanel;

    JPanel leftBar = new JPanel(new FlowLayout());
    Box rightBar = Box.createVerticalBox();

	public	GradeTable(JFrame home ,String cId){


			layout = new JFrame();
			layout.setSize(800,640);
			layout.setLocationRelativeTo(null);
			layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			layout.setTitle("Full Grade");
			layout.setVisible(true);



			JTabbedPane tabbedPane = new JTabbedPane();
			midPanel = new JPanel( new FlowLayout() );



			// ############################################################################# MID PANEL ################################################################################################################





			ArrayList<StudentClass> studentlist = StudentClass.viewCourseStudents(cId);
			//Vector<Vector> data = new Vector<>();

			  DefaultTableModel model = new DefaultTableModel();

			



			Vector<String> columns  = new Vector<>();

			columns.add("Student ID"); columns.add("Quiz 1 "); columns.add("Quiz 2 "); columns.add("Quiz 3 "); columns.add("Attendance "); columns.add("Performence"); columns.add("Written");

			model.setColumnIdentifiers(columns);






			for(StudentClass x : studentlist){


				MidGradeClass m1 = MidGradeClass.getMidGrade(cId, x.getSId() );

				Vector<String> row = new Vector<>();

				row.add(""+x.getSId()); 	row.add( "" +m1.getMQ1() ); 	row.add("" + m1.getMQ2() ); 	row.add("" + m1.getMQ3() ); 
				row.add("" + m1.getMAttendance() ); 	row.add("" + m1.getMPerformence() ); 	row.add( "" +m1.getMWritten() );

				model.addRow(row);



			}



 			


			table = new JTable();

			table.setModel(model); 



			tablePanel = new JScrollPane(table);

			leftBar.add(tablePanel);








		
		JTextField[] mTextField = new JTextField[6];


		for (int i = 0 ;i <6 ; i++){

			mTextField[i] = new JTextField(10);
		}

		
		for(JTextField x : mTextField){

		rightBar.add(Box.createVerticalStrut(30));
	  	rightBar.add(x);
		}

		JButton b1 = new JButton("Update");

		rightBar.add(Box.createVerticalStrut(30));
		rightBar.add(b1);








		 table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            

            mTextField[0].setText(model.getValueAt(i, 1).toString());
            mTextField[1].setText(model.getValueAt(i, 2).toString());
            mTextField[2].setText(model.getValueAt(i, 3).toString());
            mTextField[3].setText(model.getValueAt(i, 4).toString());
            mTextField[4].setText(model.getValueAt(i, 5).toString());
            mTextField[5].setText(model.getValueAt(i, 6).toString());
        }
        });
        
        // button update row
        b1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                //System.out.println(i)
                
                if(i >= 0) 
                {
                   model.setValueAt(  mTextField[0].getText(), i, 1);
                   model.setValueAt(  mTextField[1].getText(), i, 2);
                   model.setValueAt(  mTextField[2].getText(), i, 3);
                   model.setValueAt(  mTextField[3].getText(), i, 4);
                   model.setValueAt(  mTextField[4].getText(), i, 5);
                   model.setValueAt(  mTextField[5].getText(), i, 6);



                   for(StudentClass x : studentlist){

                   	if( x.getSId().equals( model.getValueAt(i , 0)) ){




                   		MidGradeClass m1 = new MidGradeClass (	Integer.parseInt( mTextField[0].getText() ) , Integer.parseInt( mTextField[1].getText() ) ,Integer.parseInt( mTextField[2].getText() ) , 
                   												Integer.parseInt( mTextField[3].getText() ) , Integer.parseInt( mTextField[4].getText() ) ,Integer.parseInt( mTextField[5].getText() ) ) ;


                   		ResultQuery.updateMidGrade(cId, x.getSId(), m1);
                   	}



                   }



                }
                else{
                    System.out.println("Update Error");
                }
            }
        });








        JButton b2 = new JButton("Go back");

		rightBar.add(Box.createVerticalStrut(30));
		rightBar.add(b2);

		b2.addActionListener(e-> {


			layout.dispose();

			home.setVisible(true);

		});





















		midPanel.add(leftBar);
		midPanel.add(rightBar);




			tabbedPane.addTab("Mid Grade", midPanel);





//####################################################################### Final table ########################################################################################################################



			JPanel finalLeftBar = new JPanel(new FlowLayout());
    		Box finalRightBar = Box.createVerticalBox();




			DefaultTableModel finalModel = new DefaultTableModel();

			



			finalModel.setColumnIdentifiers(columns);






			for(StudentClass x : studentlist){


				FinalGradeClass f1 = FinalGradeClass.getFinalGrade(cId, x.getSId() );
				
				Vector<String> row = new Vector<>();

				row.add(""+x.getSId()); 	row.add( "" +f1.getFQ1() ); 	row.add("" + f1.getFQ2() ); 	row.add("" + f1.getFQ3() ); 
				row.add("" + f1.getFAttendance() ); 	row.add("" + f1.getFPerformence() ); 	row.add( "" +f1.getFWritten() );

				finalModel.addRow(row);



			}



 			


			JTable finalTable = new JTable();

			finalTable.setModel(finalModel); 



			JScrollPane finalTablePanel = new JScrollPane(finalTable);

			


			finalLeftBar.add(finalTablePanel);








		
		JTextField[] fTextField = new JTextField[6];


		for (int i = 0 ;i <6 ; i++){

			fTextField[i] = new JTextField(10);
		}

		
		for(JTextField x : fTextField){

		finalRightBar.add(Box.createVerticalStrut(30));
	  	finalRightBar.add(x);
		}

		JButton b3 = new JButton("Update");

		finalRightBar.add(Box.createVerticalStrut(30));
		finalRightBar.add(b3);








		 finalTable.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = finalTable.getSelectedRow();
            

            fTextField[0].setText(finalModel.getValueAt(i, 1).toString());
            fTextField[1].setText(finalModel.getValueAt(i, 2).toString());
            fTextField[2].setText(finalModel.getValueAt(i, 3).toString());
            fTextField[3].setText(finalModel.getValueAt(i, 4).toString());
            fTextField[4].setText(finalModel.getValueAt(i, 5).toString());
            fTextField[5].setText(finalModel.getValueAt(i, 6).toString());
        }
        });
        
        // button update row
        b3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = finalTable.getSelectedRow();
                //System.out.println(i)
                
                if(i >= 0) 
                {
                   finalModel.setValueAt(  fTextField[0].getText(), i, 1);
                   finalModel.setValueAt(  fTextField[1].getText(), i, 2);
                   finalModel.setValueAt(  fTextField[2].getText(), i, 3);
                   finalModel.setValueAt(  fTextField[3].getText(), i, 4);
                   finalModel.setValueAt(  fTextField[4].getText(), i, 5);
                   finalModel.setValueAt(  fTextField[5].getText(), i, 6);



                   for(StudentClass x : studentlist){

                   	if( x.getSId().equals( finalModel.getValueAt(i , 0)) ){




                   		FinalGradeClass f1 = new FinalGradeClass (	Integer.parseInt( fTextField[0].getText() ) , Integer.parseInt( fTextField[1].getText() ) ,Integer.parseInt( fTextField[2].getText() ) , 
                   												Integer.parseInt( fTextField[3].getText() ) , Integer.parseInt( fTextField[4].getText() ) ,Integer.parseInt( fTextField[5].getText() ) ) ;


                   		ResultQuery.updateFinalGrade(cId, x.getSId(), f1);
                   	}



                   }



                }
                else{
                    System.out.println("Update Error");
                }
            }
        });








        JButton b4 = new JButton("Go back");

		finalRightBar.add(Box.createVerticalStrut(30));
		finalRightBar.add(b4);

		b4.addActionListener(e-> {


			layout.dispose();

			home.setVisible(true);

		});


















		JPanel finalPanel = new JPanel(new FlowLayout());

		finalPanel.add(finalLeftBar);

		finalPanel.add(finalRightBar);
		




			tabbedPane.addTab("Final Grade", finalPanel);


























			layout.add(tabbedPane);









		}


}