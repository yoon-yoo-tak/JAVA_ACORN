package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Application을 상속 받아 윈도우 만들기
 */

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage s) throws Exception {
		s.setTitle("first window");
		s.show();
	}

}
