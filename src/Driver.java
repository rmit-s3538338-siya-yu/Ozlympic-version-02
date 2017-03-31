import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
	private static final Scanner in = null;
	static Scanner input=new Scanner(System.in);
	static Scanner input1=new Scanner(System.in);
	
	//The driver class should show menu
	private static void showMenu() 
	{
		System.out.println("\n=========================");
		System.out.println("|   Welcome to Ozlympic  |");
		System.out.println("=========================");
	    System.out.println(" 1.Select a game to run");
		System.out.println(" 2.Predict the winner of the game");
		System.out.println(" 3.Start the game ");
		System.out.println(" 4.Display the final results of all games");
		System.out.println(" 5.Display the points of all athlets");
		System.out.println(" 6.exit");
		System.out.println(" Please enter your option: ");
	}
	
	
	public static void menuSelect(){
		LinkedList<Participants> participant=new LinkedList<Participants>();
		participant.add(new Participants("NO.1","Siya Yu",24,"VIC","swimmer"));
		participant.add(new Participants("NO.2","James",25,"New","runner"));
		LinkedList<Sports> sportList=new LinkedList<Sports>();
		sportList.add(new Sports("s01", 1, "Swimming",12.22));
		String Input;
		do{
			showMenu();
			Input=input.nextLine();
			switch(Input){
			case "1": gameSelect();
				break;
			case "2": predictPlayer(participant);
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				System.out.print("Exit Game! Good bye!");
				break;
			default:
				System.out.println("Invalid number!Please input number from 1 to 6!");
			}
		}while(Input!="6");
		input.close();
		}
	
	private static void printgameMenu() 
	{
		System.out.println("======================");
		System.out.println("|     Game lists     |"  );
		System.out.println("======================");
	    System.out.println(" 1.Swimming");
		System.out.println(" 2.Cycling");
		System.out.println(" 3.Running");
		System.out.println(" 4.Exit Game");
		System.out.println(" Select a game: ");
	}
	
	private static void gameSelect() 
	{
		String option;
	do{
		printgameMenu();
			option = input.nextLine();
     		switch(option){
			case "1": 
				menuSelect();
				break;
     		case "2":
				showMenu();
				break;
			case "3":
				showMenu();
				break;
			case "4":
				System.out.print("Exit Game! Good Bye!");
				showMenu();
				break;
			default:
				System.out.println("Invaild number!Please input number from 1 to 4!");
		}
			}while(option!="4");
			input.close();
		}
	
	
	private static void predictSelect(LinkedList<Sports> sportList) 
	{   //// first, get the game name that user plan to predict.
		////read game name from input Scanner
		String userChoose = in.next();
		boolean type=false;
		int index=0;
		for(int i=0;i<sportList.size();i++){
		if(userChoose.equals(sportList.get(i).getGameName())){
		      predictPlayer(null);
//		      userChoose = input.nextLine();
//	     		switch(userChoose){
//				case "1": 
//					menuSelect();
//					break;
//	     		case "2":
//					showMenu();
//					break;
//				case "3":
//					showMenu();
//					break;
//				case "4":
//					System.out.print("Exit Game! Good Bye!");
//					showMenu();
//					break;
//				default:
//					System.out.println("Please input number from 1 to 4!");
////			}
//				}while(userChoose!="4");
//				input.close();
//			    type=true;
//				index=i;
//				break;
			}if(!type){
				System.out.println("No Game Name matching ...");
				return;
			}	
		}
	}
	//user choose a player as winner.
	
	public static void predictPlayer(LinkedList<Participants> participant){
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("|The list of players for prediction |");
		System.out.println("====================================");
		for(int i=0;i<participant.size();i++)
		{   
			System.out.print(participant.get(i).getID()+" ");
//			System.out.print("Type:"+participant.get(i).getType()+" ");
			System.out.print(participant.get(i).getName()+" ");
//			System.out.print(participant.get(i).getAge()+" ");
//			System.out.print(participant.get(i).getState()+" ");
//			System.out.println(participant.get(i).getAge());
		}

	System.out.print(" \nPlease choose a player as your predicted winner for");

	}
	}
//		System.out.println();
//		System.out.println("\nReturn back to main menu please input 4.");
//		for(int i=0;i<participant.size();i++){
//				if(participant.get(i).getName().equals(participant.get(i).getName()))
//				{
//					System.out.println("Your prediction is "+participant.get(i).getName());
//					name=true;
//					index=i;
//					break;
//				}	
//			if(!participant.get(i).getName())
//			{
//				System.out.println("No Athlet matching that id was found ...");
//				return 
//	}
//		public void predictMenu(){
//			String choose1=in.nextLine();
//			boolean name=false;
//			int index=0;
//		String choose1=in.nextLine();
//		boolean name=false;
//		int index=0;
//		// read choice of user from input Scanner
//		for(int i=0;i<participant.size();i++)
//		{
//			if(name.equals(participant.get(i).name))
//			{
//				System.out.println("Your prediction is "+participant.add(null));
//				name=true;
//				index=i;
//				break;
//			}	
//		}
//		if(!name)
//		{
//			System.out.println("No Athlet matching that id was found ...");
//			return;
//		}	
//		public void playerSelect()
//		{
//		  String choose;
//		do{
//			predictPlayer(null);
//			choose=input.nextLine();
//			switch(choose){
//			case "1": 
//				break;
//			case "2":
//				break;
//			case "3":
//				break;
//			case "4":
//				showMenu();
//			default:
//				System.out.println("Invaild number!Please input number from 1 to 4!");
//		}
//		}
//		while(choose!=0);
//		
		
	


	
	

