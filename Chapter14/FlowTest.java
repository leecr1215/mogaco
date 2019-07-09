package Chapter14;

import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		//패널을 생성하고 배치 관리자를 FlowLayout으로 설정
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//패널에 버튼을 생성하여 추가
		panel.add(new JButton("동훈"));
		panel.add(new JButton("채림"));
		panel.add(new JButton("송이"));
		panel.add(new JButton("야가지런하게정리해주는거래"));
		panel.add(new JButton("짱짱긴버튼이다"));
		add(panel);//패널을 프레임에 추가
		pack();//가지런하게 정렬
		setVisible(true);//프레임을 화면에 나타나게 함
		
	}
}

public class FlowTest {
	public static void main(String[] argv) {
		MyFrame1 f = new MyFrame1();
	}

}
