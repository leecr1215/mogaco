package Chapter13;

import java.awt.*;
import javax.swing.*;

class MyFrame5 extends JFrame{
	public MyFrame5() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();//컨테이너로 패널을 사용
		JTextField t1 = new JTextField(10);//10칸 지정
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);//두 번째 텍스트 필드는 입력금지로 설정
		
		
		// 컴포넌트를 패널에 추가 
		panel.add(t1);//패널에 t1 추가
		panel.add(t2);//패널에 t2 추가
		
		
		add(panel);//패널을 프레임에 추가
		setVisible(true);
	}
}
public class MyFrameTest5 {
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}

}
