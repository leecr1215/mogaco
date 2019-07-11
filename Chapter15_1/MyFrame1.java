package Chapter15_1;

import java.awt.*;
import javax.swing.*;
//JPanel을 상속받는 MyPanel1 정의
class MyPanel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // 반드시 부모 클래스의 paintComponent()를 호출
		g.drawString("안녕 클레오 파트라 세상에서 제일가는 포테이토칩", 10, 10); // 텍스트 그리기
		g.drawLine(10, 20, 1100, 20); // 직선 그리기
		g.drawRect(10, 30, 100, 100); // 사각형 그리기
		}
}

public class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel1 p = new MyPanel1(); //MyPanel1객체 생성
		setVisible(true);
		add(p); // MyPanel1객체를 프레임에 추가
	}
	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();
	}
}
