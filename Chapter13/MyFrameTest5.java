package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame5 extends JFrame{
	public MyFrame5() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();//�����̳ʷ� �г��� ���
		JTextField t1 = new JTextField(10);//10ĭ ����
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);//�� ��° �ؽ�Ʈ �ʵ�� �Է±����� ����
		
		
		// ������Ʈ�� �гο� �߰� 
		panel.add(t1);//�гο� t1 �߰�
		panel.add(t2);//�гο� t2 �߰�
		
		
		add(panel);//�г��� �����ӿ� �߰�
		setVisible(true);
	}
}
public class MyFrameTest5 {
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}

}
