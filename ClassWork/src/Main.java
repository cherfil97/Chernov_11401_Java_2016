import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by cherfil97 on 19.02.16.
 */
public class Main {
    public static void main(String[] arggs) {
        Result rs = JUnitCore.runClasses(Vector2DTest.class);
        for (Failure f : rs.getFailures()) {
            System.out.println(f);
        }
    }
}
