import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class okjavagoin_input {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
//		String id = "JAVA APT 507";
		// elevator call
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// security off
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// light on
		Lighting hallLamp = new Lighting(id +"/ Hall Lamp");
		hallLamp.on();
		
		// light on
		Lighting floorLamp = new Lighting(id +"/ floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + "moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

} 