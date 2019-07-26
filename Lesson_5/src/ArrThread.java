public class ArrThread extends Thread {
    private float [] arrThread;
    private int j;

    public ArrThread(float[] arrThread, int j) {
        this.arrThread = arrThread;
        this.j = j;
    }

    @Override
    public void run() {
        for (int i = 0; i < arrThread.length; i++) {
            int a = i + j;
            arrThread[i] = (float)(arrThread[i] * Math.sin(0.2f + a / 5) * Math.cos(0.2f + a / 5) * Math.cos(0.4f + a / 2));
        }
    }
}