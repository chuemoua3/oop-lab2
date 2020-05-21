public class LibraryItem {

    private String titles;
    private Authors authors;
    private int bookTotal;

    public LibraryItem(String titles, Authors authors, int bookTotal) {
        this.titles = titles;
        this.authors = authors;
        this.bookTotal = bookTotal;

    }

    // getters
    public String getTitles() {
        return titles;
    }

    public Authors getAuthors() {
        return authors;
    }

    public int getBookTotal() {
        return bookTotal;
    }

    // setters
    public void setTitle(String titles) {
        this.titles = titles;
    }

    public void setAuthor(Authors authors) {
        this.authors = authors;
    }

    public void setCopies(int bookTotal) {
        this.bookTotal = bookTotal;
    }

}