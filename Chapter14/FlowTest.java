package Chapter14;

import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		//�г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//�гο� ��ư�� �����Ͽ� �߰�
		panel.add(new JButton("����"));
		panel.add(new JButton("ä��"));
		panel.add(new JButton("����"));
		panel.add(new JButton("�߰������ϰ��������ִ°ŷ�"));
		panel.add(new JButton("¯¯���ư�̴�"));
		add(panel);//�г��� �����ӿ� �߰�
		pack();//�������ϰ� ����
		setVisible(true);//�������� ȭ�鿡 ��Ÿ���� ��
		
	}
}

public class FlowTest {
	public static void main(String[] argv) {
		MyFrame1 f = new MyFrame1();
	}

}
