public class ReferenceBook extends Book{

    private String subject;
    
    public ReferenceBook(String titles, String authors, int bookTotal, String genre, int pages, String subject){
        super(titles, authors, pages, bookTotal, genre);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
}