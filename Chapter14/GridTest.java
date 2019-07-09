package Chapter14;

import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3(){
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3)); // 3개의 열과 필요한 만큼의 행
		
		add (new JButton("원승파이브"));
		add(new JButton("관평동 불주먹 정균"));
		add(new JButton("포도송이"));
		add(new JButton("동훈이는 냉장고"));
		add(new JButton("유겸이는 실몽이야"));
		
		pack();
		setVisible(true);
	}
}

public class GridTest {
	public static void main(String argv[]) {
		MyFrame3 f = new MyFrame3();
	}

}
