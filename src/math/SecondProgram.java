package math;

public class SecondProgram {
    public static void main(String[] args) {
        /*3. В переменной n хранится вещественное число с ненулевой дробной частью.
         Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран. */
        float n=28.29f;
        int a = Math.round(n);
        System.out.println(a);
    }
}
