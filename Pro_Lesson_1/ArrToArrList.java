import java.util.ArrayList;

public class ArrToArrList<T> {
    private T[] arr;
    private ArrayList<T> arrList = new ArrayList<>();

    public ArrToArrList(T[] arr){
        this.arr = arr;
        for (T t : arr) {
            arrList.add(t);
        }
    }

    public ArrayList getArrList() {
        return arrList;
    }
}