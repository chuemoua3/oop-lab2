public class NewsPaper extends Periodical implements Reserve{
    
    public NewsPaper(String titles, Authors authors, int bookTotal, int releaseDate) {
        super(titles, authors, bookTotal, releaseDate);
        // TODO Auto-generated constructor stub
    }

    public boolean isReserve(){
        return true;
    }

    public double reserveTime(){
        return 1.00;
    }

}