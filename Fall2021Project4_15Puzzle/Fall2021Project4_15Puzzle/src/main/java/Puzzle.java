import java.util.ArrayList;
import java.util.Collections;

/*
 * Names: Hussein Badi and Kenan Kamel A Alghythee
 * 
 * NetID: 679000947 and 664753831
 * 
 * Email: hbadi2@uic.edu and kalghy2@uic.edu
 * 
/*Description : 
 * ******************************************************************
 * Puzzle Class: This class is used to create a 10 random puzzles and
 * then randomaly pick one and return it to the caller , we use the 
 * collection .shuffle 
 *
 * *******************************************************************
 */

public class Puzzle {
	
	
	public class puzzleNodes{
		private int[] puzzle;
		
		public  void setPuzzle(int[] puzzle ) {
			this.puzzle = puzzle; 
		}
	}
	
	private ArrayList<puzzleNodes> list;
	
	
	public Puzzle() {
		list = new ArrayList<puzzleNodes>();
		init();
		shufflePuzzle();
	}
	
	
	private void init(){
		puzzleNodes p = new puzzleNodes(); 
		int[] tmp = new int[] {14, 9, 13, 12, 15, 5, 0, 8, 11, 7, 4, 1, 3, 10, 6, 2};
		p.setPuzzle(tmp);
		list.add(p);

		puzzleNodes p2 = new puzzleNodes();
		int[] tmp2 = new int[] {0 ,14,  13,  12,  15 , 9,  5,  8,  11,  7 , 4 ,1, 3,  10,  6,  2 }; 
		p2.setPuzzle(tmp2);
		list.add(p2);
		
		puzzleNodes p3 = new puzzleNodes();
		int[] tmp3 = new int[] {14, 13, 12, 8, 15, 9, 4, 5, 11, 7, 0, 1, 3, 10, 6, 2}; 
		p3.setPuzzle(tmp3);
		list.add(p3);
		
		puzzleNodes p4 = new puzzleNodes();
		int[] tmp4 = new int[] {9, 7, 13, 12, 14, 0, 5, 8, 15, 10, 4, 1, 11, 3, 6, 2}; 
		p4.setPuzzle(tmp4);
		list.add(p4);
		
		puzzleNodes p5 = new puzzleNodes();
		int[] tmp5 = new int[] {14, 1, 12, 8, 15, 9, 13, 0, 11, 2, 4, 7, 3, 10, 6, 5}; 
		p5.setPuzzle(tmp5);
		list.add(p5);
		
		puzzleNodes p6 = new puzzleNodes();
		int[] tmp6 = new int[] {11, 1, 15, 8, 0, 9, 12, 13, 2, 14, 4, 7, 3, 10, 6, 5}; 
		p6.setPuzzle(tmp6);
		list.add(p6);
		
		puzzleNodes p7 = new puzzleNodes();
		int[] tmp7 = new int[] {12, 3, 0, 9, 15, 14, 6, 4, 10, 11, 8, 13, 7, 5, 1, 2}; // [14, 1, 12, 8, 15, 9, 13, 0, 11, 2, 4, 7, 3, 10, 6, 5]
		p7.setPuzzle(tmp7);
		list.add(p7);
		
		puzzleNodes p8 = new puzzleNodes();
		int[] tmp8 = new int[] {5, 7, 0, 15, 12, 10, 6, 3, 11, 1, 8, 9, 14, 4, 2, 13}; // [11, 1, 15, 8, 0, 9, 12, 13, 2, 14, 4, 7, 3, 10, 6, 5].
		p8.setPuzzle(tmp8);
		list.add(p8);
		
		puzzleNodes p9 = new puzzleNodes();
		int[] tmp9 = new int[] {1, 2, 7, 9, 12, 0, 6, 14, 4, 11, 15, 3, 5, 8, 13, 10}; // [12, 3, 0, 9, 15, 14, 6, 4, 10, 11, 8, 13, 7, 5, 1, 2]
		p9.setPuzzle(tmp9);
		list.add(p9);
		
		puzzleNodes p10 = new puzzleNodes();
		int[] tmp10 =new int[] {1, 2,0,3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15}; // [5, 7, 0, 15, 12, 10, 6, 3, 11, 1, 8, 9, 14, 4, 2, 13]
		p10.setPuzzle(tmp10);
		list.add(p10);                        
		
	}
	
	private void shufflePuzzle() {
		Collections.shuffle(list);
	}
	
	public int[] getPuzzle() {
		
		return this.list.get(0).puzzle;
		
	}
	
	public void printList() {
		System.out.println("printing list funcion "  +  list.get(0));
	}
	
}
