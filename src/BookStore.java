import java.util.ArrayList;

public class BookStore {

    String name;
    private ArrayList<Book> books;


    // Конструктор
    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }


    // Метод для добавления книги
    public void addBook(Book book) {
        books.add(book);
    }


    // Метод для вывода информации о всех книгах
    public void listBook() {
        for (Book book : books) {
            book.getBookInfo();
        }
    }


    // Метод для продажи книги
    public void sellBook(String title, int amount) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                double totalSale = book.sell(amount);
                if (totalSale > 0) {
                    System.out.printf("Сумма продажи для %d книг \"%s\": %.2f\n", amount, title, totalSale);
                }
                return;
            }
        }
        System.out.println("Книга \"" + title + "\" не найдена.");
    }


    // Метод для получения общей стоимости на складе
    public double getTotalInventoryValue() {
        double totalValue = 0;
        for (Book book : books) {
            totalValue += book.price * book.quantity; // предполагается, что price доступен. Если price исключить из контекста - добавить геттеры.
        }
        return totalValue;
    }

}
