package aplanaHomeTask2;

public interface SweetBoxInterface {
    void add(Sweets sweet, int index);

    void removeByIndex(int index);

    void removeLast();

    double getAllWeight();

    double getAllCost();

    void getAllInformarion();

    void cosistOf();


    void smartOptByCost(double cost);

}
