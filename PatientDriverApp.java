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

public class PatientDriverApp {
	

	public static void main(String[] args) {
		//construct 1 patient
		Patient patient1 = new Patient();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		patient1.setFirstName(keyboard.nextLine());
		System.out.println("Enter Your Middle Name");
		patient1.setMidName(keyboard.nextLine());
		System.out.println("Enter Your Last Name");
		patient1.setLastName(keyboard.nextLine());
		System.out.println("Enter Your Address");
		patient1.setAddress(keyboard.nextLine());
		System.out.println("Enter City");
		patient1.setCity(keyboard.nextLine());
		System.out.println("Enter State");
		patient1.setState(keyboard.nextLine());
		System.out.println("Enter Zipcode");
		patient1.setZip(keyboard.nextLine());
		System.out.println("Enter Your Phone");
		patient1.setPhone(keyboard.nextLine());
		System.out.println("Enter the Name of Your Emergency Contact");
		patient1.setEmergencyName(keyboard.nextLine());
		System.out.println("Enter the Phone of Your Emergency Contact");
		patient1.setEmergencyPhone(keyboard.nextLine());
		
		//Construct 3 procedures
		Procedure pro1 = new Procedure();
		Procedure pro2 = new Procedure("Physical Exam", "2024/10/01");
		Procedure pro3 = new Procedure("X-ray", "2023/07/01", "Dr. Kuijt", "440.12");
		
		//Set values for procedure 1
		pro1.setName("Blood Test");
		pro1.setDate("2021/10/12");
		pro1.setPractitioner("Dr. Estep");
		pro1.setCharge("322.28");
		
		//Set values for procedure 2
		pro2.setPractitioner("Dr. Lee");
		pro2.setCharge("467.22");
		
		//Display information
		System.out.println("Patient Info:");
		displayPatient(patient1);
		System.out.println("\n");
		displayProcedure(pro1);
		System.out.println("\n");
		displayProcedure(pro2);
		System.out.println("\n");
		displayProcedure(pro3);
		System.out.println("\n");
		System.out.println(String.format("Total Charges: $%,.2f", calculateTotalCharges(pro1, pro2, pro3)));
		System.out.println("\n");
		System.out.println("Student Name: Ya-Wen Cheng");
		System.out.println("MC#: M21214085");
		System.out.println("Due Date: 10/02/2024");
		
	}
	
	public static void displayPatient(Patient patient) {
		System.out.print(patient.toString());
	}

	public static void displayProcedure(Procedure procedure) {
		System.out.print(procedure.toString());
	}

	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		double charge1 = Double.parseDouble(procedure1.getCharge());
		double charge2 = Double.parseDouble(procedure2.getCharge());
		double charge3 = Double.parseDouble(procedure3.getCharge());
		return charge1+charge2+charge3;
	}

}
