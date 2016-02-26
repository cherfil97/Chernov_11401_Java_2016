import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;
import java.io.InputStream;


import javax.xml.bind.ValidationEvent;
import java.lang.reflect.Method;
import java.util.Vector;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



/**
 * Created by cherfil97 on 19.02.16.
 */

public class Vector2DTest {

    @Test
    public void vectorShouldHaveMethodLength() {


        try {
            Method m = Vector2D.class.getMethod("length");

        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());

        }
    }


    @Test
    public void defaultVectorShouldHaveZeroLength() {
        Vector2D v = new Vector2D();
        Assert.assertEquals(0, v.length(), 1e-9);

    }


    @Test
    public void constructorShouldSaveParamsInAttribute() {
        Vector2D v = new Vector2D(3, 4);
        Assert.assertTrue(3 == v.getX() && 4 == v.getY());

    }


    @Test
    public void vectorShouldHaveCorrectLength() {
        Vector2D v = new Vector2D(3, 4);
        Assert.assertEquals(5, v.length(), 1e-9);

    }

    @Test
    public void sumOfVectorsShouldBeCorrect() {
        Vector2D v1 = new Vector2D(2, 3);
        Vector2D v2 = new Vector2D(2, 3);
        Vector2D v3 = v1.add(v2);
        Vector2D v4 = new Vector2D(4, 6);
        Assert.assertEquals(v4, v3);

    }
    @Test
    public void equalsShouldReturnTrueOrSameVectors() {
        Vector2D v1 = new Vector2D(2, 3);
        Vector2D v2 = new Vector2D(2, 3);
        Assert.assertTrue(v1.equals(v2));
    }
    @Test
    public void equalsShouldReturnFalseOnDifferentVectors() {
        Vector2D v1 = new Vector2D(2, 3);
        Vector2D v2 = new Vector2D(3, 2);
        Assert.assertFalse(v1.equals(v2));
    }
    @Test
    public void equalsIsShouldReturnFalseOnDifferentTypes() {
        Vector2D v1 = new Vector2D(2, 3);
        Vector2D v2 = new Vector2D(2, 3);
        Assert.assertFalse(v1.equals(2.5));
    }

    @Test(expected = LengthReduceException.class)
    public void ReduceLengthWithWrongParamThrowException() throws LengthReduceException {
        Vector2D v = new Vector2D(1,2);
        v.reduseLengthBy(0);
        /* - без expected
        try {
            v.reduceLengthBy(0);
            Assert.fail();
        }
        catch (LengthReduceException e) {}
         */

    }
    @Test
    public void addShouldWorkCorrectEvenWithMock() {
        Vector2D v1 = new Vector2D(2,3);
        Vector2D v2 = mock(Vector2D.class);
        when(v2.getX()).thenReturn(3.0);
        when(v2.getY()).thenReturn(4.0);

        Vector2D v3 = new Vector2D(5,7);
        Assert.assertEquals(v3, v1.add(v2));
    }

}