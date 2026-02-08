package HosptalManagementSystem;

public class Doctor {

    // -----------------Doctor Menu-----------------

    static void doctorMenu() {
        boolean flag = true;
        while (flag) {

            System.out.println("=================Welcome To Doctor Menu=================" + "\n");
            System.out.println("1. View Appointments");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient Status");
            System.out.println("4. Logout");
            System.out.print("Enter Your Choice: ");
            int choice = Main.in.nextInt();
            Main.in.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Viewing Appointments...");
                    System.out.println("\n");
                    System.out.println("==============YOUR APPOINTMENTS==============");
                    showAppointment();
                    System.out.println("==============YOUR APPOINTMENTS==============");
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Viewing Patients..." + "\n");
                    System.out.println("==============YOUR PATIENTS==============");
                    viewPatients();
                    System.out.println("==============YOUR PATIENTS==============" + "\n");
                    break;

                case 3:
                    System.out.println("Updating Status...");
                    updateStatus();
                    break;

                case 4:
                    flag = false;
                    System.out.println("Logged out");

                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // -----------------Appointment-----------------
    static void showAppointment() {
        for (Appointment ap : Main.appointments) {
            if (Main.appointments == null) {
                System.out.println("There is no current Appointments...");      
            }
            System.out.println(ap);
        }
    }

    // -----------------View Patients-----------------
    static void viewPatients() {
        for (Appointment ap : Main.appointments) {
                System.out.println("----------------------------------");
                System.out.println(ap.patientName + " || " + ap.age + " || " + ap.problem);
                System.out.println("----------------------------------");
        }
   }


   // -----------------Update Status-----------------
   static void updateStatus(){
       
       System.out.print("Enter Patient ID: ");
       int id = Main.in.nextInt();
       boolean found = false;

        for (Appointment ap : Main.appointments) {

            // Checking if the patient name matches with the appointment's patient ID
            if (ap.id == id) {

                // Taking New Status From User
                System.out.println("");;
                System.out.print("Enter New Status: ");
                String status = Main.in.nextLine();
                ap.status = status;
                System.out.println("Status Updated Successfully...");
                System.out.println("");
                                
                // If the status is Recovered then we will remove the appointment from the list
                if(status.equalsIgnoreCase("Recovered")){
                    Main.appointments.remove(ap);
                    System.out.println("Patient Recovered and Removed from Appointments...");
                    System.out.println("");
                }

                // If the status is Pending then we will update the status to pending
                if( status.equalsIgnoreCase("pending")){
                    System.out.println("Status Updated to Pending...");
                }
                break;
            }    
        }

        if (!found) {
            System.out.println("There is no current Appointment...");
        }

        }
    }
