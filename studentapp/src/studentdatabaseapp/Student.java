package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor:prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter the last name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophormore\n3 - Junior\n4 - Senior\nEnter student class level  : ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    // Generate ID

    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        while(true){
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if(!course.equalsIgnoreCase("Q")){
                courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
            }

            else{
                break;
            }
        }

    }

    // View Valance
    public void viewBalance(){
        System.out.println("Your balance is : " + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment$: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        System.out.println("Thank you for your payment$ " + payment);

        tuitionBalance -= payment;
        viewBalance();
    }

    // Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance;
    }
}
