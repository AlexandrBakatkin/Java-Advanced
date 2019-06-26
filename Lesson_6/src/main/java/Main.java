public class Main {
    public static void main(String[] args) {

        int [] array1 = {10, 2, 4, 2, 6, 2};
        ArrayLastFour arrayLastFour1 = new ArrayLastFour();
        arrayLastFour1.cutArray(array1);
        for (int i = 0; i < arrayLastFour1.cutArray(array1).length; i++) {
            System.out.print("[" + arrayLastFour1.cutArray(array1)[i] + "]");
        }
        System.out.println();

        int [] array2 = {1, 1, 4};
        CheckArray checkArray1 = new CheckArray();
        System.out.println(checkArray1.checkArray(array2));

        int [] array3 = {4, 3, 1};
        CheckArray checkArray3 = new CheckArray();
        System.out.println(checkArray3.checkArray(array3));
    }
}
