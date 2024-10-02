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

public class Patient {

	private String firstName;
	private String midName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String emergencyName;
	private String emergencyPhone;

	public Patient() {
	}

	public Patient(String firsName, String midName, String lastName) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
	}

	public Patient(String firstName, String midName, String lastName, String address, String city, String state, String zip, String phone, String emergencyName, String emergencyPhone) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMidName() {
		return midName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setFirstName(String str) {
		firstName = str;
	}

	public void setMidName(String str) {
		midName = str;
	}

	public void setLastName(String str) {
		lastName = str;
	}

	public void setAddress(String str) {
		address = str;
	}

	public void setCity(String str) {
		city = str;
	}

	public void setState(String str) {
		state = str;
	}

	public void setZip(String str) {
		zip = str;
	}

	public void setPhone(String str) {
		phone = str;
	}

	public void setEmergencyName(String str) {
		emergencyName = str;
	}

	public void setEmergencyPhone(String str) {
		emergencyPhone = str;
	}

	public String buildFullName() {
		if (getMidName() != "") 
			return getFirstName()+" "+getMidName()+" "+getLastName();
		else
			return getFirstName()+getMidName()+" "+getLastName();
	}

	public String buildAddress() {
		return getAddress()+" "+getCity()+" "+getState()+" "+getZip();
	}

	public String buildEmergencyContact() {
		return getEmergencyName()+" "+getEmergencyPhone();
	}

	public String toString() {
		return " Name: "+buildFullName()+"\n"+" Address: "+buildAddress()+"\n"+" Emergency Contact: "+buildEmergencyContact();
	}

}
