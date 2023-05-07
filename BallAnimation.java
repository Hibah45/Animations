package Assignment5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
class BallAnimation extends JPanel implements ActionListener {
	JPanel SouthBar = new JPanel();
	private JButton startbtn = new JButton("Start");
	private JButton stopbtn = new JButton("Stop");
	AnimationPanel animationPanelPtr = new AnimationPanel();
	public BallAnimation() {
		setLayout(new BorderLayout());
		SouthBar.setLayout(new FlowLayout());
		SouthBar.setBackground(Color.CYAN);
		SouthBar.add(startbtn);
		startbtn.addActionListener(this);
		SouthBar.add(stopbtn);
		stopbtn.addActionListener(this);
		stopbtn.setEnabled(false);
		add(animationPanelPtr, BorderLayout.CENTER);
		this.add(SouthBar, BorderLayout.SOUTH);
	}
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("IN animation panel ** " +
		Thread.currentThread().getName());
		if (ae.getSource() == startbtn) {
				startbtn.setEnabled(false);
				stopbtn.setEnabled(true);
				animationPanelPtr.startBalls();
		}
		if (ae.getSource() == stopbtn) {
			stopbtn.setEnabled(false);
			startbtn.setEnabled(true);
			animationPanelPtr.stopBalls();
		}
	}

}
