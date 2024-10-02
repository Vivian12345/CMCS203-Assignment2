/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: PatientDriverApp
 * Due: 10/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Student Name here: Ya-Wen Cheng
*/
import java.io.*;
import java.util.*;

public class Procedure {

	private String name;
	private String date;
	private String practitionerName;
	private String charge;

	public Procedure() {
		
	}

	public Procedure(String name, String date) {
		this.name = name;
		this.date = date;
	}

	public Procedure(String name, String date, String pratitionerName, String charge) {
		this.name = name;
		this.date = date;
		this.practitionerName = practitionerName;
		this.charge = charge;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getPractitioner() {
		return practitionerName;
	}

	public String getCharge() {
		return charge;
	}

	public void setName(String str) {
		name = str;
	}

	public void setDate(String str) {
		date = str;
	}

	public void setPractitioner(String str) {
		practitionerName = str;
	}

	public void setCharge(String str) {
		charge = str;
	}

	public String toString() {
		return "\tProcedure: "+getName()+"\n"+"\tDate: "+getDate()+"\n"+"\tPractitioner: "+getPractitioner()+"\n"+"\tCharge: "+getCharge();
	}

}
