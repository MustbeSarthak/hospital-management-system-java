package HosptalManagementSystem;

public class Appointment {
    static int counter = 0;

    int id;
    String patientName;
    int age;
    String problem;
    String date;
    String time;
    String status;

    Appointment( String name, int Age, String Problem, String date, String time, String status){
        this.id = ++counter; // Incrementing the counter and assigning it to id for each new appointment
        this.patientName = name;
        this.age = Age;
        this.problem = Problem;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    
    public String toString(){
        return "ID: " + id + ". " + "Patient Name: " + patientName +" || " + "Age: " + age + " || " + "Problem: " + problem + " || " + "Date: " + date + " || " + "Time: " + time + " || " + "Status: " + status;
    }
}
