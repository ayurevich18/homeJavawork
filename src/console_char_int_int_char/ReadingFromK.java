package console_char_int_int_char;

import java.io.IOException;

public class ReadingFromK {
    public static void main(String[] args) throws IOException {
        int p;
        System.out.print("Please press key, after that press ENTER: ");
        p=(int)(char)System.in.read();
        System.out.println(p);

    }
}
