import java.io.File;
import java.io.FileInputStream;


/**
 * @author lopezy2
 * @version 1.0
 * @created 09-Oct-2015 3:16:18 PM
 *Version 1.0.0
 */
public class Database {

	private double coordinates;
	private double homeLocation;
	private double time;
	
	public Database(){
		
		//Incomplete; need to get Apache POI
		
		File file = new File("P://SEE300ALH.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
	}

	/**m
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public void storeData(){

	}
}//end Database
