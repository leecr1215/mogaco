package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
	JButton b1;
	private JButton b2, b3;
	
	public MyFrame6() {
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		//�г��� ��ġ �����ڸ� �����Ѵ�.
		JPanel p = new JPanel();
		p.setLayout(null);
		//
		b1 = new JButton("Button #1");
		p.add(b1);
		b2 = new JButton("Button #2");
		p.add(b2);
		b3 = new JButton("Button #3");
		p.add(b3);
		
		//��ư���� ���� ��ġ�� ũ�⸦ �����Ѵ�.
		b1.setBounds(20, 5, 95,30);
		b2.setBounds(55, 45, 105, 70);
		b3.setBounds(180, 15, 105, 90);
		//
		add(p);
		setVisible(true);
	}
}

public class AbsoluteTest {
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}

}
