package HosptalManagementSystem;

import java.lang.reflect.Array;

public class Patient {
    // -----------------Patient Menu-----------------

    // String Patientname;

    // // Constructor

    // Patient(String name){
    // this.Patientname = name;
    // }
    // // Returning String Representation of Patient Object
    // public String toString(Patient p){
    // return "Patient Name: " + Patientname;
    // }

    static void patientMenu() {

        boolean flag = true;
        while (flag) {
            System.out.println("\n");
            System.out.println("============YOU ARE IN PATIENT MENU============" + "\n");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Logout" + "\n");
            System.out.print("Enter Your Choice: ");

            int choice = Main.in.nextInt();
            Main.in.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("");
                    System.out.println("Booking Appointment..." + "\n");
                    System.out.println("============BOOK APPOINTMENT============");
                    bookAppointment();
                    System.out.println("============BOOK APPOINTMENT============");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Viewing Appointments...");
                    System.out.println("============YOUR APPOINTMENTS============");
                    viewAppointment();
                    System.out.println("============YOUR APPOINTMENTS============");
                    break;

                case 3:
                    flag = false;
                    System.out.println("Logged out");

                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // -----------------BOOK APPOINTMENT-----------------
    static void bookAppointment() {
        // Taking Input From User

        System.out.print("Enter Your Name: ");
        String name = Main.in.nextLine();
        System.out.print("Enter Your Age: ");
        int Age = Main.in.nextInt();
        Main.in.nextLine();
        System.out.print("Enter Your Problem: ");
        String Problem = Main.in.nextLine();
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = Main.in.nextLine();
        System.out.print("Enter Time (hh:mm): ");
        String time = Main.in.nextLine();

        Main.appointments.add(new Appointment(name, Age, Problem, date, time, "Booked"));
        System.out.println("Appointment Booked Successfully...");
        System.out.println("Your Appointment ID is: " + Main.appointments.get(Main.appointments.size() - 1).id);
        System.out.println(" ");
    }

    // -----------------VIEW APPOINTMENTS FOR PATIENTS------------------
    static void viewAppointment() {
        System.out.print("Enter Your Appointment ID: ");
        int id = Main.in.nextInt();
        boolean found = false;

        for (Appointment ap : Main.appointments) {

            if (ap.id == id) {
                System.out.println(ap);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no current Appointment...");
        }

    }

}
