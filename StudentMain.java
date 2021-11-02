package com.ty.practicesesion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Students s1 = new Students(23, "motu", 101, 98.00);
		Students s2 = new Students(19, "patlu", 102, 56.90);
		Students s3 = new Students(17, "abcd", 107, 86.90);
		Students s4 = new Students(16, "bcda", 105, 66.90);
		Students s5 = new Students(16, "bcda", 105, 66.90);

		Set<Students> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		ArrayList arrayList = new ArrayList<Students>(set);

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to sort by Age");
		System.out.println("press 2 to sort by marks");
		System.out.println("press 3 to sort by name");
		System.out.println("press 4 to sort by id");
		System.out.println("press 5 to exit");
		System.out.println("press 6 if you don't know anything");

		System.out.println("Enter the value of input");
		int input = sc.nextInt();
		if (input < 6) {
			switch (input) {

			case 1:
				Collections.sort(arrayList, new SortByAge());
				for (Students students : set) {
					System.out.println(students);
				}
				break;

			case 2:
				Collections.sort(arrayList, new SortByMarks());
				for (Students students : set) {
					System.out.println(students);
				}
				break;

			case 3:
				Collections.sort(arrayList, new SortByName());
				for (Students students : set) {
					System.out.println(students);
				}
				break;

			case 4:
				Collections.sort(arrayList, new SortById());
				for (Students students : set) {
					System.out.println(students);
				}
				break;

			case 5:
				System.exit(0);

			}
		}

		else {

			throw new InvalidOptionException("option invalid");

		}
	}
}
