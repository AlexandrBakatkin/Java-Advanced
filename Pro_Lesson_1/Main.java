public class Main {
    public static void main(String[] args) {
        String[] strArr = {"Один", "Два", "Три", "Четыре", "Пять"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        ArrayMod<Integer> intArrMod = new ArrayMod<>(intArr, 1, 2);
        System.out.println();
        ArrayMod<String> stringArrayMod = new ArrayMod<>(strArr, 0, 2);
        System.out.println();
        System.out.println();
        System.out.println("______________Задача по преобразованию массива в ArrayList_______________");
        ArrToArrList<String> arrToArrList = new ArrToArrList<>(strArr);
        System.out.println(arrToArrList.getArrList().toString());
        System.out.println("______________Задача про фрукты и коробки_______________");
        Apple<Fruit> apple1 = new Apple();
        Apple<Fruit> apple2 = new Apple();
        Apple<Fruit> apple4 = new Apple();
        Apple<Fruit> apple5 = new Apple();
        Orange<Fruit> orange1 = new Orange();
        Orange<Fruit> orange2 = new Orange();
        Orange<Fruit> orange3 = new Orange();
        Orange<Fruit> orange4 = new Orange();
        Orange<Fruit> orange5 = new Orange();
        Orange<Fruit> orange6 = new Orange();
        Orange<Fruit> orange7 = new Orange();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple1));
        System.out.println("Put " + orange1.getClass().toString() + " in the box: " + box1.putFruit(orange1));
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple2));
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple4));
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple5));
        System.out.println("Put " + orange1.getClass().toString() + " in the box: " + box1.putFruit(orange1));
        System.out.println("Put " + orange2.getClass().toString() + " in the box: " + box2.putFruit(orange2));
        System.out.println("Put " + orange3.getClass().toString() + " in the box: " + box2.putFruit(orange3));
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println("Равны ли коробки по весу?: " + box1.compare(box2));
        System.out.println("Put " + orange4.getClass().toString() + " in the box: " + box2.putFruit(orange4));
        System.out.println("Put " + orange5.getClass().toString() + " in the box: " + box2.putFruit(orange5));
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple5));
        System.out.println("Put " + apple1.getClass().toString() + " in the box: " + box1.putFruit(apple5));
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println("Равны ли коробки по весу?: " + box2.compare(box1));
        System.out.println("Put " + orange6.getClass().toString() + " in the box: " + box3.putFruit(orange6));
        System.out.println("Put " + orange7.getClass().toString() + " in the box: " + box3.putFruit(orange7));
        System.out.println(box3.getWeight());
        System.out.println("Перекладываем из одной коробки в другую: " + box1.dropBox(box3));
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
    }
}
