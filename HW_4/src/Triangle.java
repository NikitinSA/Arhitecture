// Класс для треугольника
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор класса Triangle.
     *
     * @param side1 Длина первой стороны треугольника.
     * @param side2 Длина второй стороны треугольника.
     * @param side3 Длина третьей стороны треугольника.
     */

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Длины сторон треугольника должны быть положительными числами.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
