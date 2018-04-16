package com.example.learn_project.entity;

import java.util.ArrayList;
import java.util.List;

public class LotPersonName {

	private List<String> allNameList;

	public LotPersonName() {
		allNameList = new ArrayList <>();
	}

	public List<String> getAllNameList() {
		return allNameList;
	}

	public void setAllNameList(String name) {
		this.allNameList.add(name);
	}
}
 