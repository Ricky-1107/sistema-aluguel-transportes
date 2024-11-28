public class ElectricTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        return new ElectricScooter();
    }

    @Override
    public Transport createBike() {
        return new ElectricBike();
    }

    @Override
    public Transport createSkate() {
        return null; // Não possui skate elétrico
    }

    @Override
    public Transport createRollerSkates() {
        return null; // Não possui patins elétrico
    }
}
