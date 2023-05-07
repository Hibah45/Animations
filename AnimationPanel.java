package Assignment5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


@SuppressWarnings("serial")
class AnimationPanel extends JPanel implements Runnable {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ArrayList<Ball> BArrayList = new ArrayList();
	private Dimension DimBPPtr = null;
	private Thread TObjPtr = null;
	
	public AnimationPanel() {
		Dimension dim = new Dimension(400, 350);
		this.setPreferredSize(dim);
		this.setBackground(Color.WHITE);
	}
	
	public void startBalls() {
		if(TObjPtr == null)
		{
			TObjPtr = new Thread(this);
			TObjPtr.start();
		}
	}
	
	public void stopBalls() {
		TObjPtr = null;
	}
	
	@Override
	public void run() {
		while(TObjPtr != null)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(DimBPPtr == null)
		{
			this.DimBPPtr = this.getSize();
			Ball ball1 = new Ball(Color.CYAN, 5, DimBPPtr.width - 90, DimBPPtr.height - 90, -4, -2);
			Ball ball2 = new Ball(Color.BLACK, 8, DimBPPtr.width - 240,DimBPPtr.height - 200, -1, -4);
			Ball ball3 = new Ball(Color.ORANGE, 10, DimBPPtr.width - 30,DimBPPtr.height - 30, -1, -2);
			Ball ball4 = new Ball(Color.MAGENTA, 3, DimBPPtr.width - 50,DimBPPtr.height - 50, 2, 5);
			Ball ball5 = new Ball(Color.YELLOW, 15, DimBPPtr.width - 100,DimBPPtr.height - 80, 1, -5);
			Ball ball6 = new Ball(Color.GREEN, 19, DimBPPtr.width - 130, DimBPPtr.height - 100, -4, 4);
			Ball ball7 = new Ball(Color.GRAY, 25, DimBPPtr.width - 300, DimBPPtr.height - 300, 1, 5);
			BArrayList.add(ball1);
			BArrayList.add(ball2);
			BArrayList.add(ball3);
			BArrayList.add(ball4);
			BArrayList.add(ball5);
			BArrayList.add(ball6);
			BArrayList.add(ball7);
			setBackground(Color.WHITE);
		}
		for(Ball b: BArrayList)
		{
			b.move(DimBPPtr);
			b.draw(g);
		}
	}
}
	