package Inheritance.MultilevelInheritance.EducationalCourseHierarchy;
public class OnlineCourse extends Course {

    /*
     This class represents an online version of a course.
     It extends the Course class by adding platform-specific
     details such as platform name and recording availability.
    */

    // Stores course platform
    protected String platform;

    // Indicates whether the course is recorded
    protected boolean isRecorded;

    // Initializes online course details
    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration); // Initialize base course details
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Displays online course details
    @Override
    void displayCourseInfo() {
        super.displayCourseInfo(); // Display base course info
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
