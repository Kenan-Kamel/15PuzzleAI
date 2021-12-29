import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

/*
 * Names: Hussein Badi and Kenan Kamel A Alghythee
 * 
 * NetID: 679000947 and 664753831
 * 
 * Email: hbadi2@uic.edu and kalghy2@uic.edu
 * 
/*Description : 
 * ******************************************************************
 *GameSceneController Class: This class is used to implemnt all the 
 *GUI action and most of the game code is implmented here, so the AI
 *implemtation to connect the gui is implmened here and also all the 
 *other buttons read and write and chagne that deispaledy are implemtned
 *here.
 *
 * *******************************************************************
 */
public class GameSceneController implements Initializable {

	@FXML
	private BorderPane pane;
	
    @FXML 
    private GridPane grid;
	
    @FXML 
    private Button b0;
	
    @FXML 
    private Button b1;
    
    @FXML 
    private Button b2;
    
    @FXML 
    private Button b3;
    
    @FXML 
    private Button b4;
    
    @FXML 
    private Button b5;
    
    @FXML 
    private Button b6;
    
    @FXML 
    private Button b7;
    
    @FXML 
    private Button b8;
    
    @FXML 
    private Button b9;
    
    @FXML 
    private Button b10;
    
    @FXML 
    private Button b11;
    
    @FXML 
    private Button b12;
    
    @FXML 
    private Button b13;
    
    @FXML 
    private Button b14;
    
    @FXML 
    private Button b15;
    
    @FXML 
    private Button h1;
    
    @FXML 
    private Button h2;
    
    @FXML 
    private Button solutionButton;
    
    @FXML 
    private Button soltuinButton;
    
    @FXML 
    private Button newPuzzle;
    
    @FXML 
    private Button exit;
    
    
    boolean AIWin;
    int[] randomPuzzle;
    int[] currBoard;
    MyCall AI ; 
    Puzzle puzzle;
    PauseTransition pause;
    ArrayList<Node> AIAnswer;
    int index =0; 

	@Override
	/*
	 * This is where we initizlie most  of the thing at the 
	 * start of the proejct 
	 */
	public void initialize(URL location, ResourceBundle resources) {
		AIWin = false;
		pause = new PauseTransition();
		currBoard = new int[16];
		puzzle = new Puzzle();
		int[] randomPuzzle = puzzle.getPuzzle();
		System.out.println("insdie Game Controller " + randomPuzzle);
		puzzle.printList();
		wirteBoard(randomPuzzle);
		readBoard();
  
	}
	
	/*
	 * exit the exit
	 */
	public void exitButton() {
    	System.exit(0);
	}
	
	/*
	 * This function will call other 
	 * scene to psibaly the main scence of
	 * the game 
	 */
	public void newPuzzle() {
        pause.setDuration(Duration.seconds(1)); 
        pause.setOnFinished((f) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        	Parent root2;
    		try {
    			root2 = loader.load();
    	    	pane.getScene().setRoot(root2);
    		} catch (IOException e) {
    			e.printStackTrace();
    		} 
        });

