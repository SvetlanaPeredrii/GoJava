package Module3.Task3_3;

/**
 * Created by kaganets.s on 16.02.2017.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    SpecialStudent (String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course [] coursesTaken){
        super(lastName, coursesTaken);
    }

    SpecialStudent (long secretKey){
      this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
