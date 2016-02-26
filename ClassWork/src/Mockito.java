import org.mockito.Mock;
import org.mockito.mock.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by cherfil97 on 19.02.16.
 */
public class Mockito {

    public static void sampleMethod() throws IOException {
        InputStream is = mock(InputStream.class);
        int s = 0;
        while (is.available()!= -1) {
            s+=is.read();
        }
    }


}

