package ModelElements;

import java.util.ArrayList;

public class PoligonalModel {
    public ArrayList<Poligons> poligons;
    public ArrayList<Textures> textures;
    // Поля и методы для работы с моделью

    // Конструктор
    public PoligonalModel() {
        poligons = new ArrayList<>();
        textures = new ArrayList<>();
    }

    // Метод для добавления многоугольника в модель
    public void addPolygon(Poligon polygon) {
        Poligons poligon = null;
        poligons.add(poligon);
    }

    // Метод для добавления текстуры в модель
    public void addTexture(Textures texture) {
        textures.add(texture);
    }
}