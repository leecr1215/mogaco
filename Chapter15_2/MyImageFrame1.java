package Chapter15_2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame1 extends JFrame implements ActionListener {

	BufferedImage img;

	private int pieces = 4;
	private int totalPieces = pieces * pieces;
	private int[] pieceNumber;

	public MyImageFrame1() {
		setTitle("Image Draw Test");
		// �̹����� �д´�.
		try {
			img = ImageIO.read(new File("C:\\Users\\82105\\Desktop\\space.jpeg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		pieceNumber = new int[totalPieces];
		for (int i = 0; i < totalPieces; i++) {
			pieceNumber[i] = i;
		}
		add(new MyPanel4(), BorderLayout.CENTER);
		JButton button = new JButton("DIVIDE");
		button.addActionListener(this);// ��ư�� �̺�Ʈ ó���⸦ ���δ�.
		add(button, BorderLayout.SOUTH);
		setSize(600, 600);
		setVisible(true);
	}

	// divide()������ �������� ��ȣ�� ������ �����.
	void divide() {
		Random rand = new Random();
		int ri;
		for (int i = 0; i < totalPieces; i++) {
			ri = rand.nextInt(totalPieces);
			int tmp = pieceNumber[i] = pieceNumber[ri];
			pieceNumber[ri] = tmp;
		}
	}

	class MyPanel4 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pieceWidth = img.getWidth(null) / pieces;
			int pieceHeight = img.getHeight(null) / pieces;
			for (int x = 0; x < pieces; x++) {
				int sx = x * pieceWidth;

				// MyPanel4 Ŭ������ paint()�޼ҵ忡�� �� ������ ��ġ�� ����Ͽ��� �� ��ġ�� �� ������ �׸���.
				for (int y = 0; y < pieces; y++) {
					int sy = y * pieceHeight;
					int number = pieceNumber[x * pieces + y];
					int dx = (number / pieces) * pieceHeight;
					int dy = (number % pieces) * pieceHeight;
					g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight, sx, sy, sx + pieceWidth,
							sy + pieceHeight, null);
				}
			}
		}
	}

	public static void main(String[] args) {
		new MyImageFrame1();
	}

	public void actionPerformed(ActionEvent e) {
		// ��ư�� Ŭ���� ������ �ٽ� ������ �� �������� �ٽ� �׸���.
		divide();
		repaint();
		//
	}
}
