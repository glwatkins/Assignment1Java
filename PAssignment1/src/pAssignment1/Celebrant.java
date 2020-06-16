package pAssignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Celebrant {
//week 12 comparator, collections.sort
private ArrayList<Celebrant> celebrantData;
private String fname;
private String lname;
private boolean marragecelebrant;
private boolean civilnionceleebrant;
private boolean canzmember;
private String resadentualcity;
private int age;
private int salary;

public Celebrant(String fname, String lname, boolean marragecelebrant, boolean civilnionceleebrant, boolean canzmember,
		String resadentualcity, int age, int salary) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.marragecelebrant = marragecelebrant;
	this.civilnionceleebrant = civilnionceleebrant;
	this.canzmember = canzmember;
	this.resadentualcity = resadentualcity;
	this.age = age;
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isCivilnionceleebrant() {
	return civilnionceleebrant;
}

public void setCivilnionceleebrant(boolean civilnionceleebrant) {
	this.civilnionceleebrant = civilnionceleebrant;
}

public boolean isCanzmember() {
	return canzmember;
}

public void setCanzmember(boolean canzmember) {
	this.canzmember = canzmember;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public boolean isMarragecelebrant() {
	return marragecelebrant;
}

public void setMarragecelebrant(boolean marragecelebrant) {
	this.marragecelebrant = marragecelebrant;
}

public String getResadentualcity() {
	return resadentualcity;
}

public void setResadentualcity(String resadentualcity) {
	this.resadentualcity = resadentualcity;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Celebrant [fname=" + fname + ", lname=" + lname + ", marragecelebrant=" + marragecelebrant
			+ ", civilnionceleebrant=" + civilnionceleebrant + ", canzmember=" + canzmember + ", resadentualcity="
			+ resadentualcity + ", age=" + age + ", salary=" + salary + "]";
}

}

