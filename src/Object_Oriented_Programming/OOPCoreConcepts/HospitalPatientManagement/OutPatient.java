package OOPCoreConcepts.HospitalPatientManagement;
public class OutPatient extends Patient {

    /*
     This class represents an out-patient who visits the hospital
     for consultation and treatment without admission.
    */

    public OutPatient(int patientId, String name, double treatmentCost) {
        super(patientId, name, treatmentCost);
    }

    // Calculates total bill for out-patient
    @Override
    public double calculateBill() {
        return treatmentCost;
    }
}
