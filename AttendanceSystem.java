
import java.util.Scanner;

class Student {
    int id;
    String name;
    int totalDays;
    int presentDays;
    double percentage;
    String status;

    // Method to input student details
    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Clear input buffer

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Total Working Days: ");
        totalDays = sc.nextInt();

        System.out.print("Enter Days Present: ");
        presentDays = sc.nextInt();
    }

    // Method to calculate attendance percentage
    void calculateAttendance() {
        percentage = ((double) presentDays / totalDays) * 100;
    }

    // Method to check eligibility
    void checkEligibility() {
        if (percentage >= 75) {
            status = "Eligible";
        } else {
            status = "Not Eligible";
        }
    }

    // Method to display student report
    void displayReport() {
        System.out.println("\n------ STUDENT REPORT ------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Total Days   : " + totalDays);
        System.out.println("Present Days : " + presentDays);
        System.out.printf("Attendance   : %.2f%%\n", percentage);
        System.out.println("Status       : " + status);
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            s[i] = new Student();
            s[i].inputDetails();
            s[i].calculateAttendance();
            s[i].checkEligibility();
        }

        // Display attendance reports
        System.out.println("\n===== STUDENT ATTENDANCE REPORT =====");

        for (int i = 0; i < n; i++) {
            s[i].displayReport();
        }

        System.out.println("\nProgram Ended Successfully!");

        sc.close();
    }
}