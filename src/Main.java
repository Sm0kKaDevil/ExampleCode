public class Main {

    public static void main(String[] args) {

// Задание с машинами

//        Car myCar = new Car("Шивроле", "Камаро", 2013, 15000, 8.5);
//        myCar.getCarInfo();
//
//        double distanсe = 250;
//        double fuelNeeded = myCar.calculateFuelNeeded(distanсe);
////        System.out.println("Топливое необходимое для поездки на " + distanse + "км" + ":" + " , " + fuelNeeded + "л");
//        System.out.printf("Топливо, необходимое для поездки на %.2f км: %.3f л%n", distanсe, fuelNeeded);


// Задание с книгами

        //Объявляем создание и название нашего магазина
            BookStore bookStore = new BookStore("Обитель зла и похоти");
        System.out.println("\nДобро пожаловать в мой магазин " + "'" + "Обитель зла и Похоти" + "'");

            // Добавляем книги в наш магазин
            bookStore.addBook(new Book("Гуано", "Геродот", 11.34, 8));
            bookStore.addBook(new Book("ИгуанаДон", "Гризлис", 4.87, 3));
            bookStore.addBook(new Book("tsttst", " EERTERT", 12.50, 9));
            bookStore.addBook(new Book("КропскаРу", "Бубляс", 10.78, 10));

            // Выводим информацию о всех книгах в магазине
        System.out.println("\nКниги в нашем магазине:");
            bookStore.listBook();

        System.out.println();
        bookStore.sellBook("Гуано", 5);
        bookStore.sellBook("ИгуанаДон", 2);

        System.out.println("\nОставшиеся книги в магазине после продажи: ");
        bookStore.listBook();

        System.out.println();
        bookStore.sellBook("tsttst", 4);
        bookStore.sellBook("КропскаРу", 2);

        System.out.println("\nОставшиеся книги в магазине после продажи: ");
        bookStore.listBook();

        double totalInventoryValue = bookStore.getTotalInventoryValue();
        System.out.println("\nОбщая стоимость на складе: " + totalInventoryValue);





// Новые автомобили


//        Cars cars1 = new Cars("Lada", "Priora2110", 2000);
//        cars1.getCarsInfo();
//
//        System.out.println("Попытка проехать 50 км на Lada... ");
//        cars1.drive(50);
//
//        cars1.start();
//        cars1.drive(50);
//
//        System.out.println("Обновленная информация об автомобиле Lada: ");
//        cars1.getCarsInfo();
//
//        System.out.println("\nПопытка проехать еще 277 км...");
//        cars1.drive(277);
//
//        System.out.println("Обновленная информация об автомобиле Lada: ");
//        cars1.getCarsInfo();
    }
}
