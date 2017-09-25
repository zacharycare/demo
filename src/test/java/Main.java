import java.time.Clock;
import java.time.ZoneId;

/**
 * author : zhou
 * datetime : 2017/9/25 10:44
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Clock.systemUTC().millis());
    }
}
