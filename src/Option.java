public abstract class Option {
    private String title;
    public String getTitle() {
        return title;
    }

    private String description;
    public String getDesc() {
        return description;
    }

    public abstract void interact();
}
