package module8;

/**
 * Created by kaganets.s on 13.04.2017.
 */
public final class IdGenerator {
    private static long idCount = 1;
    private IdGenerator() {
    }
    public static long generateId() {
        return idCount++;
    }
}