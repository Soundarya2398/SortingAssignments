package com.ty.practicesesion;

import java.util.Objects;

public class Students {
	int id;
	int age;
	String name;
	double marks;

	Students(int age, String name,int id,double marks) {
		this.age = age;
		this.name = name;
		this.id=id;
		this.marks=marks;
		
	}

	public String toString() {
		return this.age + " " + this.name+" "+this.id+" "+this.marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return age == other.age && id == other.id
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	  
}
