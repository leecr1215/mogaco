package Chapter16_1;

import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame{
	private JButton button; // 멤버 변수
	private JLabel label; // 멤버 변수
	
	public MyFrame2() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러주세요!");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());//버튼에 이벤트 리스너 등록
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame2 t = new MyFrame2();
	}
}
