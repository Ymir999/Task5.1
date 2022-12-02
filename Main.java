package Task6;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5,5);
        System.out.println("Периметр квадрата: " + square.GetPerimeter());
        System.out.println("Площадь квадарта: " + square.GetArea());

        Triangle triangle = new Triangle(7,6,8);
        System.out.println("Периметр треугольника: " + triangle.GetPerimeter());
        System.out.println("Высота треугольника: " + triangle.GetHeightTriangle());
        System.out.println("Площадь треугольника: " + triangle.GetArea());

    }
}
