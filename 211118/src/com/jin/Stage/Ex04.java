package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex04 extends Application{
/*
 * ȭ���� �ػ� ���ϱ�
 * 
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("����");
		s.show();
		
//		 1/1000 �ʷ� �ð��� ������Ŵ, 2000�̸� 2��
		Thread.sleep(2000);
		
//		â �����
		s.hide();
		
		Thread.sleep(2000);
		s.setX(10);
		s.setY(10);
		s.show();
//		â�� �ּ�ȭ ��Ŵ
//		s.setIconified(true); 
	}
	public static void main(String[] args) {
		launch(args);
	}
}
