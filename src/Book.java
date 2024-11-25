public class Book {
    String title;
    String author;
    double price;
    int quantity;

    // Конструктор
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }


    // Метод для получения информации о книге
    public void getBookInfo() {
        System.out.println("Название: " + title + ", " + "Автор: " + author + ", " + "Цена: " + price + ", " + "Количество: " + quantity);
    }


    // Метод для продажи книг
    public double sell(int amount) {
        if (amount > quantity) {
            System.out.println("Ошибка: Недостатояно книг для продажи: " + title);
            return 0;
        }
        quantity -= amount;
        return amount * price;
    }


    // Метод для пополнения запаса книг
    public void restock(int amount) {
        quantity += amount;
    }

    // Геттер для получения названия книги
    public String getTitle() {
        return title;
    }
}
