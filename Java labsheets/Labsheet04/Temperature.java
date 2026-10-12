public class Temperature {
    double celsius;
    static String scale = "Celsius";

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperature: " + celsius + " " + scale);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    public static void main(String[] args) {
        double temp = 25;

        Temperature t = new Temperature();
        t.celsius = temp;

        t.convert();
    }
}
