class Microfilm extends LibraryItem implements Searchable {

    public Microfilm(String inventoryNumber, String title) {
        super(inventoryNumber, title);
    }

    @Override
    public String getDetails() {
        return "Микрофильм: " + getTitle() + " (Инвентарный номер: " + getInventoryNumber() + ")";
    }

    @Override
    public boolean matches(String query) {
        return getTitle().equalsIgnoreCase(query);
    }
}