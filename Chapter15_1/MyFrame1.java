package Chapter15_1;

import java.awt.*;
import javax.swing.*;
//JPanel�� ��ӹ޴� MyPanel1 ����
class MyPanel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // �ݵ�� �θ� Ŭ������ paintComponent()�� ȣ��
		g.drawString("�ȳ� Ŭ���� ��Ʈ�� ���󿡼� ���ϰ��� ��������Ĩ", 10, 10); // �ؽ�Ʈ �׸���
		g.drawLine(10, 20, 1100, 20); // ���� �׸���
		g.drawRect(10, 30, 100, 100); // �簢�� �׸���
		}
}

public class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel1 p = new MyPanel1(); //MyPanel1��ü ����
		setVisible(true);
		add(p); // MyPanel1��ü�� �����ӿ� �߰�
	}
	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();
	}
}
