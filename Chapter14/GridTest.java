package Chapter14;

import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3(){
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3)); // 3���� ���� �ʿ��� ��ŭ�� ��
		
		add (new JButton("�������̺�"));
		add(new JButton("���� ���ָ� ����"));
		add(new JButton("��������"));
		add(new JButton("�����̴� �����"));
		add(new JButton("�����̴� �Ǹ��̾�"));
		
		pack();
		setVisible(true);
	}
}

public class GridTest {
	public static void main(String argv[]) {
		MyFrame3 f = new MyFrame3();
	}

}
