public class DoubleTaskArray {
    private final int size = 10000000;
    private final int h = size/2;

    public float[] getArr() {
        return arr;
    }

    private float[] arr = new float[size];
    private float[] arr1 = new float[h];
    private float[] arr2 = new float[h];

    public DoubleTaskArray(){
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    public void StartArray() throws InterruptedException {
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        ArrThread arrThread1 = new ArrThread(arr1, 0);
        ArrThread arrThread2 = new ArrThread(arr2, h);
        arrThread1.start();
        arrThread2.start();
        arrThread1.join();
        arrThread2.join();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Время выполнения задачи в двух потоках:");
        System.out.println(System.currentTimeMillis() - a + " ms");
    }

    public void printArray (){
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
    }
}