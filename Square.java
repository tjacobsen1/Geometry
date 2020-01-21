class Square{

    private Point bottomLeft;
    private Point topLeft;
    private Point topRight;
    private Point bottomRight;
    private int sideLen;
    private Point[] points;

    public Square(Point pt1, int sideLen){
        this.points[0] = pt1;                                                       //bottom left
        this.points[1] = new Point(pt1.getX(), pt1.getY() + sideLen);               //top left
        this.points[2] = new Point(pt1.getX() + sideLen, pt1.getY() + sideLen);     //top right
        this.points[3] = new Point(pt1.getX() + sideLen, pt1.getY());               //bottom right
        this.sideLen = sideLen;
        
    }

    public Point getPoint(int x){
        return points[x];
    }

    public int findArea(){
        return sideLen * sideLen;
    }

    public boolean collision(Square sq2){
        for(int i = 0; i < 4; i++){
            if((points[i].getX() < sq2.getPoint(0).getX() && points[i].getX() > sq2.getPoint(2).getX())){//just x need to test y

            }
        }
        


        return true;
    }


}