package studentdatabaseapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students;
        int numOfStudents;

        while(true) {
            try {
                System.out.print("Enter the students number : ");
                numOfStudents = in.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("Enter the Integer!. Enter Again.");
                in.nextLine(); // make Buffer Empty
                continue;
            }
        }

        students = new Student[numOfStudents];

        for(int n = 0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

    }
}