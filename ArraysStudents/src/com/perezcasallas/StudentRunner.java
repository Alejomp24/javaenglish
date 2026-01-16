package com.perezcasallas;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Eliam", 97, 98, 100);
		Student student1 = new Student("Yolis", 96, 97, 99);
		Student student2 = new Student("Alejo", 95, 96, 98);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total of marks: " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum mark: " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum mark: " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average mark: " + average);

		System.out.println(student);
	}

}
