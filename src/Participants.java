import java.util.LinkedList;

public class Participants {
	
	private String ID;
	private String name;
	private int age;
	private String state;
	private String type;
	LinkedList<Participants> participant = new LinkedList<Participants>();
	
	public String getID() 
	{
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public LinkedList<Participants> getParticipant() {
//		return participant;
//	}

	public void setParticipant(LinkedList<Participants> participant) {
		this.participant = participant;
	}

	
	
	public Participants(String ID,String name,int age,String state,String type){
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.state=state;
		this.type=type;
	}
	
	public LinkedList<Participants> getParticipant(Participants p)
	{
		participant.add(p);
		return participant;
	}
}
