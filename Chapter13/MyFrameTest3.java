package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();//컨테이너로 패널을 사용
		JLabel label = new JLabel("안녕하세요?^^*");
		JButton button = new JButton("버튼");
		panel.add(label);//패널에 레이블 추가
		panel.add(button);//패널에 버튼 추가
		add(panel);//패널을 프레임에 추가
		setVisible(true);
	}
}
public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}

}
