package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */

import java.util.Date;

public class Solution2 {
    public static void main(String[] args) {


        Course course1 = new Course(new Date(15 - 04 - 16), "First");
        Course course2 = new Course(new Date(25 - 02 - 17), "Second");

        Course course3 = new Course(365, "Second", "Ivanov Ivan");
        Course course4 = new Course(100, "Third", "Petrova Maria");
        Course course5 = new Course(220, "First", "Sidorov Pasha");

        Student student1 = new Student("Misha", "Sokol", 1);
        Student student2 = new Student("Sidorova", new Course[3]);

        CollegeStudent collegeStudent1 = new CollegeStudent("Sveta", "Kahanets", 3);
        CollegeStudent collegeStudent2 = new CollegeStudent("Petrov", new Course[2]);
        CollegeStudent collegeStudent3 = new CollegeStudent("NAU", 2, 123456);

        SpecialStudent specialStudent1 = new SpecialStudent("Max", "Gromov", 1);
        SpecialStudent specialStudent2 = new SpecialStudent("Reva", new Course[1]);
        SpecialStudent specialStudent3 = new SpecialStudent(123456789);

        System.out.println("Date = " + course2.getstartDate());
        System.out.println(course1.getname());
        course1.setname("Vasya ");
        System.out.println(course1.getname());
        System.out.println(course2.getname());
        System.out.println("HoursDuration = " + course3.getHoursDuration());
        System.out.println("HoursDuration = " + course4.getHoursDuration() + "  " + course4.getname() + "  " + course4.getTeacherName());
        System.out.println(course5.getTeacherName());
        System.out.println(student2.getCoursesTaken());
        System.out.println(student1.getAge());
        System.out.println(collegeStudent1.getFirstName());
        System.out.println(collegeStudent2.getLastName());
        System.out.println(collegeStudent3.getCollegeName() + " Rating = " + collegeStudent3.getRating() + " ID =  " + collegeStudent3.getId());
        System.out.println(specialStudent1.getFirstName());
        System.out.println(specialStudent2.getLastName());
        System.out.println("SecretKey = " + specialStudent3.getSecretKey());


    }


}