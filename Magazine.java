public class Magazine extends Periodical{

    private boolean images;

    public Magazine(String titles, String authors, int releaseDate, int bookTotal, boolean images){
        super(titles, authors, bookTotal, releaseDate);
        this.images = images;
    }
    public boolean getImages(){
        return images;
    }
    public void setImages(boolean images){
        this.images = images;
    }
}