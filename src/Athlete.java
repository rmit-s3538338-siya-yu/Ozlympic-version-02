
import java.util.Random;

public interface Athlete
{
	
    //get game name
    public Sports getGname();
    //set game name
	public void setType(Sports gameName);
	//compete() will randomly generate a time
    public int compete(Random time);
}
    
