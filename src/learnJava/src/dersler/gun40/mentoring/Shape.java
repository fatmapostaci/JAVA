package learnJava.src.dersler.gun40.mentoring;

abstract class Shape {
    abstract double calculateArea();

}
class Circle extends Shape{
    double r ;
    public Circle(double r) {
        super();
        this.r = r;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.calculateArea());
    }

    @Override
    double calculateArea() {
        return Math.pow(r,2)*Math.PI;
    }
}
