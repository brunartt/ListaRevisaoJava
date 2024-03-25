import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        scanner.close();
    }
}