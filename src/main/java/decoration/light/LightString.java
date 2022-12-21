package decoration.light;

import collections.LightColor;
import collections.LightLength;
import core.Article;

public class LightString extends Article {
	private LightColor color;
	private LightLength length;
	private RGBLed[] leds;

	public LightString(double price, String description, LightLength length, LightColor color) {

		super(price, description);
	}

}
