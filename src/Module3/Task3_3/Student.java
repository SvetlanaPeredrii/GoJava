package Module3.Task3_3;

import java.util.Arrays;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;


    Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

    Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }


    private int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getLastName() {
        return "LastName = " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return "FirstName = " + firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
