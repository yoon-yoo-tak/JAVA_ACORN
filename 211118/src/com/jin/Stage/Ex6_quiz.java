package com.jin.Stage;

import javafx.application.Application;

import java.awt.Dimension;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;
public class Ex6_quiz extends Application{
/*
 * 
 * 
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		AnchorPane root = new AnchorPane();		

		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("Quiz02!");
		s.show();
//		
//
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
//		
//		s.setX(screenSize.width / 2);
//		s.setY(screenSize.height / 2);
//		Thread.sleep(2000);
//		s.show();
		
		int x = 10;
		int y = 10;
		int n = 10;
		int delay = 300;
		int gabX = ((screenSize.width-300)/2 - x)/n;
		int gabY = ((screenSize.width-200)/2 - y)/n;
		for(int i=0; i<n;i++) {
			s.setX(10+gabX*i);
			s.setY(10+gabY*i);
			s.hide();
			delay = delay - i*i;
			if(delay<0) {
				delay = 1;
			}
			Thread.sleep(delay);
			s.show();
		}
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
