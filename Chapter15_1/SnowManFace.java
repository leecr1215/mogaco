package Chapter15_1;

import java.awt.*;
import javax.swing.*;

class MyPanel2 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW); //������� ��������� �����Ѵ�.
		g.fillOval(20, 30, 200, 200); //ä���� Ÿ���� �׸���.
		g.setColor(Color.BLACK); //������� ���������� �����Ѵ�.
		g.drawArc(60, 80, 50, 50, 180, -180); //���� ��
		g.drawArc(150, 80, 50, 50, 180, -180); //������ ��
		g.drawArc(70, 130, 100, 70, 180, 180); // ��
		
	}
}

public class SnowManFace extends JFrame{
	public SnowManFace() {
		setSize(280,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����� ��");
		setVisible(true);
		add(new MyPanel2());
	}
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
