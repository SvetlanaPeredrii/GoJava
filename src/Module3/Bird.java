package Module3;


public class Bird {

    static void sing(String vote1, String vote2, String vote3, String vote4){
        System.out.println(vote1);
        System.out.println(vote2);
        System.out.println(vote3);
        System.out.println(vote4);

    }

    public static void main(String[] args) {
        String vote1 = "I am walking";
        String vote2 = "I am flying";
        String vote3 = "I am singing";
        String vote4 = "I am Bird";
        sing(vote1,vote2,vote3,vote4);
    }
}
