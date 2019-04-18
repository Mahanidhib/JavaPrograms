package com.bridgelabz.clinicmangement.model;

public class Doctors {
	private int id;
	private String name;
	private String specialist;
	private String avalability;

	public String getAvalability() {
		return avalability;
	}

	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

}
