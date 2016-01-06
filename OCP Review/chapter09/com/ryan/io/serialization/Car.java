package com.ryan.io.serialization;

import java.io.Serializable;

enum CarTransmission {
	AUTOMATIC, SEMI_AUTOMATIC, MANUAL;
}
public class Car implements Serializable {
	private String name;
	private transient String plate_no;
	private int max_seats;
	private CarTransmission transmission;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlate_no() {
		return plate_no;
	}
	public void setPlate_no(String plate_no) {
		this.plate_no = plate_no;
	}
	public int getMax_seats() {
		return max_seats;
	}
	public void setMax_seats(int max_seats) {
		this.max_seats = max_seats;
	}
	public CarTransmission getTransmission() {
		return transmission;
	}
	public void setTransmission(CarTransmission transmission) {
		this.transmission = transmission;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", plate_no=" + plate_no + ", max_seats=" + max_seats + ", transmission="
				+ transmission + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plate_no == null) ? 0 : plate_no.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (plate_no == null) {
			if (other.plate_no != null)
				return false;
		} else if (!plate_no.equals(other.plate_no))
			return false;
		return true;
	}
}
