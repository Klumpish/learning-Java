public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        setSize(size);

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink -> " + "type='" + type + '\'' + ", size='" +
          size + '\'' + ", price=" + price + '}';
    }

    public void setSize(String size) {
        this.size = size.toLowerCase();
        switch (this.size) {
            case "small" -> this.price = 1.00;
            case "medium" -> this.price = 1.50;
            case "large" -> this.price = 2.00;
            default -> {
                this.price = 1.00;
                this.size = "small";
            }
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

