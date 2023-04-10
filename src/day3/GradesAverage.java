package day3;

import java.util.Iterator;
import java.util.Scanner;

public class GradesAverage {
	public static void main(String[] args) {
//		int numStudents[];
//		GradesAverage scan = new GradesAverage();
//		int n = scan.nextInt();
//		string n = scan.nextLine();
//		int grades[] = new int[numStudents];
//		GradesAverage stds = new GradesAverage(System.in);
//		stds.gradesAverage();
		GradesAverage avt = new GradesAverage();
		avt.gradesAverage();
	}
	
	public void gradesAverage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n The munber of student: ");
		int n = sc.nextInt();
		int grades[] = new int [n];
		int num =0;
		
		while(num < n){
			int sdt = num +1;
			System.out.println("\n The score of student: " + sdt + " : ");
			int score = sc.nextInt();
			if(score >= 0  && score <= 100) {
				grades[num] = score;
				num +=1;
			}else {
				System.out.println("\n error ");
			}
		}
		
		
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		System.out.println("Avegare " + (float) sum/grades.length);
		
		System.out.println(grades.length);
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
	}
	

}
