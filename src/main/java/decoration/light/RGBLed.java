package decoration.light;

import collections.LEDDiode;

public class RGBLed {
	private LEDDiode redDiode;
	private LEDDiode greenDiode;
	private LEDDiode blueDiode;

	public RGBLed(){
		this.redDiode = LEDDiode.RED;
		this.greenDiode = LEDDiode.GREEN;
		this.blueDiode = LEDDiode.BLUE;
	}
}
