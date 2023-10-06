package ModelElements;

import java.awt.*;

// Класс, представляющий молнию (Flash)
public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    // Конструктор
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    // Методы для поворота и перемещения молнии
    public void rotate(Angle3D rotationAngle) {
        // Логика поворота молнии
    }

    public void move(Point3D newPosition) {
        // Логика перемещения молнии
    }
}