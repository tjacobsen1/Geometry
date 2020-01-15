public class Point {
    

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x  = x;
        this.y = y;
    }

    public double calculateDistance(Point point2) {
        return Math.sqrt(Math.pow((point2.getX() - x), 2) + 
                        Math.pow(point2.getY() - y, 2));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}