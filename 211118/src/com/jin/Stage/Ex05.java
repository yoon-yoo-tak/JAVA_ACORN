package com.jin.Stage;

import javafx.application.Application;
import java.awt.Dimension;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.awt.Toolkit;
public class Ex05 extends Application{
/*
 * ȭ���� �ػ� ���ϱ�
 * (x-rx)/2
 */
	
	
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("����");
		s.show();
		
		Thread.sleep(2000);
//		1. �ػ� ���ϱ�
		Toolkit tk = Toolkit.getDefaultToolkit();
//		Dimension�� x, y ��ǥ ����
		Dimension screenSize = tk.getScreenSize();
		
		System.out.println("width : " + screenSize.width);
		System.out.println("height : " + screenSize.height);
		
//		â ũ�� ����
		int RectX = 300;
		int RectY = 200;
//		�� �߾ӿ� ��ġ��Ű��
		s.setX((screenSize.width-RectX)/2);
		s.setY((screenSize.height-RectY)/2);
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
