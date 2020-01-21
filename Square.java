class Square{

    private Point pt1;
    private Point pt2;
    private Point pt3;
    private Point pt4;

    public Square(Point pt1, Point pt2, Point pt3, Point pt4){
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.pt3 = pt3;
        this.pt4 = pt4;
    }

    private int findSide(){
        return pt1.getX() - pt2.getX();
    }

    public double findArea(){
        return findSide() * findSide();
    }

    


}