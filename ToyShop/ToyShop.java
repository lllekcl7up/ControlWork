package ControlWork.ToyShop;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int id, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                return;
            }
        }
        System.out.println("Toy with id " + id + " not found!");
    }

    public Toy getPrizeToy() {
        Random rand = new Random();
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        int randWeight = rand.nextInt(totalWeight);
        int currentWeight = 0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (currentWeight > randWeight) {
                toy.setQuantity(toy.getQuantity() - 1);
                writeToFile(toy.getName());
                return toy;
            }
        }
        return null;
    }

    private void writeToFile(String toyName) {
        try {
            FileOutputStream fos = new FileOutputStream("S:/GeekBrains/ControlWork/ToyShop/award.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);
            writer.write(toyName + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
