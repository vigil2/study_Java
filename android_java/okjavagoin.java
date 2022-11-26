import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class okjavagoin {

	public static void main(String[] args) {
		

		String id = "JAVA APT 507";
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
		
	}

}