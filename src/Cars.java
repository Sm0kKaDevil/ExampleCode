public class Cars {
    String make;
    String model;
    int year;
    double mileage;
    boolean isRunning;

    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println("Автомобиль заведен.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Автомобиль остановлен.");
    }

    public void drive(double disnace) {
        if (!isRunning) {
            System.out.println("Автомобиль не работает. Сначала заведите его.");
        } else {
            mileage += disnace;
            System.out.println("Проехали " + disnace + " км");
        }
    }

    public void getCarsInfo() {
        System.out.println("Марка: " + make + ", " + "Модель: " + model + ", " + "Год выпуска: " + year + ", " + "Пробег: " +
                mileage + ", " + "Работает: " + isRunning);
    }
}
