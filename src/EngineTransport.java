public abstract class EngineTransport extends Tyres {
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public abstract void checkEngine();

}
