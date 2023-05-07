
package Assignment5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class TileGridPanel extends JPanel implements MouseListener{
	int selectedTile = -1;
	static final int squareSide = 25; 
	int GridRow=5,GridCol=5; 
	Image[][] gif2dArray = new Image[GridRow][GridCol]; 
	
	public TileGridPanel(){ 
		this.addMouseListener(this); 
		this.setBackground( Color.yellow );
		this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	public void mouseClicked(MouseEvent event) { 
		if (selectedTile==-1) 
			return;
		for (int i=0;i<GridRow;i++) {
			for (int j=0;j<GridCol;j++) {
				gif2dArray[i][j]=(Image)MainPanel.imageA[selectedTile];
			}
		}
		this.repaint(); 
	}
	public void ResetGridTile() {
		for(int i=0; i<GridRow;i++) {
			for (int j=0;j<GridCol;j++){
				gif2dArray[i][j]=null;
			}
		}
		this.repaint();
	}
	public void paintComponent(Graphics g){ 
		super.paintComponent(g);
		int gridWidth = GridCol*squareSide; 
		int gridHeight = GridRow*squareSide;
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		int startX = (panelWidth-gridWidth)/2;
		int startY=(panelHeight-gridHeight)/2;
		for (int i=0;i<GridRow;i++){
			for (int j=0;j<GridCol;j++){
				g.drawImage(gif2dArray[i][i], startX+(squareSide*i), startY+(squareSide*j), this);
			}

		}
	}

	
@Override
	public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub
	}
@Override
	public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub
	}
@Override
	public void mouseEntered(MouseEvent e) {
// TODO Auto-generated method stub
	}
@Override
	public void mouseExited(MouseEvent e) {
// TODO Auto-generated method stub
	}
}

