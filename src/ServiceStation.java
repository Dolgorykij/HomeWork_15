public class ServiceStation {

    public void check (Transport... trans) {
        for (Transport a : trans) {
            a.transport();
        }
    }

}
