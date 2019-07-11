package Chapter15_1;

import java.awt.*;
import javax.swing.*;

class MyPanel2 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW); //전경색을 노란색으로 변경한다.
		g.fillOval(20, 30, 200, 200); //채워진 타원을 그린다.
		g.setColor(Color.BLACK); //전경색을 검정색으로 변경한다.
		g.drawArc(60, 80, 50, 50, 180, -180); //왼쪽 눈
		g.drawArc(150, 80, 50, 50, 180, -180); //오른쪽 눈
		g.drawArc(70, 130, 100, 70, 180, 180); // 입
		
	}
}

public class SnowManFace extends JFrame{
	public SnowManFace() {
		setSize(280,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("눈사람 얼굴");
		setVisible(true);
		add(new MyPanel2());
	}
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
