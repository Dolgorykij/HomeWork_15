import java.sql.SQLOutput;

public class Bicycle extends Tyres {

    public Bicycle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Замена велосипедной покрышки");
    }

    @Override
    public void transport() {

    }
}
