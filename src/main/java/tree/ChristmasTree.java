package tree;

import common.Validator;
import core.Article;
import decoration.ChristmasBall;
import decoration.light.LightString;

import java.util.HashSet;

public abstract class ChristmasTree extends Article {
	protected double height;
	protected LightString lightString;
	protected HashSet<ChristmasBall> christmasBalls;

	public ChristmasTree(double price, String description, double height) {
		super(price, description);
		this.setHeight(height);
		this.christmasBalls = new HashSet<>();
	}

	public HashSet<ChristmasBall> getChristmasBalls() {
		return this.christmasBalls;
	}

	public void addChristmasBall(ChristmasBall christmasBall) {
		this.christmasBalls.add(christmasBall);
	}

	public LightString getLightString() {
		return this.lightString;
	}

	public void setLightString(LightString lightString) {
		this.lightString = lightString;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if(Validator.isPositiveNumber(height)) {
			this.height = height;
		}
	}

	public void turnChristmasLightOn(){

	}

	public double getPriceWithDecorations(){
		return 0;
	}
}
