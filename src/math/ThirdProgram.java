package math;

public class ThirdProgram {
    public static void main(String[] args) {
        int a=299;
        String b=String.valueOf(a);
        System.out.println(b);
        String c=b.substring(0,1);
        System.out.println(c);
        String d=b.substring(1,2);
        System.out.println(d);
        String r=b.substring(2,3);
        System.out.println(r);
        int sum1=Integer.parseInt(c);
        int sum2=Integer.parseInt(d);
        int sum3=Integer.parseInt(r);
        int sums=sum1+sum2+sum3;
        System.out.println(sums);
    }
}
