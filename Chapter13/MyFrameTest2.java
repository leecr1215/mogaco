package Chapter13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		// ���� ȭ���� ũ�⸦ ��´�
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		//
		setSize(300, 200);
		//�������� ��ġ�� ���� ȭ���� �߾����� �Ѵ�
		setLocation(screenSize.width / 2, screenSize.height / 2);
		//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		//�������� icon.gif�� ���� icon.gif�� ��Ŭ������ ������Ʈ ������ �巡���Ѵ�.
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest2 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}

}
