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
//		화면 해상도 구하기
		setScreenSize();
//		해상도와 frame을 이용하여 중앙 위치 구하기
		int centerX = (screenWidth-width)/2;
		int centerY = (screenWidth-height)/2;
//		처음부터 정중앙까지 n등분
		int gabX = centerX /i;
		int gabY = centerY /i;
//		화면 출력
		showFrame(i, gabX, gabY);

		
	}
	private void showFrame(int n,int gabX,int gabY) {
		int delay = 300;
		for(int i = 0 ; i<n;i++) {
//			 위치 지정
			s.setX(gabX*i);
			s.setX(gabY*i);
//			 숨기기
			s.hide();
//			 지연
			delay = delay-i*i;
			if(delay<0)
				delay = 1;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			 보이기
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
