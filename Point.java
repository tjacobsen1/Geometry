public class Point {
    

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x  = x;
        this.y = y;
    }

    public int calculateDistance(Point point2) {
        return Math.sqrt(Math.pow(x + point2.getX, 2) + Math.pow(y + point2.getY, 2));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}