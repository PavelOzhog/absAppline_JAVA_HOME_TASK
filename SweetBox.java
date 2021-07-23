package aplanaHomeTask2;

import java.util.Arrays;

public class SweetBox implements SweetBoxInterface {


    private Sweets[] boxOfSweets = new Sweets[6];


    @Override
    public void add(Sweets sweet, int index) {
        boxOfSweets[index] = sweet;

    }


    @Override
    public void removeByIndex(int index) {

        if (index <= boxOfSweets.length)
            boxOfSweets[index] = null;
        else
            System.out.println("некорректное значение");

    }

    @Override
    public void removeLast() {
        boxOfSweets[boxOfSweets.length - 1] = null;

    }


    @Override
    public double getAllWeight() {
        double allWeihgt = 0.0;


        for (int i = 0; i < this.boxOfSweets.length; i++)
            if (boxOfSweets[i] == null) {
                continue;

            } else {
                allWeihgt = allWeihgt + this.boxOfSweets[i].getWeight();
            }
        return allWeihgt;

    }

    @Override
    public double getAllCost() {
        double allCost = 0.0;


        for (int i = 0; i < this.boxOfSweets.length; i++)
            if (boxOfSweets[i] == null)
                continue;
            else allCost += this.boxOfSweets[i].getCost();
        return allCost;
    }

    @Override
    public void getAllInformarion() {


        System.out.println("вся информация про товар: " + "стоимость коробки составляет" + (float) this.getAllCost() + " ,весом " + (float) this.getAllWeight());
    }

    @Override
    public void cosistOf() {

        System.out.println("Содержимое коробки составляет:");    // доработать метод
        for (Sweets s : boxOfSweets) {
            if (s == null)
                continue;
            else
                System.out.println(s.getTitle() + " " + " " + s.getCost() + " " + " " + s.getWeight() + " " + s.getUnicNumber());
        }
    }


    @Override
    public void smartOptByCost(double cost) {
        double currentCost = boxOfSweets[0].getCost();

        while (this.getAllCost() > cost) {

            for (int i = 0; i < boxOfSweets.length; i++) {

                if (boxOfSweets[i] == null) {
                    continue;
                }


                if (currentCost >= this.boxOfSweets[i].getCost())
                    currentCost = this.boxOfSweets[i].getCost();
            }


            for (int i = 0; i < boxOfSweets.length; i++) {
                if (boxOfSweets[i] == null) {
                    continue;
                }

                if (boxOfSweets[i].getCost() == currentCost) {
                    this.removeByIndex(i);
                    
                }
            }


        }


    }


    @Override
    public String toString() {
        return "SweetBox{" +
                "sweetBox=" + Arrays.toString(boxOfSweets) +
                '}';
    }
}
