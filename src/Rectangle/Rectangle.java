package Rectangle;

import java.util.Scanner;

public class Rectangle {

    private int a;
    private int b;
    private int area;
    private int perimeter;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void calculatePerimeter(){
        setPerimeter(2*(a+b));
    }
    public void calculateArea(){
        setArea(a*b);
    }



    //getter ve setterlar
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }




}
