package entity;

public class Picture {
    private int id;
    private String topic;
    private String title;
    private double price;
    private int quantity;
    private String origin;
    private String size;
    private double weight;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Picture(int id, String topic, String title, double price, String origin, String size, double weight, String description, int quantity) {
        this.id = id;
        this.topic = topic;
        this.title = title;
        this.price = price;
        this.origin = origin;
        this.size = size;
        this.weight = weight;
        this.description = description;
        this.quantity = quantity;
    }
}
