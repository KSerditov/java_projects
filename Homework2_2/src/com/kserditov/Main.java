package com.kserditov;

//Опишите классы следующих фигур
//        - круг, прямоугольник, треугольник.
//        - создайте  у них поля, которые считаете нужными.
//        - опишите методы вычисления площади
//        - создайте главный класс, который будет создавать объекты, инициализировать их и считать площадь

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println("Circle radius: " + c1.getRadius() + " Circumference: " + c1.getCircumference() + " Square: " + c1.getSquare());

        Rectangle r1 = new Rectangle(1, 1);
        System.out.println("Rectangle square: " + r1.getSquare());

        Triangle t1 = new Triangle(1,1,90);
        System.out.println("Triangle square: " + t1.getSquare());
    }
}

class Circle{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }


    public double getSquare(){
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference(){
        return 2.0 * this.radius * Math.PI;
    }
}

class Rectangle{

    private double width;
    private double height;

    Rectangle(double width, double height){
        if (width > 0.0 && height > 0.0){
            this.width = width;
            this.height = height;
        }
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    public double getSquare(){
        return width * height;
    }
}

class Triangle{
    private double side1;
    private double side2;
    private double side3;
    private double angle12;
    private double angle23;
    private double angle31;

    Triangle(double side1, double side2, double angle12) {
        if(side1 > 0.0 && side2 > 0.0 && angle12 > 0.0 && angle12 < 180.0){
            this.side1 = side1;
            this.side2 = side2;
            this.angle12 = angle12;
            this.side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(Math.toRadians(angle12)));
            this.angle23 = Math.toDegrees(Math.acos( (side2 * side2 + side3 * side3 - side1 * side1)/(2 * side2 * side2 * side3 * side3) ));
            this.angle31 = 180.0 - angle12 - angle23;
        }
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double getSide3() {
        return side3;
    }

    double getAngle12() {
        return angle12;
    }

    double getAngle23() {
        return angle23;
    }

    double getAngle31() {
        return angle31;
    }

    double getSquare(){
        return 0.5 * side1 * side2 * Math.sin(Math.toRadians(angle12));
    }
}
