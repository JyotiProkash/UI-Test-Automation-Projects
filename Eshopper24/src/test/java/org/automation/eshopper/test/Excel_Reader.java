package org.automation.eshopper.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_Reader {

	 public String path;
	 FileInputStream fis;
	 XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 XSSFRow row;
	 int col_Num;
	 XSSFCell cell;
	 
	 public Excel_Reader(String path)
	 {
	  this.path=path;
	  
	  try
	  {
	   fis = new FileInputStream(path);
	   workbook = new XSSFWorkbook(fis);
	      
	  }
	  
	  catch(Exception e)
	  {
	   e.printStackTrace();
	  }
	 }
	 
	 public String getCellData(String sheetName, String colName, int rowNum)
	 {
	  try
	  {
	   int index = workbook.getSheetIndex(sheetName);
	   sheet = workbook.getSheetAt(index);
	   row = sheet.getRow(0);
	   
	   for(int i=0; i<row.getLastCellNum(); i++)
	   {
	    
	    if(row.getCell(i).getStringCellValue().equals(colName))
	    {
	     col_Num = i;
	     
	    }
	   }
	   
	   row=sheet.getRow(rowNum-1);
	   cell = row.getCell(col_Num);
	   
	   if(cell.getCellTypeEnum()==CellType.STRING)
	   {
	    return cell.getStringCellValue();
	    
	   }
	   
	   else if(cell.getCellTypeEnum()==CellType.NUMERIC) 
	   {
	    return String.valueOf(cell.getNumericCellValue());
	   }
	   
	   else if(cell.getCellTypeEnum()==CellType.BOOLEAN)
	   {
	    return String.valueOf(cell.getBooleanCellValue());
	   }
	   
	   else if(cell.getCellTypeEnum()==CellType.BLANK)
	    return "";
	  }
	  
	  catch(Exception e)
	  {
	   e.printStackTrace();
	  }
	  
	  return null;
	  
	 }
	 
	 public int getRowCount(String sheetName)
	 {
		try
		{
			 int index1=workbook.getSheetIndex(sheetName);

	         if(index1==-1)
	         {
	        	 return 0;
	         }
	         
	         else
	         {
	        	 sheet=workbook.getSheetAt(index1);
	        	 row=sheet.getRow(0);	
	        	 return row.getLastCellNum();
	         }
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		 return 0;
	 }
	 
	 public static void main(String[] args) 
	 {
	 
	  String path=System.getProperty("user.dir")+"/src/test/resources/excelReader.xlsx";
	  Excel_Reader obj=new Excel_Reader(path);
	  //System.out.println(obj.getCellData("Login", "Password", 4));
	  System.out.println(obj.getRowCount("Login"));
	 }

}
