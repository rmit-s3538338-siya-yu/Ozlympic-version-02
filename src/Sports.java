/* Sports Class is used for storing a game session AND individual athlete information
 * within that Sports type. (e.g if sports class created for storing one game 
 * (with gameID, Officials etc.) the class type will also create another class 
 * of its same type for storing individual athlete information(e.g. athlete ID, 
 * finishing time)).  
 */
public class Sports {
	private String gameID;
	private int count = 0;
	private String gameName;	
	double playerTime;
	public Sports(String gameID, int count, String gameName, double playerTime) {
		super();
		this.count = count;
		this.gameID = gameID;
		this.setGameName(gameName);
		this.playerTime = playerTime;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	    
	   
}
