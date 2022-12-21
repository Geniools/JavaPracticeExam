package common;

public abstract class Validator {
	public static boolean isPositiveNumber(double nr){
		return nr > 0;
	}

	public static boolean isNullOrEmpty(String text){
		return text != null && text.strip().length() > 0;
	}
}
