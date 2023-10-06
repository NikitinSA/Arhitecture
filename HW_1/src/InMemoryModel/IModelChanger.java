package InMemoryModel;

// Интерфейс для объекта, который может менять модель
interface IModelChanger {
    void notifyChange(IModelChanger sender);
}