import java.util.ArrayList;

public class Running extends Sports{
public Running(String gameID, int count, String gameName, double playerTime) {
		super(gameID, count, gameName, playerTime);
		// TODO Auto-generated constructor stub
	}

    
    private final String gameName = "Running"; //Used to print Sports Type    
    private final int first = 5; //constant points for top finishers
    private final int second = 2;
    private final int third = 1;
    
  //compete() method which will randomly generate a time 
    public double compete(){
    	//between 10 to 20 seconds for running.  
    	double maxTime=20;
    	  double minTime=10;
    	  double randomRTime = Math.random() * maxTime + minTime;
    	  return randomRTime;
      }
}
