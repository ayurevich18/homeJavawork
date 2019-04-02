package console_char_int_int_char;

import java.io.IOException;

public class ReadingFrom {
    public static void main(String[] args) throws IOException {
        char tm;
        System.out.print("Please press key, after that press ENTER: ");
        tm=(char)(int)(char)System.in.read();
        System.out.println(tm);


    }
}
