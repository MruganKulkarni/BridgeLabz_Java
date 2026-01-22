package OOPCoreConcepts.HospitalPatientManagement;
public class InPatient extends Patient {

    /*
     This class represents an in-patient who is admitted to the hospital.
     It extends the Patient class by adding room charges to the total bill.
    */

    // Number of days admitted
    private int daysAdmitted;

    // Daily room charge
    private static final double ROOM_CHARGE_PER_DAY = 1500;

    public InPatient(int patientId, String name, double treatmentCost, int daysAdmitted) {
        super(patientId, name, treatmentCost);
        this.daysAdmitted = daysAdmitted;
    }

    // Calculates total bill for in-patient
    @Override
    public double calculateBill() {
        return treatmentCost + (daysAdmitted * ROOM_CHARGE_PER_DAY);
    }
}
