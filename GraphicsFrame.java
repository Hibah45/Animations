package Assignment5;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

@SuppressWarnings("serial")
public class GraphicsFrame extends JFrame{
	 public static void main(String[] args) {
		 GraphicsFrame frame = new GraphicsFrame();
		 frame.setName("Frame");
		 frame.setSize(750, 600);
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 }
	 
public GraphicsFrame() {
	 super();
	 MainPanel mainPanelPtr = new MainPanel();
	 this.add(mainPanelPtr,BorderLayout.WEST);
	 BallAnimation ballAnimationPtr = new BallAnimation();
	 this.add(ballAnimationPtr,BorderLayout.EAST);
}
}

