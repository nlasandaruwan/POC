package org.test.jsf.mBean;

import org.test.jsf.domain.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
// Also application scoped, discussed later
public class SelectManyColorOptions {
	private String[] colorNamesArr = { "red", "orange", "yellow", "green", "blue","purple" };
	private List<String> colorNamesList = Arrays.asList("red", "orange", "yellow", "green", "blue","purple");
	private Map<String, String> colorNameMap = new LinkedHashMap<>();
	private List<Color> colorList = new ArrayList<>();
	
	public String[] getColorNamesArr() {
		return colorNamesArr;
	}

	public void setColorNamesArr(String[] colorNamesArr) {	
		this.colorNamesArr = colorNamesArr;
	}

	public List<String> getColorNamesList() {
		return colorNamesList;
	}

	public void setColorNamesList(List<String> colorNamesList) {
		this.colorNamesList = colorNamesList;
	}

	public Map<String, String> getColorNameMap() {
		return colorNameMap;
	}

	public void setColorNameMap(Map<String, String> colorNameMap) {
		this.colorNameMap = colorNameMap;
	}

	public List<Color> getColorList() {
		return colorList;
	}

	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}

	public SelectManyColorOptions() {
		for (int i = 0; i < colorNamesArr.length; i++) {
			String colorName = colorNamesArr[i];
			String colorValue = colorNamesList.get(i);
			colorNameMap.put(colorName, colorValue);
			colorList.add(new Color(colorName, colorValue));
		}
	}
	
	private String[] color1 = new String[colorNamesArr.length];
	private List<String> color2 = new ArrayList<>();
	private String color3;
	private List<Color> color4 = new ArrayList<>();

	public String[] getColor1() {
		return color1;
	}

	public void setColor1(String[] color1) {
		this.color1 = color1;
	}

	public List<String> getColor2() {
		return color2;
	}

	public void setColor2(List<String> color2) {
		this.color2 = color2;
	}

	public String getColor3() {
		return color3;
	}

	public void setColor3(String color3) {
		this.color3 = color3;
	}

	public List<Color> getColor4() {
		return color4;
	}

	public void setColor4(List<Color> color4) {
		this.color4 = color4;
	}	
	
	private String stringColor1;
	private String stringColor2;
	private String stringColor3;
	private String stringColor4;
	
	public String getStringColor1() {
		return Arrays.toString(color1);
	}

	public void setStringColor1(String stringColor1) {
		this.stringColor1 = Arrays.toString(color1);
	}

	public String getStringColor2() {
		StringBuffer toreturn = new StringBuffer();
		for (String current : color2) {
			toreturn.append(current);
		}
		return toreturn.toString();
	}

	public void setStringColor2(String stringColor2) {
		
		StringBuffer toreturn = new StringBuffer();
		for (String current : color2) {
			toreturn.append(current);
		}
		
		this.stringColor2 = toreturn.toString();
	}

	public String getStringColor3() {
		return color3;
	}

	public void setStringColor3(String stringColor3) {
		this.stringColor3 = color3;
	}

	public String getStringColor4() {
		return stringColor4;
	}

	public void setStringColor4(String stringColor4) {
		this.stringColor4 = stringColor4;
	}

	public String showColors() {
		return ("/WEB-INF/view/choices/select-many-color-result");
	}
}
