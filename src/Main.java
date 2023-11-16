import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        if (age >= 0 && age < 7) {
            System.out.println("Идти в детсад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Идти в школу");
        } else if (age >= 18 && age < 23) {
            System.out.println("Идти в ВУЗ");
        } else if (age >= 23 && age < 60) {
            System.out.println("Идти на работу");
        } else if (age >= 60 && age < 100) {
            System.out.println("Идти на пенсию");
        } else {
            System.out.println("Столько не живут");
        }


    }
}