class Book extends LibraryItem implements Searchable {
    private String author;

    public Book(String inventoryNumber, String author, String title) {
        super(inventoryNumber, title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Книга: " + getTitle() + author + " (Инвентарный номер: " + getInventoryNumber() + ")";
    }

    @Override
    public boolean matches(String query) {
        return author.equalsIgnoreCase(query) || getTitle().equalsIgnoreCase(query);
    }
}
