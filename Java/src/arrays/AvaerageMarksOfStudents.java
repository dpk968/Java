package arrays;

import java.util.Scanner;

public class AvaerageMarksOfStudents {

	public static void main(String[] args) {


		final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student");
        final int n = sc.nextInt();
        final int[] marks = new int[n];
        System.out.println("Enter the marks");
        for (int i = 0; i < n; ++i) {
            marks[i] = sc.nextInt();
        }
        float avrg = 0.0f;
        for (int j = 0; j < n; ++j) {
            avrg += marks[j];
        }
        avrg /= n;
        System.out.println("the avrg :" + avrg);

	}

}
