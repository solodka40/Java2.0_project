import Task4.Candy;
import Task4.Chokolate;
import Task4.Jellybean;
import Task4.SetPresent;

public class Task4_2 {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Lemon", 1.9, 12, "Big");
        Candy candy2 = new Candy();
        candy2.setName("Orange");
        candy2.setPrice(2);
        candy2.setWeight(1.1);
        Jellybean jellybean1 = new Jellybean("Bears", 1.2, 0.7, "Red");
        Chokolate choko1 = new Chokolate("Alenka", 14, 100, "Milk");
        SetPresent[] box = {candy1, candy2, jellybean1, choko1};
        for (SetPresent firstBox : box) {
            System.out.println(firstBox.toString());
        }
        System.out.println("");
        //Посчитаем цену sumPrice и вес sumWeight всего подарка
        double sumPrice, sumWeight;
        sumPrice = 0;
        for (int i = 0; i < box.length; i++) {
            sumPrice += box[i].price;
        }
        sumWeight = 0;
        for (int i = 0; i < box.length; i++) {
            sumWeight += box[i].weight;
        }

        System.out.println("Total price:");
        System.out.println(sumPrice);
        System.out.println("Total weight:");
        System.out.println(sumWeight);
    }
}
