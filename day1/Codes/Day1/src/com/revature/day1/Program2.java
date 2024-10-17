package com.revature.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	
	LinkedHashMap<String, Double> studentGrades=new LinkedHashMap<>();
	Scanner sc=new Scanner(System.in);
	
	String studentId;
	double grade;
	
	while(true) {
		System.out.println("Enter student Id or 'exit' to finish");
		studentId=sc.nextLine();
		
		if(studentId.equalsIgnoreCase("exit")) {
			break;
		}
		
		System.out.println("Enter grade for studentID "+studentId+":");
		grade=sc.nextDouble();
		sc.nextLine();
		
		studentGrades.put(studentId, grade);
	}
	
	System.out.println("Student Grades: ");
	for(Map.Entry<String, Double> entry : studentGrades.entrySet()) {
		System.out.println("STudent Id:"+entry.getKey()+",Grade:"+entry.getValue());
	}
}
}

/*
 * Scenario 2: Maintaining Order
You are developing a system to process student grades. Each student has a unique student ID, and you need to store grades in the order they are received. 
Which Java collection would be appropriate for this scenario?
Answer:LinkedHashMap would be a suitable choice. LinkedHashMap maintains insertion order of keys, which means it will store the grades in the order they are added. 
This is beneficial if you need to process grades in the order they were received without sorting.
*/
