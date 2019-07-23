package Chapter16_1;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

class MyFrame3 extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	MyListener listener = new MyListener();//������ ��ü�� �̸� �������� ���´�.
	
	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(listener);//�� ���� ��ư�� ������ �̺�Ʈ ������ ��ü�� ����Ѵ�.
		panel.add(button1);
		button2 = new JButton("��ũ��");//�� ���� ��ư�� ������ �̺�Ʈ ������ ��ü�� ����Ѵ�.
		button2.addActionListener(listener);
		panel.add(button2);
		this.add(panel);
		this.setVisible(true);		
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {//getSource()�� �̿��Ͽ��� �̺�Ʈ �ҽ��� ã�´�.
				panel.setBackground(Color.YELLOW);
			}else if (e.getSource() == button2) {//getSource()�� �̿��Ͽ��� �̺�Ʈ �ҽ��� ã�´�.
				panel.setBackground(Color.PINK);
			}
		}
	}
}
public class ActionEventTest3 {
	public static void main(String[] args) {
		MyFrame3 t = new MyFrame3();
	}
}
