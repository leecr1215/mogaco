package Chapter14;

import java.awt.*;//배치관리자 가짐
import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("BorederLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임은 디폴트로 BorderLayout이므로 사실은 불필요
		setLayout(new BorderLayout());
		
		//버튼 추가(위치도 지정)
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
