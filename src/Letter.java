class Letter extends LibraryItem implements Searchable {
    private String author;

    public Letter(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Письмо: " + getTitle() + author + " (Инвентарный номер: " + getInventoryNumber() + ")";
    }

    @Override
    public boolean matches(String query) {
        return author.equalsIgnoreCase(query) || getTitle().equalsIgnoreCase(query);
    }
}