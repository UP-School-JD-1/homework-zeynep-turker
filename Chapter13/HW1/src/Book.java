public class Book {
    Author author;
    String title;
    int page;
    BookType type;
    boolean isHardCover;
    int currentPage;

    public Book(Author author, String title, int page, BookType type, boolean isHardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
        System.out.println("Book is created.");
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type.getDescription();
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void getInfo() {
        System.out.println("Book Information : author=" + author.name + ", title=" + title + ", page=" + page + ", type=" + type.getDescription() + ", isHardCover=" + isHardCover + ", currentPage=" + currentPage);
    }
}