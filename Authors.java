public class Authors {
    private String name;
    private PublishingCompany publisher;


    public Authors(String name, PublishingCompany publisher){
        this.name = name;
        this.publisher = publisher;
    }

    public String getName(){
        return name;
    }

    public PublishingCompany getPublisher(){
        return publisher;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPublisher(PublishingCompany publisher){
        this.publisher = publisher;
    }



}