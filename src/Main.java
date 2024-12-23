import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryRegistry registry = new LibraryRegistry();


        registry.addItem(new Book("B001", "Джоан Роулинг", "Гарри Поттер и философский камень"));
        registry.addItem(new Magazine("M001", "National Geographic"));
        registry.addItem(new Letter("L001", "Александр Сергеевич Пушкин", "Пушкин - Вяземскому П. А., 27 марта 1816"));
        registry.addItem(new Microfilm("F001", "Микрофильм переписи населения России 1897 года"));

        String query = "Джоан Роулинг";
        List<LibraryItem> libraryItems = registry.search(query);

        if (libraryItems.size() == 0) {
            System.out.printf("Ничего не найдено! \n");
        }

        for (LibraryItem item : libraryItems) {
            System.out.println(item.getDetails());
        }
    }
}