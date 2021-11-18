package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex06_quiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Text txt = new Text(120,140, "Ifiscap World!");
		txt.setFont(new Font(35));
		
		Group root = new Group(txt);
		Scene scene = new Scene(root, 400,350);
		s.setScene(scene);
		s.setTitle("Quiz03");
		s.show();
	}

}
