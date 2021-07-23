package aplanaHomeTask2;

public abstract class Sweets {
    private String title;
    private double cost;
    private double weight;
    private int unicNumber;

    public Sweets() {
    }

    public Sweets(String title, double cost, double weight, int unicNumber) {
        this.title = title;
        this.cost = cost;
        this.weight = weight;
        this.unicNumber = unicNumber;
    }

    public String getTitle() {
        return title;
    }

    public Sweets setTitle(String title) {
        this.title = title;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public Sweets setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Sweets setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public int getUnicNumber() {
        return unicNumber;
    }

    public Sweets setUnicNumber(int unicNumber) {
        this.unicNumber = unicNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", unicNumber=" + unicNumber +
                '}';
    }
}
