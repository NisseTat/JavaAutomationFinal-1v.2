class Magazine extends LibraryItem implements Searchable {

    public Magazine(String inventoryNumber, String title) {
        super(inventoryNumber, title);
    }

    @Override
    public String getDetails() {
        return "Журнал: " + getTitle() + " (Инвентарный номер: " + getInventoryNumber() + ")";
    }

    @Override
    public boolean matches(String query) {
        return getTitle().equalsIgnoreCase(query);
    }
}