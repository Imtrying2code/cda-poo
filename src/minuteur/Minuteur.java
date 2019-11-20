package minuteur;

public class Minuteur {

	public static void main(String[] args) { 
		Minute minute = new Minute(); 
		minute.tic(); 
		minute.tic(); 
		minute.avancer(57); 
		minute.tic(); 
		
		minute.setMinute(20);
		
		} 
	}
