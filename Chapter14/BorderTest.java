package Chapter14;

import java.awt.*;//��ġ������ ����
import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("BorederLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ����Ʈ�� BorderLayout�̹Ƿ� ����� ���ʿ�
		setLayout(new BorderLayout());
		
		//��ư �߰�(��ġ�� ����)
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.WEST);
		add(new JButton("Line End"), BorderLayout.EAST);
		add(new JButton("Page Start"), BorderLayout.NORTH);
		add(new JButton("Page End"), BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
}
public class BorderTest {
	public static void main(String argv[]) {
		MyFrame2 f = new MyFrame2();
	}

}
