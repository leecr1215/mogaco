package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	public MyFrame4() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();//�����̳ʷ� �г��� ���
		JButton b1 = new JButton("��ư");
		b1.setText("���� ��ư");
		JButton b2 = new JButton("�߾� ��ư");
		JButton b3 = new JButton("������ ��ư");
		b3.setEnabled(false);// �� ��° ��ư�� ��Ȱ������ ����
		// ������Ʈ�� �гο� �߰� 
		panel.add(b1);//�гο� b1 �߰�
		panel.add(b2);//�гο� b2 �߰�
		panel.add(b3);//�гο� b3 �߰�
		
		add(panel);//�г��� �����ӿ� �߰�
		setVisible(true);
	}
}
public class MyFrameTest4 {
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}

}
