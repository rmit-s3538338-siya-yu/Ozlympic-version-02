import java.util.ArrayList;
import java.util.Random;

public class Cycling extends Sports {
	
    public Cycling(String gameID, int count, String sportName, double playerTime) {
		super(gameID, count, sportName, playerTime);
		
	}
//    ArrayList<Sports> ath = new ArrayList<Sports>();
    
    //the first place got 5,the second got 2,the third got 1
    private final String gameName = "Cycling";    
    private final int first= 5; 
    private final int second= 2;
    private final int third = 1;

    //compete() method which will randomly generate a time 
    public double compete(){
    	//between 500 to 800 seconds for cycling.  
    	double maxTime=800;
    	  double minTime=500;
    	  double randomTime = Math.random() * 800 + 500;
    	  return randomTime;
      }

}
