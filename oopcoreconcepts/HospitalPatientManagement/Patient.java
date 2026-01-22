package OOPCoreConcepts.HospitalPatientManagement;
public abstract class Patient {

    /*
     This abstract class represents a generic patient in a hospital system.
     It encapsulates common patient details such as patient ID and name,
     and enforces subclasses to implement billing logic based on patient type.
    */

    // Unique patient ID
    private int patientId;

    // Patient name
    private String name;

    // Base treatment cost
    protected double treatmentCost;

    public Patient(int patientId, String name, double treatmentCost) {
        this.patientId = patientId;
        this.name = name;
        this.treatmentCost = treatmentCost;
    }

    // Getter for patient ID
    public int getPatientId() {
        return patientId;
    }

    // Getter for patient name
    public String getName() {
        return name;
    }

    // Abstract method to calculate total bill
    public abstract double calculateBill();

    // Displays patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Total Bill: " + calculateBill());
    }
}
