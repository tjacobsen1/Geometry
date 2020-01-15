class Triangle{

    private Point ptOne;
    private Point ptTwo;
    private Point ptThree;

    public Triangle(Point ptOne, Point ptTwo, Point ptThree){

        this.ptOne = ptOne;
        this.ptTwo = ptTwo;
        this.ptThree = ptThree;

    }

    public double area(){
        double sideOne = ptOne.calculateDistance(ptTwo);
        double sideTwo = ptTwo.calculateDistance(ptThree);
        double sideThree = ptThree.calculateDistance(ptOne);
        double semPerimeter = (sideOne + sideTwo + sideThree)/2;

        return 0.0;
    }


}