
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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
 * FinalSceneController Class: This class is used to dispaly the 
 * final screen of the game based on the result of the game 
 *
 * *******************************************************************
 */


public class FinalSceneController implements Initializable {
	
	@FXML
	private BorderPane pane;
	
    @FXML 
    private Button newPuzzle;
    
    @FXML 
    private Button exit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	public void exitButton() {
    	System.exit(0);
	}
	
	public void newPuzzle() {			
		
		
		
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished((f) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        	Parent root2;
    		try {
    			root2 = loader.load();
    	    	pane.getScene().setRoot(root2);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} 
        });

        pause.play();
	}
	
	
}


