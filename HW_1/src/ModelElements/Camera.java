package ModelElements;

// Класс, представляющий камеру (Camera)
public class Camera {
    public Point3D location;
    public Angle3D angle;

    // Конструктор
    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    // Методы для камеры
    public void rotate(Angle3D rotationAngle) {
        // Логика поворота камеры
    }

    public void move(Point3D newPosition) {
        // Логика перемещения камеры
    }
}