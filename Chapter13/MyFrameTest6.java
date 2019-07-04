package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame{
	public MyFrame6() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();//컨테이너로 패널을 사용
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		//레이블을 생성하여 페널A에 추가한다.
		JLabel label = new JLabel(
				"자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label);
		
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		
		// 컴포넌트를 패널에 추가 
		panelB.add(b1);//패널B에 b1 추가
		panelB.add(b2);//패널B에 b2 추가
		panelB.add(b3);//패널B에 b3 추가
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);//패널을 프레임에 추가
		setVisible(true);
	}
}
public class MyFrameTest6 {
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}

}

