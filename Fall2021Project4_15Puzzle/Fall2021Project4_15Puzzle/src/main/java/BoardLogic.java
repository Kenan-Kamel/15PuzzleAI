

/*
 * Names: Hussein Badi and Kenan Kamel A Alghythee
 * 
 * NetID: 679000947 and 664753831
 * 
 * Email: hbadi2@uic.edu and kalghy2@uic.edu
 * 
/*Description : 
 * ******************************************************************
 * BoardLogic Class: this class is used to implemnt the winning logic
 * of the game 
 *
 * *******************************************************************
 */

public class BoardLogic {
	


	public BoardLogic(int[] board){
		//this.board = board;
	}
	
	public static boolean checkWin(int[] board) {
		
	    for (int i = 0; i < board.length - 1; i++) {
	        if (board[i] > board[i + 1]) {
	        	System.out.println("not win");
	            return false;
	        }
	        
	    }
	    System.out.println("====win======");
	    return true;
	}

}
