package Inheritance.MultilevelInheritance.EducationalCourseHierarchy;
public class PaidOnlineCourse extends OnlineCourse {

    /*
     This class represents a paid online course.
     It extends the OnlineCourse class by adding
     payment-related attributes such as fee and discount.
    */

    // Stores course fee
    private double fee;

    // Stores discount percentage
    private double discount;

    // Initializes paid online course details
    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Initialize online course
        this.fee = fee;
        this.discount = discount;
    }

    // Displays complete paid course details
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo(); // Display online course info
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        // Creating PaidOnlineCourse object
        PaidOnlineCourse course =
                new PaidOnlineCourse("Java OOP", 40,
                        "Udemy", true, 5000, 20);

        // Displaying course information
        course.displayCourseInfo();
    }
}
