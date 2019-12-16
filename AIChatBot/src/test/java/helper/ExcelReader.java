package helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * created by Jyoti 25/10/2019
 */

public class ExcelReader 
   {
	
	//public static final Logger logger=Logger.getLogger(Excel_reader.class.getName());
	
	
		public String[][] getExcelData(String excellocation, String sheetName)
		{
			try
			{
				//logger.info("Creating excel object:"+excellocation);
				String dataSets[][]=null;
				FileInputStream file=new FileInputStream(new File(excellocation));
				//Creation workbook instance as .xlsx file format
				//@SuppressWarnings("resource")
				 XSSFWorkbook workbook = new XSSFWorkbook(file);
				//Creation sheet from the workbook
				XSSFSheet sheet=workbook.getSheet(sheetName);
				//Count total number of active row
				int totalRow=sheet.getLastRowNum()+1;
				//count total number of active column
				int totalColumn=sheet.getRow(0).getLastCellNum();
				//Creation 2D array of rows and columns
				dataSets=new String[totalRow-1][totalColumn];
				
				//Iterator through each row one by one
				Iterator<Row> rowIterator = sheet.iterator();
				
				int i=0;
				int t=0;
				
				while(rowIterator.hasNext())
				{
					Row row = rowIterator.next();
					if(i++!=0)
					{
						int k=t;
						t++;
						//iterate through all the column for each row
						Iterator<Cell> cellIterator = row.cellIterator();
						
						int j=0;
						
						while(cellIterator.hasNext())
						{
							Cell cell=cellIterator.next();
							//Check the cell type format accordingly
							switch(cell.getCellTypeEnum())
							{
							case NUMERIC:
								System.out.println(i+",");
								System.out.println(j);
								dataSets[k][j++]=String.valueOf(cell.getNumericCellValue());
						        break;
							
							case STRING:
								System.out.print(k+",");
								System.out.print(j);
								dataSets[k][j++]=cell.getStringCellValue();
								System.out.println(cell.getStringCellValue());
						        break;
						        
							case BOOLEAN:
								dataSets[k][j++]=String.valueOf(cell.getBooleanCellValue());
						        break;
						        
							case BLANK:
								dataSets[k][j++]="";
						        break;
						        
							case FORMULA:
								dataSets[k][j++]=String.valueOf(cell.getCellFormula());
						        break;
							default:
								break;     
						        	
							}
							
						}
						
					}
				}
				 file.close();
				 workbook.close();
				//System.out.println(dataSets[0][5]);
				return dataSets;
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
			return null;
			
		}
		
		/*public static void main(String[] args) {
			String excellocation=System.getProperty("user.dir")+"\\src\\main\\java\\com\\bjit\\omronConnect\\data\\TestData.xlsx";
			System.out.println(excellocation);
		    String sheetName="LoginTestData";
			Excel_reader excelReaders=new Excel_reader();
			excelReaders.getExcelData(excellocation, sheetName);
			//System.out.println(excelReaders.getExcelData(excellocation, sheetName));
		}*/

   }
