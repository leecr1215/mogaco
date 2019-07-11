package Chapter15_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyPanel3 extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0,0,0);
	
	public MyPanel3() {
		setLayout(new BorderLayout()); //setLayout()�� �����̳��� ��ġ�����ڸ� �����ϴ� �޼ҵ�
		button = new JButton("���� ����");
		button.addActionListener(this); // ��ư�� �̺�Ʈ ó���⸦ ���δ�.
		add(button, BorderLayout.SOUTH);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 210, 220);
		
	}
	//��ư�� �������� e�� ȣ���
	public void actionPerformed(ActionEvent e) {
		// ������ ������ �����Ѵ�.
		color = new Color((int)(Math.random()*255.0),
				(int)(Math.random()*255.0), (int)(Math.random()*255.0));
		repaint(); //���� �����̳ʸ� �ٽ� �׸��� �ϴ� �޼ҵ�.
	}
}

public class ColorTest extends JFrame{
	public ColorTest() {
		setSize(240, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color Test");
		JPanel panel = new MyPanel3();
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		ColorTest s = new ColorTest();
	}

}
