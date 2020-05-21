public class Periodical extends LibraryItem{
    
    private int releaseDate;

    public Periodical(String titles, Authors authors, int bookTotal, int releaseDate){
        super(titles, authors, bookTotal);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }
}