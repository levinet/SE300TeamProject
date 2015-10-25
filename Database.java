import java.io.File;
import java.io.FileInputStream;



public class Database() {

	private double coordinates;
	private double homeLocation;
	private double time;
	
	
	private class 
	public static String readFile(){
	    BufferedReader reader = new BufferedReader( new FileReader ("SE300ALH.xlsx"));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }
	    
	    reader.close();

	    return stringBuilder.toString();
	}
	
	public static void writeToFile(String s){
		File locFile = new File("SE300ALH.xlsx");
		locFile.createNewFile();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(locFile, true));

		buffWriter.write(s);

		buffWriter.close();
	}
	
	
}
	
		
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
