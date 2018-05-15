package main.excel;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import main.student.*;
import main.connection.*;
import main.grade.*;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Cell;




public class Excel{



	public Excel(){	}


	public static void writeExcel(String courseName, ArrayList<StudentClass> studentList) {

		try {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet( "Mid_grade" );

		int i = 1;

		HSSFRow row = sheet.createRow(0);

		
		row.createCell(0).setCellValue( "Student ID" );
		row.createCell(1).setCellValue( "Quiz 1" );
		row.createCell(2).setCellValue( "Quiz 2" );
		row.createCell(3).setCellValue( "Quiz 3" );
		row.createCell(4).setCellValue( "Attendence" );
		row.createCell(5).setCellValue( "Performence" );
		row.createCell(6).setCellValue( "Written" );


		for(int j=0 ; j<7 ; j++){

		sheet.autoSizeColumn(j);

		}



		for(StudentClass x : studentList){

			row = sheet.createRow( i );

			row.createCell(0).setCellValue( x.getSId() );
			i++;

		}








		sheet = workbook.createSheet( "Final_Grade" );

		
		row = sheet.createRow(0);

		row.createCell(0).setCellValue( "Student ID" );
		row.createCell(1).setCellValue( "Quiz 1" );
		row.createCell(2).setCellValue( "Quiz 2" );
		row.createCell(3).setCellValue( "Quiz 3" );
		row.createCell(4).setCellValue( "Attendence" );
		row.createCell(5).setCellValue( "Performence" );
		row.createCell(6).setCellValue( "Written" );



		for(int j=0 ; j<7 ; j++){

		sheet.autoSizeColumn(j);

		}





		i=1;

		for(StudentClass x : studentList){

			row = sheet.createRow(i);
			row.createCell(0).setCellValue( x.getSId() );
			i++;

		}


		
				workbook.write(new FileOutputStream( courseName + "-Course.xls" ) ) ;
				workbook.close();

			}catch(Exception e) { System.out.println(e); }

	}









	public static void readExcel(String cId,String fileLocation){
		

		try {


		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileLocation));





		HSSFSheet sheet = workbook.getSheetAt(0);
		

		
		HSSFRow row = sheet.getRow(0);


		for(int i=1 ; i <= sheet.getLastRowNum(); i++ ){

				 row = sheet.getRow(i);

				 
				MidGradeClass m1 = new MidGradeClass( (int)row.getCell(1).getNumericCellValue() ,   (int)row.getCell(2).getNumericCellValue()  ,

													(int)row.getCell(3).getNumericCellValue() ,		(int)row.getCell(4).getNumericCellValue() ,	
						 								
						 							(int)row.getCell(5).getNumericCellValue()  , 	 (int)row.getCell(6).getNumericCellValue() );


				ResultQuery.updateMidGrade(cId ,row.getCell(0).getStringCellValue(), m1 );


		}


		workbook.close();

		}catch(Exception e) { System.out.println(e); }



		

	}









	public static void writeResultExcel(String courseName, ArrayList<StudentClass> studentList) {

		
		
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet( "Grade" );



			HSSFRow row = sheet.createRow(0);
			row.createCell(0).setCellValue( "Student ID" );
			row.createCell(1).setCellValue( "Grade" );



			for(int j=0 ; j<2 ; j++){

				sheet.autoSizeColumn(j);

				}


				int i=1;

				for(StudentClass x : studentList){

					row = sheet.createRow(i);
					row.createCell(0).setCellValue( x.getSId() );
				//	System.out.println(x.getSId() );
					i++;

				}




				i=1;



				for(StudentClass x : studentList){

					row = sheet.createRow( i );
					//System.out.println(ResultQuery.getGrade(courseName, x.getSId() ) );
					row.createCell(1).setCellValue( ResultQuery.getGrade(courseName, x.getSId() ) );
					i++;

				}

				try {

		
				workbook.write(new FileOutputStream( courseName + "-CourseResult.xls" ) ) ;
				workbook.close();

			}catch(Exception e) { System.out.println(e); }

	}




	






}