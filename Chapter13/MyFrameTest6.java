package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
	public MyFrame6() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();//�����̳ʷ� �г��� ���
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		//���̺��� �����Ͽ� ���A�� �߰��Ѵ�.
		JLabel label = new JLabel(
				"�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label);
		
		JButton b1 = new JButton("�޺�����");
		JButton b2 = new JButton("������������");
		JButton b3 = new JButton("�Ұ������");
		
		// ������Ʈ�� �гο� �߰� 
		panelB.add(b1);//�г�B�� b1 �߰�
		panelB.add(b2);//�г�B�� b2 �߰�
		panelB.add(b3);//�г�B�� b3 �߰�
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);//�г��� �����ӿ� �߰�
		setVisible(true);
	}
}
public class MyFrameTest6 {
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}

}

