package homejava;

public class Task2 {
    public static void main(String[] args) {
        int a=6;
        int b=7;
        int c=9;
        int d=9;
        int e=0;

     if((a>=b)&(a>=b)&(a>=c))e++;
     if((b>=a)&(b>=c)&(b>=d))e++;
     if((c>=a)&(c>=b)&(c>=d))e++;
     if((d>=a)&(d>=b)&(d>=c))e++;
     System.out.println("Количество одиннаковых максимальных чисел: "+e);
    }
}
