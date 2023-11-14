package ModelElements;

import java.lang.reflect.Type;

// Класс, представляющий сцену (Scene)
public class Scene {
    public int id;
    public Poligon models;
    public Flash flashes;

    // Конструктор
    public Scene(int id, Poligon models, Flash flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    // Методы для сцены
    public Type method1(Type arg) {
        // Логика метода method1
        return null; // Замените на реальный результат
    }

    public Type method2(Type arg1, Type arg2) {
        // Логика метода method2
        return null; // Замените на реальный результат
    }

    public int getId() {
        return 0; //корректировать
    }
}