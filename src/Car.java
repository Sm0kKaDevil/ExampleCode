public class Car {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String make;
    String model;
    int year;
    double mileage;
    double fuelEfficiency;

    public Car(String make, String model, int year, double mileage, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
    }

    void getCarInfo(){
        System.out.println(ANSI_CYAN + "\nМарка: " + ANSI_RESET + ANSI_YELLOW + make + ANSI_RESET + ", " +
                ANSI_CYAN + "Модель: " + ANSI_RESET + ANSI_PURPLE + model + ANSI_RESET + ", " + ANSI_CYAN + "Год выпуска: " + ANSI_RESET + ANSI_BLUE + year + ANSI_RESET +
                ", " + ANSI_CYAN +"Пробег: " + ANSI_RESET + ANSI_RED + mileage + ANSI_RESET + ", " + ANSI_CYAN + "Расход топлива: " +ANSI_RESET + ANSI_GREEN + fuelEfficiency);
    }

    public double calculateFuelNeeded(double distanсe) {
        return (distanсe * fuelEfficiency) / 100;
    }

   public double setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
       return fuelEfficiency;
   }
}
