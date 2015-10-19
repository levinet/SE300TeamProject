

/**
 * @author lopezy2
 * @version 1.0
 * @created 09-Oct-2015 3:16:18 PM
 */

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

public class MapGUI extends LoginGUI {

	private double commonLocation;
	private double Coordinates;
	private double HomeLocation;
	private char lostinfo;
	public InfoGUI m_InfoGUI;

	JFrame frame = new JFrame();
    JPanel panel;
    BufferedImage image;
    public void show(String gps) {
           panel = new JPanel();
           try {
                  image = ImageIO.read(new URL("http://maps.google.com/maps/api/staticmap?center="+gps+"&zoom=13&markers="+gps+"&size=500x300&sensor=TRUE_OR_FALSE"));
                  								//
                  								//http://maps.google.com/maps/api/staticmap?center="+gps+"&zoom=13&markers="+gps+"&size=500x300&sensor=TRUE_OR_FALSE
                  JLabel label = new JLabel(new ImageIcon(image));
                  panel.add(label);
                  frame.add(panel);
                  frame.pack();
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frame.setLocationRelativeTo(null);
                  frame.setVisible(true);
           } catch (MalformedURLException e) {
                  e.printStackTrace();
           } catch (Exception e) {
                 e.printStackTrace();
           }
    }
    public MapGUI(){
    	show("29.210815,-81.022833");
    }

    public static void main(String[] args){
          new MapGUI();
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
