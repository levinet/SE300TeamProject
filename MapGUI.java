

/**
 * @author lopezy2
 * @version 1.0
 * @created 09-Oct-2015 3:16:18 PM
 */
public class MapGUI extends LoginGUI {

	private double commonLocation;
	private double Coordinates;
	private double HomeLocation;
	private char lostinfo;
	public InfoGUI m_InfoGUI;

	public MapGUI(){

	}

	/**
	 * 
	 * @exception Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

	public boolean displayLost(){
		return false;
	}

	public double homeLine(){
		return 0;
	}
}//end MapGUI
