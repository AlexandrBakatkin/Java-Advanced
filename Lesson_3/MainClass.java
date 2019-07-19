import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("123");
        arrString.add("456");
        arrString.add("789");
        arrString.add("123");
        arrString.add("654");
        arrString.add("987");
        arrString.add("100");
        arrString.add("200");
        arrString.add("300");
        arrString.add("100");

        ModArray modArray = new ModArray(arrString);
        modArray.printArray();
        System.out.println();
        System.out.println("Уникальные слова в массиве: " + modArray.uniqueWords());
        System.out.println();
        System.out.println("Считаем сколько раз каждое слово встречается в массиве. Способ 1");
        System.out.println(modArray.howManyTimes());
        System.out.println();
        System.out.println("Считаем сколько раз каждое слово встречается в массиве. Способ 2");
        modArray.howManyTimesBetter();
        System.out.println();
        System.out.println("_________Телефонный справочник___________");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Alex", "9105455550");
        phoneBook.add("Andrey", "9105455555");
        phoneBook.add("Alexey", "9995455550");
        phoneBook.add("Alex", "9195455550");
        phoneBook.add("Igor", "123456");
        phoneBook.add("Alexey", "01");
        phoneBook.add("Alex", "7775455550");
        System.out.println("Телефоны Alex: " + phoneBook.get("Alex"));
        System.out.println("Телефоны Andrey: " + phoneBook.get("Andrey"));
        System.out.println("Телефоны Alexey: " + phoneBook.get("Alexey"));
        System.out.println("Телефоны Igor: " + phoneBook.get("Igor"));
        System.out.println("______________");
        System.out.println("Все телефоны из справочника:");
        phoneBook.printPhoneBook();
    }
}