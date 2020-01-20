import java.util.HashSet;

public class Runner {

    public static void main(String[] args) {

        HashSet<Animal> animals = new HashSet<Animal>();

        for (int i = 0 ; i < 10 ; i++) {
            Dog dog = new Dog();
            animals.add(dog);
            Cat cat = new Cat();
            animals.add(cat);
            Bird bird = new Bird();
            animals.add(bird);
        }

        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
}
