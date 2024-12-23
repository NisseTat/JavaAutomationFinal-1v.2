abstract class LibraryItem extends LibraryFund {
    private String title;

    public LibraryItem(String inventoryNumber, String title) {
        super(inventoryNumber);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getDetails();
}
