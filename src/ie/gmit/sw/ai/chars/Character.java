package ie.gmit.sw.ai.chars;

import ie.gmit.sw.ai.Maze;
import ie.gmit.sw.ai.img.ImgCtrl;

public class Character {
	protected int tileDim;
	protected int mazeDim;
	private int tileX;
	private int tileY;
	protected Maze map;
	protected ImgCtrl imgCtrl;

	public Character(Maze map, ImgCtrl imgCtrl) {
		super();
		this.map = map;
		this.imgCtrl = imgCtrl;
	}

//	protected Image createImage(String tileName) {
//		ImageIcon img = new ImageIcon("resources/img/" + tileName); // get imageicon
//		Image image = img.getImage(); // transform it into an image
//		Image scaledImg = image.getScaledInstance(tileDim, tileDim,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
//		return scaledImg;
//	}

	public void move(int dx, int dy) {
		// x negative go left, positive go right
		// bigger number means you move faster
		// it will move tile by tile
		
		tileX += dx;
		tileY += dy;
	}

	public void setPos(int x, int y) {
		setTileX(x);
		setTileY(y);
	}

	public String getPos() {
		StringBuilder pos = new StringBuilder();
		pos.append(getTileX());
		pos.append(",");
		pos.append(getTileY());
		return pos.toString();
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public void setTileX(int tileX) {
		this.tileX = tileX;
	}

	public void setTileY(int tileY) {
		this.tileY = tileY;
	}

}