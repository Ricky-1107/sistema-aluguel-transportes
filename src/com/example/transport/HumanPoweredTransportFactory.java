public class HumanPoweredTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        return null; // Não possui patinete movido a esforço humano
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }

    @Override
    public Transport createSkate() {
        return new Skateboard();
    }

    @Override
    public Transport createRollerSkates() {
        return new RollerSkates();
    }
}
