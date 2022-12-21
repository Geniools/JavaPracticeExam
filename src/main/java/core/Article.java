package core;

import common.Validator;

public abstract class Article {
	protected double price;
	protected String description;

	public Article(double price, String description){
		this.setPrice(price);
		this.setDescription(description);
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if(Validator.isPositiveNumber(price)){
			this.price = price;
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		if(Validator.isNullOrEmpty(description)) {
			this.description = description;
		}
	}
}
