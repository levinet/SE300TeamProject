

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
	int zoom=15;
	String gpsUser="29.210815,-81.022833";
	String gpsHome="29.19072,-81.048074";
	String lostL1="29.184838,-81.070304";
	String lostL2="29.179255,-81.056056";
	
	String lostL3="29.221924,-81.005716";
	public InfoGUI m_InfoGUI;

	JFrame frame = new JFrame();
    JPanel panel1;
    JPanel panel2;
    BufferedImage image;
    
    public void show(String gpsUser,String gpsHome, int zoomPer) {
           try {
        	     image = ImageIO.read(new URL("http://maps.google.com/maps/api/staticmap?center="+gpsUser+"&path=color:0x0000ff|weight:5|"+gpsUser+"|"+gpsHome+"&zoom="+zoomPer+"&markers=size:mid%7Ccolor:blue%7Clabel:L%7C"+lostL1+"|"+lostL2+"|"+lostL3+"&markers=size:mid%7Ccolor:green%7Clabel:U%7C"+gpsUser+"&markers=size:mid%7Ccolor:red%7Clabel:H%7C"+gpsHome+"&size=800x600&sensor=TRUE_OR_FALSE"));
        	  	 frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
         	     panel1=new JPanel();
        	  	 panel2=new JPanel();
         	     JLabel label = new JLabel(new ImageIcon(image));
         	     panel1.add(label);
         	     panel2.setLayout(new GridLayout(4,1));
                 Button zIn=new Button("Zoom: (+)");
                 Button zOut=new Button("Zoom: (-)");
                 Button info=new Button("Information");
                 Button lost=new Button("Press if LOST");
                 panel2.add(lost);
                 panel2.add(info);
                 panel2.add(zIn);
                 panel2.add(zOut);                           
                 frame.add(panel1);
                 frame.add(panel2);
                 zIn.addActionListener( (e)-> {
                  	zoomIn();
                 });
                 zOut.addActionListener( (e)-> {
               	  	zoomOut();
               	 });
                 
                 // LOST BUTTON
                 //
                 
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
    	 show(gpsUser,gpsHome,zoom);
       	
    }
 
	private void zoomIn() {
		zoom=zoom+1;
		frame.remove(panel1);
		frame.remove(panel2);
		show(gpsUser,gpsHome,zoom);
	}

    private void zoomOut() {
    	zoom=zoom-1;
    	frame.remove(panel1);
		frame.remove(panel2);
		show(gpsUser,gpsHome,zoom);		
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
