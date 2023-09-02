

 import java.util.Scanner;
public class Arraylist {
// public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = new int[4][3];  // 4 students and 3 subjects
        Scanner scanner = new Scanner(System.in);

        // Get the marks for each student and subject
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate total marks, highest, lowest, and average marks
        int[] totalMarks = new int[4];
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        double average;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int studentTotal = 0;
            for (int j = 0; j < 3; j++) {
                studentTotal += marks[i][j];
            }
            totalMarks[i] = studentTotal;

            // Update highest and lowest marks
            highest = Math.max(highest, studentTotal);
            lowest = Math.min(lowest, studentTotal);

            // Calculate sum for average
            sum += studentTotal;
        }

        // Calculate average marks
        average = (double) sum / 4;

        // Print results
        System.out.println("Total Marks of each student:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
        }
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Average marks: " + average);

        scanner.close();
    }
}

    

