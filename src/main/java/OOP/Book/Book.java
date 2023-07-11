package OOP.Book;

public class Book {
    private Author author;
    private Integer year;
    Book(Author a, Integer y){
        this.author = a;
        this.year = y;
    }
    public Author setAuthor(Author a){
        return this.author = a;
    }
    public Integer setYear(Integer y){
        return this.year = y;
    }
    public Author getAuthor(){
        return this.author;
    }
    public Integer getYear(){
        return this.year;
    }
    public String toString(){
        return this.author.getName()+" "+this.year;
    }
}