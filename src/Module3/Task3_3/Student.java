package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    Student (String firstName, String lastName, int group){
       this.firstName = firstName;
       this.lastName = lastName;
       this.group = group;

    }
    Student(String lastName, Course [] coursesTaken){
       this.lastName = lastName;
       this.coursesTaken = coursesTaken;
    }
}
