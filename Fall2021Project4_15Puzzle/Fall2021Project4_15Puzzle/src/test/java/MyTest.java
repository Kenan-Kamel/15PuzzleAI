import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class MyTest {
	
	
	

	@Test
	void PuzzleTest() {
		Puzzle p = new Puzzle(); 
		assertNotNull(p, "the Class Puzzle didn't creat the new puzzle board correctly");	
	}
	
	@Test
	void PuzzleTest2() {
		
		Puzzle p = new Puzzle(); 
		assertNotNull(p, "the Class Puzzle didn't creat the new puzzle board correctly");	
	}
	
	@Test
	void AITest1() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicOne"); 
		
		assertNotNull(AI, "AI is null");	
	}
	
	@Test
	void AITest2() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicTwo"); 
		
		assertNotNull(AI, "AI2 is null");	
	}
	@Test
	void AITest3() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicTwo"); 
		Node sol = AI.findSolutionPath();
		assertNotNull(sol, "AI result is not returing the right result");	
	}
	@Test
	void AITest4() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicOne"); 
		Node sol = AI.findSolutionPath();
		assertNotNull(sol, "AI result is not returing the right result");	
	}
	
	@Test
	void AITest5() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicTwo"); 
		Node sol = AI.findSolutionPath();
		ArrayList<Node> arr = AI.getSolutionPath(sol); 
		assertNotNull(arr, "AI result is emtpy ");	
	}
	@Test
	void AITest6() {
		Puzzle p = new Puzzle(); 
		Node n = new Node(p.getPuzzle()); 
		DB_Solver2 AI = new DB_Solver2(n, "heuristicOne"); 
		Node sol = AI.findSolutionPath();
		ArrayList<Node> arr = AI.getSolutionPath(sol); 
		assertNotNull(arr, "AI result is emtpy ");	
	
	}
	
	
	
	@Test
	void checkwinTest1() {
		int[] arr = new int[] {0,1, 2,3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};
		boolean res = BoardLogic.checkWin(arr);
		assertEquals(true,res, "check winning fucntion has an issue");	
	}
	@Test
	void checkwinTest2() {
		int[] arr = new int[] {1,0, 2,3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};
		boolean res = BoardLogic.checkWin(arr);
		assertEquals(false,res, "check winning fucntion has an issue");	
	
	}
	
	@Test
	void checkwinTest3() {
		int[] arr = new int[] {1,0, 2,4, 3, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};
		boolean res = BoardLogic.checkWin(arr);
		assertEquals(false,res, "check winning fucntion has an issue");	
	
	}
	
	@Test
	void checkwinTest4() {
		int[] arr = new int[] {1,2, 0,4, 3, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};
		boolean res = BoardLogic.checkWin(arr);
		assertEquals(false,res, "check winning fucntion has an issue");	
	
	}
}
