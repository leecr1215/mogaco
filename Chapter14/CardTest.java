package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame5 extends JFrame implements ActionListener{
	JPanel panel;
	Cards cards;
	
	public MyFrame5() {
		setTitle("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));//GridLayout�� �г��� ����� ���⿡ �����ư�� �ִ´�
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("����", panel);
		add(panel, "North");
		//Cards ��ü�� �����Ͽ� �߾ӿ� ��ġ�Ѵ�.Cards�� �г��� �����̴�
		cards = new Cards();
		add(cards, "Center");
		//
		setVisible(true);
	}
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	private class Cards extends JPanel{
		CardLayout layout;
		public Cards() {
			//ī�� ���̾ƿ� ����
			layout = new CardLayout();
			setLayout(layout);
			for(int i = 1; i <=10; i++) {
				add(new JButton("���� ī���� ��ȣ��" + i + "�Դϴ�"), "Center");
			}
		}
	}
	//�̺�Ʈ�� ó���ϴ� �κ�
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("����")) {
			System.exit(0);
		}else if (e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);//CardLayout �߿��� ù ���� ī�带 �����Ѵ�.
		}else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		}else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		}else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
}

public class CardTest {
	public static void main(String args[]) {
		MyFrame5 f = new MyFrame5();
	}
}
