package classAndObject;

import java.util.Date;
import java.util.Set;

public class Book {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private Date publishedDate;
    private Set<String> authors;

    public void setBook(Integer id, String uuid, String title, String description, Date publishedDate, Set<String> authors) {
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

//    public void displayBook() {
//        System.out.println("Book ID: " + id);
//        System.out.println("Book UUID: " + uuid);
//        System.out.println("Book Title: " + title);
//        System.out.println("Book Description: " + description);
//        System.out.println("Book Published Date: " + publishedDate);
//        System.out.println("Book Authors: " + authors);
//    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                "\n, uuid='" + uuid + '\'' +
                "\n, title='" + title + '\'' +
                "\n, description='" + description + '\'' +
                "\n, publishedDate=" + publishedDate +
                "\n, authors=" + authors +
                '}';
    }
}
