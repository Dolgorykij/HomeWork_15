public class Car extends EngineTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount() ; i++) {
            System.out.println("Меняем покрышку № " + i + " колеса машины");
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void transport() {
        checkEngine();
        updateTyre();
    }
}
