package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(){

    }

    CollegeStudent (String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }

    CollegeStudent(String lastName, Course [] coursesTaken){
        super(lastName, coursesTaken);
    }

    CollegeStudent (String collegeName, int rating, long id){
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;

    }

    public String getCollegeName() {
        return "collegeName = " + collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
