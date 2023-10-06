package ModelElements;

import java.util.ArrayList;

// Класс, представляющий многоугольники
public class Poligon {
    public ArrayList<Point3D> points;
    // Конструктор
    public Poligon() {
        points = new ArrayList<>();
    }
    // Метод для добавления точки в многоугольник
    public void addPoint(Point3D point) {
        points.add(point);
    }
    // Метод для получения всех точек многоугольника
    public ArrayList<Point3D> getPoints() {
        return points;
    }
}