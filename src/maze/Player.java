package maze;

import java.awt.*;

import javax.swing.ImageIcon;

public class Player {
	private int tileDim;
	private int tileX, tileY;

	private Image player;
	private Image player_walk;
	private Image player_walk2;
	private Image player_win;
	
	public Player(int tileDim) {
		this.tileDim = tileDim;
		
		// stand
		ImageIcon img = new ImageIcon("resources/hero_stand.png");
		img = resizeImage(img);
		player = img.getImage();
		
		// walk
		img = new ImageIcon("resources/hero_walk.png");
		img = resizeImage(img);
		player_walk = img.getImage();
		
		// walk
		img = new ImageIcon("resources/hero_walk_2.png");
		img = resizeImage(img);
		player_walk2 = img.getImage();
		
		// win
		img = new ImageIcon("resources/hero_happy.png");
		img = resizeImage(img);
		player_win = img.getImage();
		
		// // start position
		// top left (1 in)
		tileX = 1;
		tileY = 1;
	}
	
	private ImageIcon resizeImage(ImageIcon img) {
		Image image = img.getImage(); // transform it 
		Image newimg = image.getScaledInstance(tileDim, tileDim,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		img = new ImageIcon(newimg);  // transform it back
		return img;
	}
	
	public Image getPlayer(){
		return player;
	}
	
	public Image getPlayerWalk(){
		return player_walk;
	}
	
	public Image getPlayerWalk2(){
		return player_walk2;
	}
	
	public Image getPlayerWin(){
		return player_win;
	}
	
	public void move(int dx, int dy){
		// x negative go left, positive go right
		// bigger number means you move faster
		// it will move tile by tile
		
		tileX += dx;
		tileY += dy;
	}
	
	// getters
	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}
	
	// setters
	public void setTileX(int tileX) {
		this.tileX = tileX;
	}

	public void setTileY(int tileY) {
		this.tileY = tileY;
	}
}