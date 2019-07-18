package Chapter15_2;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.*;

public class MoreShapes extends JFrame{
	public MoreShapes() {
		setSize(600, 130);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new MyPanel2();
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MoreShapes();
	}
}
class MyPanel2 extends JPanel{
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	public MyPanel2() {
		Shape s;
		
		s = new Rectangle2D.Float(10, 10, 70, 80);
		shapeArray.add(s);
		
		s = new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20);
		shapeArray.add(s);
		
		s = new Ellipse2D.Float(210, 10, 80, 80);
		shapeArray.add(s);
		
		s = new Arc2D.Float(310, 10, 80, 80, 90, 90, Arc2D.OPEN);
		shapeArray.add(s);
		
		s = new Arc2D.Float(410, 10, 80, 80, 0, 180, Arc2D.CHORD);
		shapeArray.add(s);
		
		s = new Arc2D.Float(510, 10, 80, 80, 45, 90, Arc2D.PIE);
		shapeArray.add(s);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		// 앤티에일리어싱은 도형을 매끄럽게 그리기 위하여 설정. 연산시간 증가
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));//setStroke()메소드를 이용하여 도형을 그리는 두께 설정
		for (Shape s : shapeArray)
			g2.draw(s);
	}
}
