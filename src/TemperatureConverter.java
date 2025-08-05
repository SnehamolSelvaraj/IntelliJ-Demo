import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println("Temperature in Celsius = " + celsius + "°C");

        sc.close();
    }
}
8