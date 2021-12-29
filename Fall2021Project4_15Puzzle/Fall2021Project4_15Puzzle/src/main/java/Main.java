import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		
		 try {
	            // Read file fxml and draw interface.
	            Parent root = FXMLLoader.load(getClass()
	                    .getResource("/FXML/Myfxml.fxml"));
	 
	            primaryStage.setTitle("15 puzzles");
          Scene s1 = new Scene(root, 1270,870);
	            primaryStage.setScene(s1);
	            primaryStage.show();
	         
	        } catch(Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        }
	}

}

