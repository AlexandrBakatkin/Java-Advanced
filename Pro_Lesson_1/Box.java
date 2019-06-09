import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList <Fruit> fruitList;
    private String typeFruit = null;
    private float fruitWeight;

    public Box() {
        this.fruitList = new ArrayList();
    }

    public boolean putFruit(Fruit fruit){
        if (typeFruit == null){
            typeFruit = fruit.getClass().toString();
            fruitList.add(fruit);
            fruitWeight = fruit.getWeight();
        } else {
            if (typeFruit.equals(fruit.getClass().toString())){
                fruitList.add(fruit);
            } else return false;
        }
        return true;
    }

    public float getWeight(){
        return fruitList.size()*fruitWeight;
    }

    public boolean compare(Box box){
        if ((box.getWeight() - getWeight()) < 0.01) {
            return true;
        } else return false;
    }

    public boolean dropBox(Box box){
        if (box.getTypeFruit().equals(this.getTypeFruit())){
            box.getFruitList().addAll(fruitList);
            fruitList.clear();
            typeFruit = null;
            return true;
        } else {
            return false;
        }
    }

    public String getTypeFruit() {
        return typeFruit;
    }

    public ArrayList getFruitList() {
        return fruitList;
    }
}
