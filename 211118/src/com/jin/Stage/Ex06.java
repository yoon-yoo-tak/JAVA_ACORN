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
//		Text(x��ǥ, y��ǥ, ��µ�����)
		Text txt = new Text(10,40,"Hello World");
		Font font = new Font(40);
		txt.setFont(font);
//		Group�� pane�� ���� �� �ϳ�
		Group root = new Group(txt);
		Scene scene = new Scene(root, 300, 200);
		s.setScene(scene);
		s.setTitle("����");
		s.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
