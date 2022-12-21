package decoration;

import collections.ChristmasBallColor;
import core.Article;

public class ChristmasBall extends Article {
	private ChristmasBallColor color;
	private double diameter;

	public ChristmasBall(double price, String description) {
		super(price, description);
	}
}
