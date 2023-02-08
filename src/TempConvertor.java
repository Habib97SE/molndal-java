import java.util.Scanner;


/***
 * Habiballah Hezarehee
 * 	97habhez@gafe.molndal.se
 * 	Java Integration VT 2023
 */
public class TempConvertor
{

    static  Scanner scanner = new Scanner(System.in);

    public static void main (String[] args)
    {
        final float CELSIUS_TO_FAHRENHEIT = 1.8f;
        final float KELVIN_TO_CELSIUS = 273.15f;
        final float KELVIN_TO_FAHRENHEIT = 459.67f;


        System.out.print("Vänligen skriv in ditt rums temperatur i Celsius: ");
        float celsiusTemperature = scanner.nextFloat();

        // Convert celsius to fahrenheit
        float celsiusToFahrenheit = celsiusTemperature * CELSIUS_TO_FAHRENHEIT + 32;

        // Convert celisisu to kelvin
        float celsiusToKelvin = celsiusTemperature + KELVIN_TO_CELSIUS;

        // Convert Forenheit to celsius
        float fahrenheitToCelsius = (celsiusToFahrenheit - 32) / CELSIUS_TO_FAHRENHEIT;

        // Convert Forenheit to Kelvin
        float fahrenheitToKelvin = (celsiusToFahrenheit + KELVIN_TO_FAHRENHEIT) / CELSIUS_TO_FAHRENHEIT;
        // Avrunda till 2 decimaler
        fahrenheitToKelvin = Math.round(fahrenheitToKelvin * 100.0f) / 100.0f;


        // Convert Kelvin to Farenheit
        float kelvinToFahrenheit = (celsiusToKelvin * CELSIUS_TO_FAHRENHEIT) - KELVIN_TO_FAHRENHEIT;
        kelvinToFahrenheit = Math.round(kelvinToFahrenheit * 100.0f) / 100.0f;

        // Convert Kelvin to Celsius
        float kelvinToCelsius = celsiusToKelvin - KELVIN_TO_CELSIUS;

        // Printa ut resultaten
        System.out.printf("From Celsius to Fahrenheit: %s%n", Float.toString(celsiusToFahrenheit));
        System.out.printf("From Celsius to Kelvin: %s%n", Float.toString(celsiusToKelvin));
        System.out.printf("From Farenheit to Celsius: %s%n", Float.toString(fahrenheitToCelsius));
        System.out.printf("From Fahrenheit to Kelvin: %s%n", Float.toString(fahrenheitToKelvin));
        System.out.printf("From Kelvin to Fahrenheit: %s%n", Float.toString(kelvinToFahrenheit));
        System.out.printf("From Kelvin to Celsius: %s", Float.toString(kelvinToCelsius));
    }
}
