package Chapter13;

import javax.swing.*;//스윙 클래스들은 javax.swing 패키지 안에 들어있다.

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");//JFrame 객체 생성(JFrame 클래스 생성자의 매개변수는 프레임의 제목)
		f.setSize(300, 200);//프레임의 크기는 가로 300 세로 200(크기 변경 안 하면 0x0)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close 눌렀을 때 일어날 동작. 기본 동작은 프레임만 닫히고 프로그램 진행(나는 프레임&프로그램 종료)
		f.setVisible(true);//프레임을 화면에 나타나게 만든다.(안 나타나게 하는 이유는 다른 컴포넌트를 추가하기 위해서이다)
	}

}
