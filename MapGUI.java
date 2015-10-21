

/**
 * @author lopezy2
 * @version 1.0
 * @created 09-Oct-2015 3:16:18 PM
 */

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.*;

public class MapGUI extends LoginGUI {

	private double commonLocation;
	private double Coordinates;
	private double HomeLocation;
	private char lostinfo;
	int zoomPer=12;
	String gpsUser="29.210815,-81.022833";
	String gpsHome="29.19072,-81.048074";
	public InfoGUI m_InfoGUI;

	JFrame frame = new JFrame();
    JPanel panel1;
    JPanel panel2;
    BufferedImage image;
    
    
    public void show(String gpsUser,String gpsHome, int zoomPer) {
           try {
        	    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        	    panel1=new JPanel();
       	 	    panel2=new JPanel();
        	    image = ImageIO.read(new URL("http://maps.google.com/maps/api/staticmap?center="+gpsUser+"&path=color:0x0000ff|weight:5|"+gpsUser+"|"+gpsHome+"&zoom="+zoomPer+"&markers=size:mid%7Ccolor:green%7Clabel:U%7C"+gpsUser+"&markers=size:mid%7Ccolor:red%7Clabel:H%7C"+gpsHome+"&size=800x600&sensor=TRUE_OR_FALSE"));
        	    JLabel label = new JLabel(new ImageIcon(image));
        	    panel1.add(label);
        	    panel2.setLayout(new GridLayout(2,1));
                Button a=new Button("Zoom: (+5%)");
                Button b=new Button("Zoom: (-5%)");
                panel2.add(a);
                panel2.add(b);                           
                frame.add(panel1);
                frame.add(panel2);
                
                a.addActionListener( (e)-> {
              	  zoomIn();
              	 });
                
                
                
                frame.setTitle("Alzheimer Little Helper Application -> MAP");
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
           	   	       
           }
           catch (MalformedURLException e){
                  e.printStackTrace();
           }
           catch (Exception e){
                 e.printStackTrace();
           }
    }
   
    public MapGUI(){
	 	show(gpsUser,gpsHome,zoomPer);
    }
 
	private void zoomIn() {
 	zoomPer=zoomPer+5;
 	//show(gpsHome, gpsHome, zoomPer);
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
