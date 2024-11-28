public class Main {
    public static void main(String[] args) {
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricScooter = electricFactory.createScooter();
        Transport electricBike = electricFactory.createBike();

        electricScooter.ride();
        electricBike.ride();

        TransportFactory humanPoweredFactory = new HumanPoweredTransportFactory();
        Transport bicycle = humanPoweredFactory.createBike();
        Transport skateboard = humanPoweredFactory.createSkate();
        Transport rollerSkates = humanPoweredFactory.createRollerSkates();

        bicycle.ride();
        skateboard.ride();
        rollerSkates.ride();
    }
}
