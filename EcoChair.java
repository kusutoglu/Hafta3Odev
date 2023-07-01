public class EcoChair extends Chair {
    public EcoChair(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Eco Koltuk - " + super.getPrice() + "$";
    }
}