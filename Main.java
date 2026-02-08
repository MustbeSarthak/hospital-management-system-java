package HosptalManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    // This will the main appointments list which will be used by both doctor and patient
    static ArrayList<Appointment> appointments = new ArrayList<>();
    // ------ ARRAYLIST OF APPOINTMENTS ------      

    public static void main(String[] args) {
        
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("================Welcome To Hospital Management System================" + "\n");
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice : ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Welcome Doctor...");
                    Doctor.doctorMenu();
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("Welcome Patient...");
                    Patient.patientMenu();
                    break;

                case 3:
                    flag = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
