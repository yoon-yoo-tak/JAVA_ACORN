package com.jin.Stage.Quiz04;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.stage.Stage;

public class Quiz04 {
	private Stage s;
	private int width;
	private int height;
	private int screenWidth;
	private int screenHeight;
	public Quiz04(Stage s,int width, int height) {
		this.s = s;
		this.height = height;
		this.width = width;
	}
	public void showFrame(int i) {
//		ȭ�� �ػ� ���ϱ�
		setScreenSize();
//		�ػ󵵿� frame�� �̿��Ͽ� �߾� ��ġ ���ϱ�
		int centerX = (screenWidth-width)/2;
		int centerY = (screenWidth-height)/2;
//		ó������ ���߾ӱ��� n���
		int gabX = centerX /i;
		int gabY = centerY /i;
//		ȭ�� ���
		showFrame(i, gabX, gabY);

		
	}
	private void showFrame(int n,int gabX,int gabY) {
		int delay = 300;
		for(int i = 0 ; i<n;i++) {
//			 ��ġ ����
			s.setX(gabX*i);
			s.setX(gabY*i);
//			 �����
			s.hide();
//			 ����
			delay = delay-i*i;
			if(delay<0)
				delay = 1;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			 ���̱�
			s.show();
		}
	}
	private void setScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.screenWidth = screenSize.width;
		this.screenHeight = screenSize.height;
	}
}
