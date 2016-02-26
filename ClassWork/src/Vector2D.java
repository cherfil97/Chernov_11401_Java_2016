/**
 * Created by cherfil97 on 19.02.16.
 */
public class Vector2D {

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public Vector2D() {

    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double addAnotherVector() {
        sum = (x + y) + (x2 + y2);
        return sum;
    }
    private double x2,y2, sum;

    public void sumOfTwoVectors (){

    }
    public Vector2D add(Vector2D v2) {
        return new Vector2D((x + v2.getX()), y + v2.getY());
    }
    public boolean equals(Vector2D v) {
        Vector2D v2 = (Vector2D) v;
        return (x == v2.getX() && y == v2.getY());
    }

    public boolean equals(Object v) {
        try {
            Vector2D v2 = (Vector2D) v;
            return (x == v2.getX() && y == v2.getY());
        }
        catch (ClassCastException e) {
            return false;
        }
    }
    public void reduseLengthBy(int n) throws LengthReduceException {
        if (n <= 0)
            throw new LengthReduceException();
        this.x /= n;
        this.y /= n;
    }
}
