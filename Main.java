package aplanaHomeTask2;

public class Main {
    public static void main(String[] args) {

        SweetBox sweetBox = new SweetBox();

        Candies candy1 = new Candies("Twix", 5.45, 1.68, 5464);
        Candies candy2 = new Candies("Mars", 7.98, 2.88, 1231);
        GingerBread gingerbread1 = new GingerBread("Tulsky", 8.98, 3.32, 9899);
        GingerBread gingerbread2 = new GingerBread("Pokrovsky", 4.22, 9.99, 9878);
        Marmelad marmelad1 = new Marmelad("Bears", 7.88, 9.32, 4322);
        Marmelad marmelad2 = new Marmelad("Worms", 2.32, 5.43, 5322);

        sweetBox.add(candy1, 0);           // добавление элемента в коробку
        sweetBox.add(candy2, 1);
        sweetBox.add(gingerbread1, 2);
        sweetBox.add(gingerbread2, 3);
        sweetBox.add(marmelad1, 4);
        sweetBox.add(marmelad2, 5);


        System.out.println("Вес коробки составляет " + sweetBox.getAllWeight());      //общий вес коробки
        System.out.println((float) sweetBox.getAllCost());      //вся стоимость коробки

        sweetBox.cosistOf();                                      // состав коробки




         sweetBox.removeLast();             //удаление помледнего элеиента
         sweetBox.removeByIndex(3);         //удаление по индексу

   //     sweetBox.smartOptByCost(32.00);         //метод не доработан, приводит в бесконечному выполнению


    }


}
