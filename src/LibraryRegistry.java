import java.util.ArrayList;
import java.util.List;

class LibraryRegistry {
    private List<LibraryItem> items;

    public LibraryRegistry() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> search(String query) {
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Searchable && ((Searchable) item).matches(query)) {
                results.add(item);
            }
        }
        return results;
    }
}