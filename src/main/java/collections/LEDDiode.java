package collections;

public enum LEDDiode {
	RED,
	GREEN,
	BLUE;

	private boolean isTurnedOn;
	private LEDDiode(){
		this.turnOff();
	}

	public void turnOn(){
		this.isTurnedOn = true;
	}

	public void turnOff(){
		this.isTurnedOn = false;
	}
}
