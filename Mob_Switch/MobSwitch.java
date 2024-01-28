package Mob_Switch;
import java.util.Scanner;
class MobSwitch {

    static double temperature;
    static char temperatureType;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In welchen Temperatur-Typen möchtest du konvertieren?");
        temperatureType = scanner.nextLine().charAt(0);
        System.out.println("Wie hoch ist die Temperatur?");
        temperature = scanner.nextDouble();
        switch(temperatureType) {
            case 'F': System.out.println(String.format("Celsius: %f | Fahrenheit: %f", temperature, ConvertCelsiusToFahrenheit(temperature)));
                break;
            case 'C': System.out.println(String.format("Fahrenheit: %f | Celsius: %f", temperature, ConvertFahrenheitToCelsius(temperature)));
            break;

        }
    }

    public static double ConvertCelsiusToFahrenheit(double temperature) {
        return temperature *9 / 5 + 32;
    }

    public static double ConvertFahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}