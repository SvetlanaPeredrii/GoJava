package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;
    CollegeStudent (String firstName, String lastName, int group){
        super(firstName, lastName,group);

    }
    CollegeStudent (int hourseDuration, String name, String teacherName){
        super(hourseDuration,name,teacherName);

    }
    CollegeStudent (String firstName, String lastName, int group,int hourseDuration, String name, String teacherName, String collegeName, int rating, long id){
        super(firstName, lastName,group, hourseDuration, name, teacherName);
        collegeName = collegeName;
        rating = rating;
        id = id;
    }
}
