package PickUps;

public class PickUp {
	private int addScore;
	private boolean displayScore;
	private int value;
	private int xPickUp;
	private int yPickUp;
	
	
	
	public float getX() {
		return xPickUp;
	}

	public float getY() {
		return yPickUp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void setXpos(int xPickUp) {
		this.xPickUp = xPickUp;
	}
	public void setYpos(int yPickUp) {
		this.yPickUp = yPickUp;
	}
}
