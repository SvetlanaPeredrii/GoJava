package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;

    }

    Course(int hourseDuration, String name, String teacherName) {
        this.hoursDuration = hourseDuration;
        this.name = name;
        this.teacherName = teacherName;

    }


    public Date getstartDate() {
        return startDate;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {

        return "Name = " + name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return "TeacherName = " + teacherName;
    }
}
