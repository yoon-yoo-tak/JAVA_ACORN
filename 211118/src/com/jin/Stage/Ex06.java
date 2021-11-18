package com.jin.Stage;

import javafx.application.Application;
import java.awt.Dimension;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.Toolkit;
public class Ex06 extends Application{
/*
 * 
 * 
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
//		Text(x좌표, y좌표, 출력데이터)
		Text txt = new Text(10,40,"Hello World");
		Font font = new Font(40);
		txt.setFont(font);
//		Group은 pane의 종류 중 하나
		Group root = new Group(txt);
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("연습");
		s.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
