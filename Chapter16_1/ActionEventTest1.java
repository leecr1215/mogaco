package Chapter16_1;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*; // 이벤트 처리를 위한 패키지 

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("당신은 버튼을 누르셨군요!");
	}
}
class MyFrame1 extends JFrame{
	private JButton button;
	public MyFrame1() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 눌러주세요!");
		button.addActionListener(new MyListener());//버튼에 이벤트 리스너 등록
		this.add(button);
		this.setVisible(true);
	}
}
public class ActionEventTest1 {
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}
}
