package mediator;

public class MediatorDesignPattern {

	
	 public static void main(String args[])  
	    { 
	  
	        IATCMediator atcMediator = new ATCMediator(); 
	        Flight flight1 = new Flight(atcMediator); 
	        Runway runway1 = new Runway(atcMediator); 
	        atcMediator.registerFlight(flight1); 
	        atcMediator.registerRunway(runway1); 
	        flight1.getReady(); 
	        runway1.land(); 
	        flight1.land(); 
	          
	    } 
}
