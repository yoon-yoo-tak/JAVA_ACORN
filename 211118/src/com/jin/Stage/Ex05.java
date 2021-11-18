package com.jin.Stage;

import javafx.application.Application;
import java.awt.Dimension;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.awt.Toolkit;
public class Ex05 extends Application{
/*
 * 화면의 해상도 구하기
 * (x-rx)/2
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("연습");
		s.show();
		
		Thread.sleep(2000);
//		1. 해상도 구하기
		Toolkit tk = Toolkit.getDefaultToolkit();
//		Dimension은 x, y 좌표 저장
		Dimension screenSize = tk.getScreenSize();
		
		System.out.println("width : " + screenSize.width);
		System.out.println("height : " + screenSize.height);
		
//		창 크기 지정
		int RectX = 300;
		int RectY = 200;
//		정 중앙에 위치시키기
		s.setX((screenSize.width-RectX)/2);
		s.setY((screenSize.height-RectY)/2);
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
