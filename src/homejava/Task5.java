package homejava;

public class Task5 {
    public static void main(String[] args) {
        int month=10;

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
                default:
                    System.out.println("В году 12 месяцев");

        }
    }
}
