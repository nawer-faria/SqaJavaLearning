package interface1;

public interface MeasurableTemperature {
    String waterType = "Bath";
    int waterBoilingTemperatureInCelsius = 100;                     //Constant variables

    float getTemperature();                                         //Abstract methods

    default float tempInFahrenheit(int constant) {                  //Default methods  F = ( °C × 9/5 ) + 32
        return ((getTemperature() * (9 / 5)) + constant);
    }

    default void usePrivateMethod() {
        action();
        waterHeaterFunction();
    }

    static String printFunction(String string) {                        //Static Method
        return string;
    }

    private void action() {                                             // Private methods
        if (getTemperature() < 18) {
            System.out.println("Turn On The Heater");
        } else {
            System.out.println("You can take a bath");
        }
    }

    private static void waterHeaterFunction() {                         //Private Static methods
        System.out.println("The hot water heater is the machine responsible for converting energy into heat and subsequently creating hot water for use throughout your home.");
    }


}
