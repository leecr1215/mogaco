package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame{
	public MyFrame4() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		//Y축 방향으로 컴포넌트를 쌓는다.
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel, "Button1");
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		add(panel);
		pack();
		setVisible(true);
		
	}
	//BoxLayout의 중앙에 버튼들을 추가한다.
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class BoxTest {
	public static void main(String args[]) {
		MyFrame4 f = new MyFrame4();
	}

}
