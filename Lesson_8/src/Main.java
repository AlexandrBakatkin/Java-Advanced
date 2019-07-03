import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int ID;
        int tempID;
        int count = 0;
        Object tempObject = new Object();

        CustomQuery customQuery = new CustomQuery();

        System.out.println(tempObject.hashCode());

        tempObject = customQuery.getElement();
        ID = tempObject.hashCode();                     //запоминаем первый элемент в очереди

        customQuery.putElement(tempObject);             //Возвращаем его в очередь и считаем за первый элемент
        count++;

        while (true){
            tempObject = customQuery.getElement();
            tempID = tempObject.hashCode();
            if (ID == tempID){
                break;
            } else {
                count++;
                customQuery.putElement(tempObject);
            }
        }

        System.out.println("Длина очереди: " + count + " элементов.");
    }
}