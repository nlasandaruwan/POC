package org.test.jsf.domain;

public class Color {
	private final String colorName, colorValue;

	public Color(String colorName, String colorValue) {
		this.colorName = colorName;
		this.colorValue = colorValue;
	}

	public String getColorName() {
		return (colorName);
	}

	public String getColorValue() {
		return (colorValue);
	}
}
