package Chapter13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		// 현재 화면의 크기를 얻는다
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		//
		setSize(300, 200);
		//프레임의 위치를 현재 화면의 중앙으로 한다
		setLocation(screenSize.width / 2, screenSize.height / 2);
		//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		//아이콘을 icon.gif로 변경 icon.gif는 이클립스의 프로젝트 폴더로 드래그한다.
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
}
public class MyFrameTest2 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}

}
