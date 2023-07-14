package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students;
        int numOfStudents = in.nextInt();
        students = new Student[numOfStudents];
        System.out.println("hello world!");

        for(int n = 0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

    }
}