        pause.play();
	}
	
	/*
	 * this is used to the baord and played the logic at
	 * each button until button15Action
	 */

	
	public void button0Action() {
	
		if(b4.getText().equals("0")) {
			
			b4.setText(b0.getText());
			b0.setText("0"); 
			b0.setVisible(false);
			b4.setVisible(true);
		}
		else if (b1.getText().equals("0"))
		{
			
			b1.setText(b0.getText());
			b0.setText("0"); 
			b0.setVisible(false);
			b1.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	
	public void button1Action() {
		System.out.println("here in button1"); 
		if(b2.getText().equals("0")) 
		{
			
			b2.setText(b1.getText());
			b1.setText("0");
			b1.setVisible(false);
			b2.setVisible(true);
		
		}
		else if (b0.getText().equals("0"))
		{
			b0.setText(b1.getText());
			b1.setText("0");
			b1.setVisible(false);
			b0.setVisible(true);
		}
		else if (b5.getText().equals("0"))
		{
			b5.setText(b1.getText());
			b1.setText("0");
			b1.setVisible(false);
			b5.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	/*
	 * this is used to the baord and played the logic at
	 * each button until button15Action
	 */
	public void button2Action() {
		System.out.println("here in button2"); 
		if(b1.getText().equals("0")) 
		{
			
			b1.setText(b2.getText());
			b2.setText("0");
			b2.setVisible(false);
			b1.setVisible(true);
		
		}
		else if (b3.getText().equals("0"))
		{
			b3.setText(b2.getText());
			b2.setText("0");
			b2.setVisible(false);
			b3.setVisible(true);
		}
		else if (b6.getText().equals("0"))
		{
			b6.setText(b2.getText());
			b2.setText("0");
			b2.setVisible(false);
			b6.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	
	public void button3Action() {
		
		if(b2.getText().equals("0")) 
		{
			
			b2.setText(b3.getText());
			b3.setText("0");
			b3.setVisible(false);
			b2.setVisible(true);
		
		}
		else if (b7.getText().equals("0"))
		{
			b7.setText(b3.getText());
			b3.setText("0");
			b3.setVisible(false);
			b7.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
		
	 }
	
	
	public void button4Action() {
		
		 if (b5.getText().equals("0"))
		{
			b5.setText(b4.getText());
			b4.setText("0");
			b4.setVisible(false);
			b5.setVisible(true);
		}
		 else if (b0.getText().equals("0"))
		{
			b0.setText(b4.getText());
			b4.setText("0");
			b4.setVisible(false);
			b0.setVisible(true);
		}
		 else if (b8.getText().equals("0"))
		{
			b8.setText(b4.getText());
			b4.setText("0");
			b4.setVisible(false);
			b8.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	/*
	 * same as the above 
	 */
	
	public void button5Action() {
	
		 if (b1.getText().equals("0"))
		{
			b1.setText(b5.getText());
			b5.setText("0");
			b5.setVisible(false);
			b1.setVisible(true);
		}
	 else if (b4.getText().equals("0"))
		{
			b4.setText(b5.getText());
			b5.setText("0");
			b5.setVisible(false);
			b4.setVisible(true);
		}
	 else if (b6.getText().equals("0"))
		{
			b6.setText(b5.getText());
			b5.setText("0");
			b5.setVisible(false);
			b6.setVisible(true);
		}
	 else if (b9.getText().equals("0"))
		{
			b9.setText(b5.getText());
			b5.setText("0");
			b5.setVisible(false);
			b9.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	
	public void button6Action() {
	
		 if (b2.getText().equals("0"))
		{
			b2.setText(b6.getText());
			b6.setText("0");
			b6.setVisible(false);
			b2.setVisible(true);
		}
	 else if (b5.getText().equals("0"))
		{
			b5.setText(b6.getText());
			b6.setText("0");
			b6.setVisible(false);
			b5.setVisible(true);
		}
	 else if (b7.getText().equals("0"))
		{
			b7.setText(b6.getText());
			b6.setText("0");
			b6.setVisible(false);
			b7.setVisible(true);
		}
	 else if (b10.getText().equals("0"))
		{
			b10.setText(b6.getText());
			b6.setText("0");
			b6.setVisible(false);
			b10.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }////////
	
	
	public void button7Action() {
		
		 if (b3.getText().equals("0"))
		{
			b3.setText(b7.getText());
			b7.setText("0");
			b7.setVisible(false);
			b3.setVisible(true);
		}
	 else if (b6.getText().equals("0"))
		{
			b6.setText(b7.getText());
			b7.setText("0");
			b7.setVisible(false);
			b6.setVisible(true);
		}
	 else if (b11.getText().equals("0"))
		{
			b11.setText(b7.getText());
			b7.setText("0");
			b7.setVisible(false);
			b11.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }/////////////////////////////
		
	
	public void button8Action() {
		
		 if (b4.getText().equals("0"))
		{
			b4.setText(b8.getText());
			b8.setText("0");
			b8.setVisible(false);
			b4.setVisible(true);
		}
		 else if (b9.getText().equals("0"))
		{
			b9.setText(b8.getText());
			b8.setText("0");
			b8.setVisible(false);
			b9.setVisible(true);
		}
	 
		 else if (b12.getText().equals("0"))
		{
			b12.setText(b8.getText());
			b8.setText("0");
			b8.setVisible(false);
			b12.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	
	public void button9Action() {
		
		if (b8.getText().equals("0"))
		{
			b8.setText(b9.getText());
			b9.setText("0");
			b9.setVisible(false);
			b8.setVisible(true);
		}
		
		else if (b5.getText().equals("0"))
		{
			b5.setText(b9.getText());
			b9.setText("0");
			b9.setVisible(false);
			b5.setVisible(true);
		}
		else if (b10.getText().equals("0"))
		{
			b10.setText(b9.getText());
			b9.setText("0");
			b9.setVisible(false);
			b10.setVisible(true);
		}
		else if (b13.getText().equals("0"))
		{
			b13.setText(b9.getText());
			b9.setText("0");
			b9.setVisible(false);
			b13.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }/////////
	
	
	public void button10Action() {
		
		if (b9.getText().equals("0"))
		{
			b9.setText(b10.getText());
			b10.setText("0");
			b10.setVisible(false);
			b9.setVisible(true);
		}
		else if (b11.getText().equals("0"))
		{
			b11.setText(b10.getText());
			b10.setText("0");
			b10.setVisible(false);
			b11.setVisible(true);
		}
		else if (b14.getText().equals("0"))
		{
			b14.setText(b10.getText());
			b10.setText("0");
			b10.setVisible(false);
			b14.setVisible(true);
		}
		else if (b6.getText().equals("0"))
		{
			b6.setText(b10.getText());
			b10.setText("0");
			b10.setVisible(false);
			b6.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	 }
	
	
	public void button11Action() {
		
		if (b7.getText().equals("0"))
		{
			b7.setText(b11.getText());
			b11.setText("0");
			b11.setVisible(false);
			b7.setVisible(true);
		}
		else if (b10.getText().equals("0"))
		{
			b10.setText(b11.getText());
			b11.setText("0");
			b11.setVisible(false);
			b10.setVisible(true);
		}
		
		else if (b10.getText().equals("0"))
		{
			b10.setText(b11.getText());
			b11.setText("0");
			b11.setVisible(false);
			b10.setVisible(true);
		}
		else if (b15.getText().equals("0"))
		{
			b15.setText(b11.getText());
			b11.setText("0");
			b11.setVisible(false);
			b15.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	}
	
	/*
	 * Also same here 
	 */
	public void button12Action() {
		System.out.println("here in button12"); 
		if (b8.getText().equals("0"))
		{
			b8.setText(b12.getText());
			b12.setText("0");
			b12.setVisible(false);
			b8.setVisible(true);
		}
		
		else if (b13.getText().equals("0"))
		{
			b13.setText(b12.getText());
			b12.setText("0");
			b12.setVisible(false);
			b13.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	}
	
	
	public void button13Action() {
		System.out.println("here in button13"); 
		if (b9.getText().equals("0"))
		{
			b9.setText(b13.getText());
			b13.setText("0");
			b13.setVisible(false);
			b9.setVisible(true);
		}
		else if (b14.getText().equals("0"))
		{
			b14.setText(b13.getText());
			b13.setText("0");
			b13.setVisible(false);
			b14.setVisible(true);
		}
		else if (b12.getText().equals("0"))
		{
			b12.setText(b13.getText());
			b13.setText("0");
			b13.setVisible(false);
			b12.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	}
	
	
	public void button14Action() {
		System.out.println("here in button14"); 
		if (b10.getText().equals("0"))
		{
			b10.setText(b14.getText());
			b14.setText("0");
			b14.setVisible(false);
			b10.setVisible(true);
		}
		else if (b15.getText().equals("0"))
		{
			b15.setText(b14.getText());
			b14.setText("0");
			b14.setVisible(false);
			b15.setVisible(true);
		}
		else if (b13.getText().equals("0"))
		{
			b13.setText(b14.getText());
			b14.setText("0");
			b14.setVisible(false);
			b13.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	}//////////////
	
	/*
	 * same as the above 15 event handler /fucniton 
	 */
	public void button15Action() {
		System.out.println("here in button15"); 
		if (b11.getText().equals("0"))
		{
			b11.setText(b15.getText());
			b15.setText("0");
			b15.setVisible(false);
			b11.setVisible(true);
		}
		else if (b14.getText().equals("0"))
		{
			b14.setText(b15.getText());
			b15.setText("0");
			b15.setVisible(false);
			b14.setVisible(true);
		}
		readBoard();
		winScene(BoardLogic.checkWin(currBoard));
	}//////////////////////////////////////
	
	/*
	 * This function used to read the board and 
	 * sotre this information in the currboard 
	 * so it could be sent to the AI
	 */
	private void readBoard() {
		
		currBoard[0] = Integer.valueOf(b0.getText());
		currBoard[1] = Integer.valueOf(b1.getText());
		currBoard[2] = Integer.valueOf(b2.getText());
		currBoard[3] = Integer.valueOf(b3.getText());
		currBoard[4] = Integer.valueOf(b4.getText());
		currBoard[5] = Integer.valueOf(b5.getText());
		currBoard[6] = Integer.valueOf(b6.getText());
		currBoard[7] = Integer.valueOf(b7.getText());
		currBoard[8] = Integer.valueOf(b8.getText());
		currBoard[9] = Integer.valueOf(b9.getText());
		currBoard[10] = Integer.valueOf(b10.getText());
		currBoard[11] = Integer.valueOf(b11.getText());
		currBoard[12] = Integer.valueOf(b12.getText());
		currBoard[13] = Integer.valueOf(b13.getText());
		currBoard[14] = Integer.valueOf(b14.getText());
		currBoard[15] = Integer.valueOf(b15.getText());
		
	}
	/*
	 * This function is used to write code to the board 
	 * and chagne the entire grid pane 
	 */
	
	private void wirteBoard(int[] arr){
		/*
		 * the list of if statmetns is used
		 * to determin where is the empty spot
		 * and set it to unvisiable 
		 */
		if(arr[0] == 0) {
			b0.setVisible(false);
		} else {
			b0.setVisible(true);
		}
		if(arr[1] == 0) {
			b1.setVisible(false);
		} else {
			b1.setVisible(true);
		}
		if(arr[2] == 0) {
			b2.setVisible(false);
		} else {
			b2.setVisible(true);
		}
		if(arr[3] == 0) {
			b3.setVisible(false);
		} else {
			b3.setVisible(true);
		}
		if(arr[4] == 0) {
			b4.setVisible(false);
		} else {
			b4.setVisible(true);
		}
		if(arr[5] == 0) {
			b5.setVisible(false);
		} else {
			b5.setVisible(true);
		}
		if(arr[6] == 0) {
			b6.setVisible(false);
		} else {
			b6.setVisible(true);
		}
		if(arr[7] == 0) {
			b7.setVisible(false);
		} else {
			b7.setVisible(true);
		}
		if(arr[8] == 0) {
			b8.setVisible(false);
		} else {
			b8.setVisible(true);
		}
		if(arr[9] == 0) {
			b9.setVisible(false);
		} else {
			b9.setVisible(true);
		}
		if(arr[10] == 0) {
			b10.setVisible(false);
		} else {
			b10.setVisible(true);
		}
		if(arr[11] == 0) {
			b11.setVisible(false);
		} else {
			b11.setVisible(true);
		}
		if(arr[12] == 0) {
			b12.setVisible(false);
		} else {
			b12.setVisible(true);
		}
		if(arr[13] == 0) {
			b13.setVisible(false);
		} else {
			b13.setVisible(true);
		}
		if(arr[14] == 0) {
			b14.setVisible(false);
		} else {
			b14.setVisible(true);
		}
		if(arr[15] == 0) {
			b15.setVisible(false);
		} else {
			b15.setVisible(true);
		}
		
		/*
		 * set the text based on teh current array to dispaly
		 *  the chagnes to the screen 
		 *  
		 */
		b0.setText(String.valueOf(arr[0]));
		b1.setText(String.valueOf(arr[1]));
        b2.setText(String.valueOf(arr[2]));
        b3.setText(String.valueOf(arr[3]));
        b4.setText(String.valueOf(arr[4]));
        b5.setText(String.valueOf(arr[5]));
        b6.setText(String.valueOf(arr[6]));
        b7.setText(String.valueOf(arr[7]));
        b8.setText(String.valueOf(arr[8]));
        b9.setText(String.valueOf(arr[9]));
        b10.setText(String.valueOf(arr[10]));
        b11.setText(String.valueOf(arr[11]));
        b12.setText(String.valueOf(arr[12]));
        b13.setText(String.valueOf(arr[13]));
        b14.setText(String.valueOf(arr[14]));
        b15.setText(String.valueOf(arr[15]));
        readBoard();
        boolean res = BoardLogic.checkWin(currBoard); 
		System.out.println(res); 
		if(res) {
			AIWin = true;
			winScene(BoardLogic.checkWin(currBoard));
		}
        
	}
	
	/*
	 * this funciton is used to 
	 */
	private void winScene(boolean check) {
		if(check) {
			
			if (AIWin) {
				pane.setDisable(true);
				pause.setDuration(Duration.seconds(1.5)); 
		        pause.setOnFinished((f) -> {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml4.fxml"));
		        	Parent root2;
		    		try {
		    			root2 = loader.load();
		    	    	pane.getScene().setRoot(root2);
		    		} catch (IOException e) {
		    			e.printStackTrace();
		    		} 
		        });

		        pause.play();
			} else {
				pane.setDisable(true);
				pause.setDuration(Duration.seconds(1.5)); 
		        pause.setOnFinished((f) -> {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml3.fxml"));
		        	Parent root2;
		    		try {
		    			root2 = loader.load();
		    	    	pane.getScene().setRoot(root2);
		    		} catch (IOException e) {
		    			e.printStackTrace();
		    		} 
		        });

		        pause.play();
			}
			
		} else {
			return;
		}
		
	}
	
	public void buttonH1Action() {
		solveWithAI("heuristicOne");
	}
	
	
	public void buttonH2Action() {
		solveWithAI("heuristicTwo");
	}
	
	/*
	 * this is used to diaply the moves to the user
	 * on hte board and sit the pasuses on the screen
	 * for each / top 10 moves 
	 */
	public void setMoves(ArrayList<Node> solution) {
		solution.remove(0);
		/*
		 * if the slouation is less then 10
		 */
		if(solution.size() < 10) {
			PauseTransition pause1 = new PauseTransition((Duration.seconds(0.1)));
	        pause1.setOnFinished((f) -> {
	        	
	        	int[] tmp = solution.get(index).getKey();	
	        	wirteBoard(tmp);
	        	readBoard();
	        
	        	index++; 
	        	if(index < solution.size() )
	        	{
	        		
	        		pause1.play(); 
	        		
	        	}
	        	
	        });
	        pause1.play();
			
		} else { // slouation is more then 10
			PauseTransition pause1 = new PauseTransition((Duration.seconds(0.1)));
		        pause1.setOnFinished((f) -> {
		        	
		        	int[] tmp = solution.get(index).getKey();	
		        	wirteBoard(tmp);
		        	
		      
		        	index++; 
		        	if(index < 10 )
		        	{
		        		
		        		pause1.play(); 
		        		
		        	}
		        	
		        });
		        pause1.play();
		}
		
	}
	
	/*
	 * This is where the soluation will be 
	 * clciked by the user and dispaleyd on
	 * the screen 
	 */
	public void seeSolution() {
		setMoves(AIAnswer);
		solutionButton.setDisable(true);
		readBoard();
		index=0; 
	}
	/*
	 * This function will be used to 
	 * call the AI function and run it on 
	 * a spreate thread using callable class 
	 * and then dispaly it to the user 
	 */
	
	public void solveWithAI(String algorithm){
		readBoard();
		Node sol = new Node(currBoard); 
		
		AI = new MyCall(sol, algorithm); 
		System.out.println(sol); 
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		Future<ArrayList<Node>> future = ex.submit(AI);
		Thread t = new Thread(()->{try {
			AIAnswer = future.get();
			solutionButton.setDisable(false);
			readBoard(); 
			winScene(BoardLogic.checkWin(currBoard));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} } );
		t.start();
	}
	
}



/*
 public void setButtonsNumbers(int[] randomPuzzle) {
		if(randomPuzzle[0] == 0){
			b0.setVisible(false);
		} else if(randomPuzzle[1] == 0) {
			b1.setVisible(false);
		} else if(randomPuzzle[2] == 0) {
			b2.setVisible(false);
		}else if(randomPuzzle[3] == 0) {
			b3.setVisible(false);
		}else if(randomPuzzle[4] == 0) {
			b4.setVisible(false);
		}else if(randomPuzzle[5] == 0) {
			b5.setVisible(false);
		}else if(randomPuzzle[6] == 0) {
			b6.setVisible(false);
		}else if(randomPuzzle[7] == 0) {
			b7.setVisible(false);
		}else if(randomPuzzle[8] == 0) {
			b8.setVisible(false);
		}else if(randomPuzzle[9] == 0) {
			b9.setVisible(false);
		}else if(randomPuzzle[10] == 0) {
			b10.setVisible(false);
		}else if(randomPuzzle[11] == 0) {
			b11.setVisible(false);
		}else if(randomPuzzle[12] == 0) {
			b12.setVisible(false);
		}else if(randomPuzzle[13] == 0) {
			b13.setVisible(false);
		}else if(randomPuzzle[14] == 0) {
			b14.setVisible(false);
		}else {
			b15.setVisible(false);
		}
		
		b0.setText(String.valueOf(randomPuzzle[0]));
		b1.setText(String.valueOf(randomPuzzle[1]));
		b2.setText(String.valueOf(randomPuzzle[2]));
		b3.setText(String.valueOf(randomPuzzle[3]));
		b4.setText(String.valueOf(randomPuzzle[4]));
		b5.setText(String.valueOf(randomPuzzle[5]));
		b6.setText(String.valueOf(randomPuzzle[6]));
		b7.setText(String.valueOf(randomPuzzle[7]));
		b8.setText(String.valueOf(randomPuzzle[8]));
		b9.setText(String.valueOf(randomPuzzle[9]));
		b10.setText(String.valueOf(randomPuzzle[10]));
		b11.setText(String.valueOf(randomPuzzle[11]));
		b12.setText(String.valueOf(randomPuzzle[12]));
		b13.setText(String.valueOf(randomPuzzle[13]));
		b14.setText(String.valueOf(randomPuzzle[14]));
		b15.setText(String.valueOf(randomPuzzle[15]));
		
	}
 */




