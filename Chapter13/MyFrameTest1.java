package Chapter13;

import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {//�����ڴ� �����ӿ� ���Ͽ� �������� ���� ���׵��� ������
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();//����� ������ ������ �� �� Ư���� �۾��� ���� ���� �������� close��ư ������ ����
	}

}
