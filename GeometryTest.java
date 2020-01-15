public class GeometryTest {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(6,9);
        Point point3 = new Point(4, 0);

        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println(triangle.area());
    }
}