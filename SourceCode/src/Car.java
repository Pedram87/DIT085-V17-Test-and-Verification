package src;


public class Car extends Parking {
	
	/* This method moves the car 1 meter forward, queries the two infrared sensors through the 
	 * isEmpty method described below 
	 * and returns a data structure that contains the current position of the car,  
	 * and the situation of the detected parking places up to now.
	   The car cannot be moved forward beyond the end of the street.*/ 													
	public int moveForward(int move){
		move = 1;
		System.out.println("The Car has moved 1m forward");
		return move *5;
		
		
		
	}
}
