package Chapter15_2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyComponent extends JComponent{
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		// ��Ƽ ���ϸ������ �����Ѵ�.
		g2.setStroke(new BasicStroke(3));
		GradientPaint gp = new GradientPaint(0, 10, Color.WHITE, 0, 70, Color.RED);
		
		//�簢��
		g2.setPaint(Color.RED);
		g2.fill(new Rectangle2D.Float(10, 10, 70, 80));
		
		//�ձ� �簢��
		g2.setPaint(gp);//GradientPaint ��ü�� ä��� ������ ����
		g2.fill(new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20));
		
		//��
		g2.setPaint(Color.RED);
		g2.fill(new Ellipse2D.Float(210, 10, 80, 80));
		
		g2.setPaint(gp);
		g2.fill(new Arc2D.Float(310, 10, 80, 80, 90, 90, Arc2D.OPEN));
	
		g2.setPaint(Color.RED);
		g2.fill(new Arc2D.Float(410, 10, 80, 80, 0, 180, Arc2D.CHORD));
		
		g2.setPaint(gp);
		g2.fill(new Arc2D.Float(510, 10, 80, 80, 45, 90, Arc2D.PIE));

	}
}

public class FillShapes extends JFrame{
	public FillShapes() {
		setSize(600, 130);
		setTitle("Java 2D Fill Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent c = new MyComponent();
		add(c);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FillShapes();
	}

}
