public class LibraryMain {
    public static void main(String[] args){
        // String titles, String authors, int bookTotal, String genre, int pages
        // GeneralBook book1 = new GeneralBook("Harry Potter", "J.K. Rowling", 10, "Fantasy Fiction", 1250);
        // NewsPaper n1 = new NewsPaper("Charlotte Observer", "Random Author", 10, 2020);
        // Magazine m1 = new Magazine("Sports Illustrated", "authors", 2020, 1000, true);
        // CardHolder card1 = new CardHolder("Chue", 28, false, true, false);

        // System.out.println(book1.getAuthors());
        // System.out.println(n1.getTitles());
        // System.out.println(m1.getReleaseDate());
        // System.out.println(card1.getOverDue());
        // System.out.println(card1.getName());

        CardHolder ch = new CardHolder("Chue", 28, true, true);

        PublishingCompany p1 = new PublishingCompany("Stories and Life", 1000, 2500);
        Authors a1 = new Authors("William Shakespeare", p1);

        System.out.println(ch.getName());
        System.out.println(ch.getCheckOut());
        System.out.println(a1.getName());
        System.out.println(p1.getNumEmp());

        

        
    }

}

 