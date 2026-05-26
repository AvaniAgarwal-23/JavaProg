abstract class Shape {

    abstract double area();
    abstract double perimeter();
    void display() {
        System.out.println("Shape Details");
    }
}

class Circle extends Shape {

    double r;
    Circle(double r) {
        this.r = r;
    }
    double area() {
        return 3.14 * r * r;
    }
    double perimeter() {
        return 2 * 3.14 * r;
    }
}

class Rectangle extends Shape {

    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    double a;
    double b;
    double c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double perimeter() {
        return a + b + c;
    }
}

public class abc {
    public static void main(String[] args) {

        Circle c = new Circle(7);
        Rectangle r = new Rectangle(4, 5);
        Triangle t = new Triangle(3, 4, 5);

        c.display();
        System.out.println("Circle Area = " + c.area());
        System.out.println("Circle Perimeter = " + c.perimeter());
        System.out.println();
        r.display();
        System.out.println("Rectangle Area = " + r.area());
        System.out.println("Rectangle Perimeter = " + r.perimeter());
        System.out.println();
        t.display();
        System.out.println("Triangle Area = " + t.area());
        System.out.println("Triangle Perimeter = " + t.perimeter());
    }
}