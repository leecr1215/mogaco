package Chapter13;

import javax.swing.*;//���� Ŭ�������� javax.swing ��Ű�� �ȿ� ����ִ�.

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");//JFrame ��ü ����(JFrame Ŭ���� �������� �Ű������� �������� ����)
		f.setSize(300, 200);//�������� ũ��� ���� 300 ���� 200(ũ�� ���� �� �ϸ� 0x0)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close ������ �� �Ͼ ����. �⺻ ������ �����Ӹ� ������ ���α׷� ����(���� ������&���α׷� ����)
		f.setVisible(true);//�������� ȭ�鿡 ��Ÿ���� �����.(�� ��Ÿ���� �ϴ� ������ �ٸ� ������Ʈ�� �߰��ϱ� ���ؼ��̴�)
	}

}
