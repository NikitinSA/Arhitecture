// Вспомогательный класс для вычисления площади и периметра
class ShapeUtils {
    /**
     * Вычисляет площадь фигуры.
     *
     * @param shape Фигура.
     * @return Площадь фигуры.
     */
    public static double calculateArea(Shape shape) {
        return shape.getArea();
    }

    /**
     * Вычисляет периметр фигуры.
     *
     * @param shape Фигура.
     * @return Периметр фигуры.
     */
    public static double calculatePerimeter(Shape shape) {
        return shape.getPerimeter();
    }
}