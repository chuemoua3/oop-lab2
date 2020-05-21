
public class Book extends LibraryItem {
    private int pages;
    private String genre;

    public Book(String titles, Authors authors, int pages, int bookTotal, String genre) {
        super(titles, authors, bookTotal);
        this.pages = pages;
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

}