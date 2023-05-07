package Assignment5;
import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MainPanel extends JPanel implements ActionListener{
	String[] imageStringNameA ={"src/pat1.gif","src/pat2.gif","src/pat3.gif","src/pat4.gif","src/pat5.gif", "src/pat6.gif","src/pat7.gif","src/pat8.gif"}; 
	final static Image[] imageA = new Image[8];
	JToolBar MainPanelToolBar = new JToolBar(); 
	TileGridPanel tileGridPanelPtr=new TileGridPanel(); 
	JPanel bottomPanel= new JPanel();
	JButton patch1btn; 
	JButton patch2btn; 
	JButton patch3btn; 
	JButton patch4btn;
	JButton patch5btn;
	JButton patch6btn;
	JButton patch7btn;
	JButton patch8btn;

	JButton resetbtn;
	public MainPanel(){
		this.setLayout(new BorderLayout()); 
		this.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		this.add(MainPanelToolBar,BorderLayout.NORTH);
		this.add(tileGridPanelPtr, BorderLayout.CENTER); 
		this.add(bottomPanel,BorderLayout.SOUTH);
		

		MainPanelToolBar.setBackground(Color.ORANGE);

		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.setBackground(Color.PINK);
		
		
		for(int i=0; i<imageStringNameA.length;i++){
			imageA[i] = (Image) Toolkit.getDefaultToolkit().getImage(imageStringNameA[i]);
		}
	
		patch1btn = new JButton(new ImageIcon(imageA[0])); //this how you get a button with an image
		patch2btn = new JButton(new ImageIcon(imageA[1]));
		patch3btn = new JButton(new ImageIcon(imageA[2]));
		patch4btn = new JButton(new ImageIcon(imageA[3]));
		patch5btn = new JButton(new ImageIcon(imageA[4]));
		patch6btn = new JButton(new ImageIcon(imageA[5]));
		patch7btn = new JButton(new ImageIcon(imageA[6]));
		patch8btn = new JButton(new ImageIcon(imageA[7]));
		resetbtn = new JButton("Reset");
	
		MainPanelToolBar.add(patch1btn);
		MainPanelToolBar.add(patch2btn);
		MainPanelToolBar.add(patch3btn);
		MainPanelToolBar.add(patch4btn);
		MainPanelToolBar.add(patch5btn);
		MainPanelToolBar.add(patch6btn);
		MainPanelToolBar.add(patch7btn);
		MainPanelToolBar.add(patch8btn);
		
		bottomPanel.add(resetbtn);
		
		patch1btn.addActionListener(this);
		patch2btn.addActionListener(this);
		patch3btn.addActionListener(this);
		patch4btn.addActionListener(this);
		patch5btn.addActionListener(this);
		patch6btn.addActionListener(this);
		patch7btn.addActionListener(this);
		patch8btn.addActionListener(this);

		resetbtn.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == patch1btn) 
			tileGridPanelPtr.selectedTile = 0; 
		else if (e.getSource() == patch2btn)
			tileGridPanelPtr.selectedTile = 1;
		else if (e.getSource() == patch3btn)
			tileGridPanelPtr.selectedTile = 2;
		else if (e.getSource() == patch4btn)
			tileGridPanelPtr.selectedTile = 3;
		else if (e.getSource() == patch5btn)
			tileGridPanelPtr.selectedTile = 4;
		else if (e.getSource() == patch6btn)
			tileGridPanelPtr.selectedTile = 5;
		else if (e.getSource() == patch7btn)
			tileGridPanelPtr.selectedTile = 6;
		else if (e.getSource() == patch8btn)
			tileGridPanelPtr.selectedTile = 7;
		else if (e.getSource() == resetbtn){
			tileGridPanelPtr.selectedTile = -1;
			tileGridPanelPtr.ResetGridTile();
		}
	}
}

