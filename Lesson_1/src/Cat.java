public class Cat extends Animal {

    public Cat(String name){
        super("Кот", name, 200, 20, 0);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}