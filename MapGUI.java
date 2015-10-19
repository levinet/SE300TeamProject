

/**
 * @author lopezy2
 * @version 1.0
 * @created 09-Oct-2015 3:16:18 PM
 */
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserFactory;
import javax.swing.*;
import java.awt.*;

public class MapGUI extends LoginGUI {

	private double commonLocation;
	private double Coordinates;
	private double HomeLocation;
	private char lostinfo;
	public InfoGUI m_InfoGUI;

	public static void main(String[] args) {
        Browser browser = BrowserFactory.create();
        JFrame frame = new JFrame("JxBrowser Google Maps");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL("http://maps.google.com");
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
