import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws IOException {
        fileToCharArray();
        System.out.println();

        filesCombine();
        System.out.println();

        readPages();

    }

    private static void readPages() throws IOException {
        final int PAGE = 1;
        final int COUNT_SYMBOLS = 1800;
        byte[] x = new byte[COUNT_SYMBOLS];
        RandomAccessFile randomAccessFile = new RandomAccessFile("RandomAccessFile.txt", "rw");
        randomAccessFile.seek(COUNT_SYMBOLS*(PAGE - 1));
        randomAccessFile.read(x);
        System.out.println(new String (x));
        randomAccessFile.close();
    }

    private static void filesCombine() throws IOException {
        ArrayList<InputStream> fileList = new ArrayList<>();
        fileList.add(new FileInputStream("1.txt"));
        fileList.add(new FileInputStream("2.txt"));
        fileList.add(new FileInputStream("3.txt"));
        fileList.add(new FileInputStream("4.txt"));
        fileList.add(new FileInputStream("5.txt"));

        Enumeration<InputStream> e = Collections.enumeration(fileList);

        SequenceInputStream seq = new SequenceInputStream(e);

        File file = new File("6.txt");

        FileOutputStream outputStream = new FileOutputStream(file.getName());
        int x;

        while((x = seq.read()) != -1){
            outputStream.write(x);
        }

        seq.close();
    }

    private static void fileToCharArray() throws IOException {
        FileInputStream in = new FileInputStream("1.txt");

        byte[] array = new byte[500];
        in.read(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print((char)array[i]);
        }
        in.close();
    }
}
