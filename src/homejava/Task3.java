package homejava;

public class Task3 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int g=5;
        int max=0;
        int min=0;

        if((a>b)&(a>c)&(a>d)&(a>g))max=a;
        if((b>a)&(b>c)&(b>d)&(b>g))max=b;
        if((c>a)&(c>b)&(c>d)&(c>g))max=c;
        if((d>a)&(d>c)&(d>b)&(d>g))max=d;
        if((g>a)&(g>c)&(g>d)&(g>b))max=g;

        System.out.println(max);

        if((a<b)&(a<c)&(a<d)&(a<g))min=a;
        if((b<a)&(b<c)&(b<d)&(b<g))min=b;
        if((c<a)&(c<b)&(c<d)&(c<g))min=c;
        if((d<a)&(d<c)&(d<b)&(d<g))min=d;
        if((g<a)&(g<c)&(g<d)&(g<b))min=g;

        System.out.println(min);


    }
}
