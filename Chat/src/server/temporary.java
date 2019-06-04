package server;

import java.util.ArrayList;

public class temporary {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");

        StringBuffer sb = new StringBuffer();
        for (String o: str
             ) {
            sb.append(o + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
