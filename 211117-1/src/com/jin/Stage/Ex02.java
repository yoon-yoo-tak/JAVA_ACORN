package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex02 extends Application{
/*
 * �������� ũ�� ����
 * ������ ���� Pane�� Scene�� �ʿ���
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
//		pane�� Stage�� �����ϱ� ���� scene�� �߰�
		Scene scene = new Scene(root, 300, 200);
//		������ scene �߰�
		s.setScene(scene);
		s.setTitle("����");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
