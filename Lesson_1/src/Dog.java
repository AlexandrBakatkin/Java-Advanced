public class Dog extends Animal {

    public Dog(String name) {
        super("Пес", name, 500, 5, 20);
    }

    @Override
    public void voice() {
        System.out.println("Гаф");
    }
}