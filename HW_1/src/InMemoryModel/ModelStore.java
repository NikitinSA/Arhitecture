package InMemoryModel;

import InMemoryModel.IModelChangeObserver;
import InMemoryModel.IModelChanger;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;

class ModelStore {
    private PoligonalModel models;
    private ArrayList<Scene> scenes;
    private ArrayList<Flash> flashes;
    private ArrayList<Camera> cameras;
    private ArrayList<IModelChangeObserver> changeObservers;

    // Конструктор
    public ModelStore() {
        models = new PoligonalModel();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
        changeObservers = new ArrayList<>();
    }

    // Методы для работы с моделями (PoligonalModel)
    public PoligonalModel getModels() {
        return models;
    }

    // Методы для работы со списком сцен (Scene)
    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    public void removeScene(Scene scene) {
        scenes.remove(scene);
    }

    public Scene getScene(int id) {
        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
        return null; // Сцена с указанным id не найдена
    }

    // Методы для работы со списком молний (Flash)
    public void addFlash(Flash flash) {
        flashes.add(flash);
    }

    public void removeFlash(Flash flash) {
        flashes.remove(flash);
    }

    // Методы для работы со списком камер (Camera)
    public void addCamera(Camera camera) {
        cameras.add(camera);
    }

    public void removeCamera(Camera camera) {
        cameras.remove(camera);
    }

    // Методы для работы со списком наблюдателей изменений модели (IModelChangeObserver)
    public void addObserver(IModelChangeObserver observer) {
        changeObservers.add(observer);
    }

    public void removeObserver(IModelChangeObserver observer) {
        changeObservers.remove(observer);
    }

    // Метод для уведомления наблюдателей об изменениях в модели
    public void notifyChange(IModelChanger sender) {
        for (IModelChangeObserver observer : changeObservers) {
            observer.applyUpdateModel();
        }
    }
}