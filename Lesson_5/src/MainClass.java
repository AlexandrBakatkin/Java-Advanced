import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        SingleTaskArray arrFirst = new SingleTaskArray();
        DoubleTaskArray arrDouble = new DoubleTaskArray();
        arrFirst.StartArray();
        arrDouble.StartArray();
        System.out.println(Arrays.equals(arrFirst.getArr(), arrDouble.getArr()));
    }
}