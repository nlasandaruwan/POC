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
public class SelectOneColorOptions {
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

	public SelectOneColorOptions() {
		for (int i = 0; i < colorNamesArr.length; i++) {
			String colorName = colorNamesArr[i];
			String colorValue = colorNamesList.get(i);
			colorNameMap.put(colorName, colorValue);
			colorList.add(new Color(colorName, colorValue));
		}
	}
}
