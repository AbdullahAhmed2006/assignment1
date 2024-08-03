public class TemperatureConverter {
    public static void main(String[] args) {
        double temperatureFahrenheit = 108.0;
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;

  
        System.out.println("Temperature in Celsius: " + temperatureCelsius + "°C");
    }
}
