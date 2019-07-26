public class SingleTaskArray {
    private final int size = 10000000;
    private float[] arr = new float[size];

    public SingleTaskArray() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    public float[] getArr() {
        return arr;
    }

    public void StartArray(){

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время выполнения задачи в одном потоке:");
        System.out.println(System.currentTimeMillis() - a + " ms");
    }

    public void printArray (){
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
    }
}