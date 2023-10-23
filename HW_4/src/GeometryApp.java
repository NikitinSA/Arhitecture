// Главный класс приложения
public class GeometryApp {
    public static void main(String[] args) {
        try {
            // Пример использования конкретных классов геометрических фигур
            Shape circle = new Circle(5.0);
            System.out.println("Площадь круга: " + ShapeUtils.calculateArea(circle));
            System.out.println("Периметр круга: " + ShapeUtils.calculatePerimeter(circle));

            Shape rectangle = new Rectangle(4.0, 6.0);
            System.out.println("Площадь прямоугольника: " + ShapeUtils.calculateArea(rectangle));
            System.out.println("Периметр прямоугольника: " + ShapeUtils.calculatePerimeter(rectangle));

            Shape triangle = new Triangle(3.0, 4.0, 5.0);
            System.out.println("Площадь треугольника: " + ShapeUtils.calculateArea(triangle));
            System.out.println("Периметр треугольника: " + ShapeUtils.calculatePerimeter(triangle));

        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
