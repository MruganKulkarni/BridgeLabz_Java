package OOPCoreConcepts.HospitalPatientManagement;
public class HospitalDemo {

    public static void main(String[] args) {

        // Polymorphic patient references
        Patient inpatient =
                new InPatient(401, "Suresh", 8000, 4);

        Patient outpatient =
                new OutPatient(402, "Meena", 2000);

        // Displaying inpatient details
        inpatient.displayPatientDetails();
        System.out.println();

        // Displaying outpatient details
        outpatient.displayPatientDetails();
    }
}
