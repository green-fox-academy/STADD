import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> animals = new ArrayList<>(3);

    public void breed() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.isEmpty()) {
                Animal animal = new Animal();
            }
        }
    }

    public void slaughter(Animal animal) {
        for (int i = 0; i < animals.size(); i++) {
        }
    }
}
