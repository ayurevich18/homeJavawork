package symbol_counter;

import java.util.ArrayList;
import java.util.List;


public class SymbolCounter {
    public static void main(String[] args) {
        String a = "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdf";
        String[] b = a.split("(?!^)");

        int count = 0;
        List<Integer> c = new ArrayList();
        for (int i = 0; b.length - 1 >= i; i++) {

            if (b[i].equals("a")) {
                c.add(i);
                count++;
            }


        }

        System.out.println("Кол-во символов “a” -" + count + "индексы символа “a” в строке " + c);


    }

}

