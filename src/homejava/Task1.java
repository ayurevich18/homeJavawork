package homejava;

public class Task1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 8;
        int d = 8;

        int e = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println(e);
    }
}
