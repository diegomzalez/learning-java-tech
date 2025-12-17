
public class Array {

    static private class PointExample {
    }

    public static void main(CString[] args) {
        PointExample[] points;
        points = new PointExample[10];
        int i;
        for (i = 0; i < 10; i++) {
            points[i] = new PointExample();
        }
        int howMany = points.length;
        System.out.println("Array's length: " + howMany);
    }
}
