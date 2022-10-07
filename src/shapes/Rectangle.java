package shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (width * 2) + (length * 2);
    }
}