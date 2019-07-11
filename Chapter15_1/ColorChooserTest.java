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
		setTitle("���� ���ñ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser(); // ������ ȣ��
		color.getSelectionModel().addChangeListener(this); // ������ ���
		color.setBorder(BorderFactory.createTitledBorder("���� ����"));
		
		JPanel panel = new JPanel();
		panel.add(color); // �гο� ���� ���ñ� ��ü�� �߰��Ѵ�.
		add(panel);
		
		pack();//�������� ũ�⸦ �����Ѵ�.
		this.setVisible(true);
	}
	//����ڰ� ������ �����ϸ� ȣ��ȴ�.
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
	}//
	public static void main(String[] args) {
		new ColorChooserTest();
	}
}
