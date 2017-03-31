
public class Swimming extends Sports {

	public Swimming(String gameID, int count, String gameName, double playerTime) {
		super(gameID, count, gameName, playerTime);
		// TODO Auto-generated constructor stub
	}
	//the first place got 5,the second got 2,the third got 1
    private final String gameName = "Swimming";    
    private final int first= 5; 
    private final int second= 2;
    private final int third = 1;

    //compete() method which will randomly generate a time 
    public double compete(){
    	//between 500 to 800 seconds for Swimming.  
    	double maxTime=800;
    	  double minTime=500;
    	  double randomSTime = Math.random() * maxTime + minTime;
    	  return randomSTime;
    }
}
