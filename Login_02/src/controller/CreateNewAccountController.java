package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CreateNewAccountController extends Application{
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			GridPane grid = new GridPane();
			Text scenetitle = new Text("Welcome");
			Scene scene = new Scene(grid,400,400);
			Label userName = new Label("Create User Name:");
			TextField userTextField = new TextField();
			Button btn = new Button("Create");
			
			
			final Text actiontarget = new Text();
			
			//??????
			//Code to Handle an Event
	        //make the button display the text message when the user presses it. 
			btn.setOnAction(new EventHandler<ActionEvent>() {
				 
			    @Override
			    public void handle(ActionEvent e) {
			        actiontarget.setFill(Color.FIREBRICK);
			        actiontarget.setText("New Account Created");
			    }
			});
			
			
			
			//sets the position of our objects to center
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			grid.setPadding(new Insets(25, 25, 25, 25));
			
			//Add Text, Labels, and Text Fields
			//set our scene title it will appear in the center of our box
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);
			
			//text field name and enterance area for username
			grid.add(userName, 0, 1);
			
			
			grid.add(userTextField, 1, 1);
			
			//text field for password
			Label pw = new Label("Create Password:");
			grid.add(pw, 0, 2);
			PasswordField pwBox = new PasswordField();
			grid.add(pwBox, 1, 2);
			
			//Add our sign in Button 
			HBox hbBtn = new HBox(10);
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn, 1, 4);
				
			
			
			primaryStage.setScene(scene);
			//sets our title for our window
			primaryStage.setTitle("Hello to Chess Login");
			primaryStage.show();
			
			//Text control for displaying the message
	        grid.add(actiontarget, 1, 6);
			
	        
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
