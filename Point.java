public class Point {
    

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x  = x;
        this.y = y;
    }

    public int calculateDistance() {
        return Math.sqrt(Math.pow(x + getX, 2) + Math.pow(y + getY, 2));
    }

    public int getX() {
        return this.getX;
    }

    public int getY() {
        return this.getY;
    }
}