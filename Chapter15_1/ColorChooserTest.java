package Chapter15_1;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooserTest extends JFrame implements ChangeListener{
	
	protected JColorChooser color;
	public ColorChooserTest() {
		setTitle("색상 선택기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser(); // 생성자 호출
		color.getSelectionModel().addChangeListener(this); // 리스너 등록
		color.setBorder(BorderFactory.createTitledBorder("색상 선택"));
		
		JPanel panel = new JPanel();
		panel.add(color); // 패널에 색상 선택기 객체를 추가한다.
		add(panel);
		
		pack();//프레임의 크기를 입축한다.
		this.setVisible(true);
	}
	//사용자가 색상을 선택하면 호출된다.
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
	}//
	public static void main(String[] args) {
		new ColorChooserTest();
	}
}
