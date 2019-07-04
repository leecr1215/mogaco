package Chapter13;

import javax.swing.*;

class MyFrame1 extends JFrame{
	public MyFrame1() {//생성자는 프레임에 대하여 여러가지 선택 사항들을 설정함
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();//현재는 프레임 생성만 할 뿐 특별한 작업은 하지 않음 프레임은 close버튼 눌러야 종료
	}

}
