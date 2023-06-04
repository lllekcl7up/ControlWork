package ControlWork.ToyShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyShop store = new ToyShop();

// add new toy
        store.addToy(new Toy(1, "Лего", 10, 30));
        store.addToy(new Toy(2, "Книга", 5, 20));
        store.addToy(new Toy(3, "Мяч", 15, 50));
        store.addToy(new Toy(4, "Электромобиль", 5, 10));
        store.addToy(new Toy(5, "Робот", 7, 7));
        store.addToy(new Toy(6, "Альбом и краски", 10, 10));
        store.addToy(new Toy(7, "Железная дорога", 8, 5));
// change weight
        store.updateToyWeight(1, 70);
        store.updateToyWeight(2, 60);
        store.updateToyWeight(3, 50);
        store.updateToyWeight(4, 40);
        store.updateToyWeight(5, 30);
        store.updateToyWeight(6, 20);
        store.updateToyWeight(7, 10);
// lottery ( i = quantity winner toys )
        List<Toy> awardToys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Toy awardToy = store.getPrizeToy();
            if (awardToy != null) {
                awardToys.add(awardToy);
            }
        }

// print list winer toys
        System.out.println("\nСписок призовых игрушек: \n");
        for (Toy toy : awardToys) {
            System.out.println(toy.getName());
        }
    }
}
