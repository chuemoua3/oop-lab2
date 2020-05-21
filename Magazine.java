public class Magazine extends Periodical implements Reserve{

    private boolean images;

    public Magazine(String titles, Authors authors, int releaseDate, int bookTotal, boolean images){
        super(titles, authors, bookTotal, releaseDate);
        this.images = images;
    }
    public boolean getImages(){
        return images;
    }
    public void setImages(boolean images){
        this.images = images;
    }

    public boolean isReserve(){
        return true;
    }

    public double reserveTime(){
        return 2.00;
    }

}