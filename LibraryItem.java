public class LibraryItem {

    private String titles, authors;
    private int bookTotal;

    public LibraryItem(String titles, String authors, int bookTotal) {
        this.titles = titles;
        this.authors = authors;
        this.bookTotal = bookTotal;

    }

    // getters
    public String getTitles() {
        return titles;
    }

    public String getAuthors() {
        return authors;
    }

    public int getBookTotal() {
        return bookTotal;
    }

    // setters
    public void setTitle(String titles) {
        this.titles = titles;
    }

    public void setAuthor(String authors) {
        this.authors = authors;
    }

    public void setCopies(int bookTotal) {
        this.bookTotal = bookTotal;
    }

}