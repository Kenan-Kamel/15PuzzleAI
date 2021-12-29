import java.util.ArrayList;
import java.util.concurrent.Callable;

/*
 * Names: Hussein Badi and Kenan Kamel A Alghythee
 * 
 * NetID: 679000947 and 664753831
 * 
 * Email: hbadi2@uic.edu and kalghy2@uic.edu
 * 
/*Description : 
 * ******************************************************************
 * MyCall Class: this calss wis where we implemnet the callable class
 * and the call function to recive a soluation from the AI and then
 * return aht soluation to the main class and it's running on a 
 * separte thread from the main class
 *
 * *******************************************************************
 */

public class MyCall implements Callable<ArrayList<Node>> {
	
	private DB_Solver2 AI; 
	public MyCall(Node startstate, String heuristic)
	{
		 AI = new DB_Solver2(startstate, heuristic); 
		
	}

	@Override
	public ArrayList<Node> call() throws Exception {
		 
		Node sol = AI.findSolutionPath(); 
		System.out.println(sol); 
		
		if(sol == null)
		{
			System.out.println("it's null"); 
			return null; 
		}
		ArrayList<Node> solutions = AI.getSolutionPath(sol); 
		
		
		return solutions;
	}

}
