public class BusinessChair extends Chair {

    public BusinessChair(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Business Koltuk - " + super.getPrice() + "$";
    }
}