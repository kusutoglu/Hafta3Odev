public class FlightExpeditionIntrovertManager implements FlightExpeditionService {
    private AirLine airLine;

    public FlightExpeditionIntrovertManager(AirLine airLine) {
        this.airLine = airLine;
    }

    @Override
    public void YemekVer(int chairNum) {
        if (airLine instanceof Pegasus)
            System.out.println("Pegasus iç uçuşlarda yemek vermez.");
        else
            System.out.println("Afiyet olsun!");
    }
}