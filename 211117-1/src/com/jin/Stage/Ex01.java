package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Application�� ��� �޾� ������ �����
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
