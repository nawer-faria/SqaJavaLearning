package interface1;

public class InterfaceTestClass implements MeasurableTemperature {
    float temperature = getTemperature();

    @Override
    public float getTemperature() {
        return 18.03F;
    }

    public static void main(String[] args) {


        System.out.println(MeasurableTemperature.printFunction("Welcome"));
        InterfaceTestClass waterHeatingSystem = new InterfaceTestClass();
        System.out.println("Water Boiling Temperature In Celsius is: " + waterBoilingTemperatureInCelsius);
        System.out.println("Water Type is: " + waterType);
        System.out.println("Water Temp In Celsius: " + waterHeatingSystem.temperature);
        System.out.println("Water Temp in Fahrenheit: " + waterHeatingSystem.tempInFahrenheit(32));
        waterHeatingSystem.usePrivateMethod();


    }


}
