public class Truck extends  EngineTransport {

    public Truck (String modelName, int wheelsCount) {
        super (modelName, wheelsCount);
    }

    @Override
    public void transport() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    @Override
    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount() ; i++) {
            System.out.println("Меняем покрышку № " + i + " колеса грузового транспорта");
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузового транспорта");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузового транспорта");
    }
}
