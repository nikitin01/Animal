public class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println("Гав гав");
    }

    public void eat() {
        System.out.println("Собака грызет кость");
    }
}
