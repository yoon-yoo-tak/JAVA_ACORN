package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex04 extends Application{
/*
 * 화면의 해상도 구하기
 * 
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("연습");
		s.show();
		
//		 1/1000 초로 시간을 지연시킴, 2000이면 2초
		Thread.sleep(2000);
		
//		창 숨기기
		s.hide();
		
		Thread.sleep(2000);
		s.setX(10);
		s.setY(10);
		s.show();
//		창을 최소화 시킴
//		s.setIconified(true); 
	}
	public static void main(String[] args) {
		launch(args);
	}
}
