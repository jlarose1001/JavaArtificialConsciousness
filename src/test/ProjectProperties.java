package com;

public class ProjectProperties {
	
	public final String name;
	public final int index;
	
	public ProjectProperties(String name) {
		this.name = name;
		Main.projectIndex++;
		this.index = Main.projectIndex;
	}

}
