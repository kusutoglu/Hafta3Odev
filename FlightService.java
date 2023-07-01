import java.util.List;

public interface FlightService {
    void run();

    void printScreen(List<FlightExpedition> flightExpeditionList);

    String[] selectNumbers();
}