package OOP.Book;

public class Author {
    private String name;
    private String sex;
    private String email;
    Author(String n, String s, String e){
        this.name = n;
        this.sex = s;
        this.email = e;
    }
    public String setName(String n){
        return this.name = n;
    }
    public String setSex(String s){
        return this.sex = s;
    }
    public String setEmail(String e){
        return this.email = e;
    }
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public String getEmail(){
        return this.email;
    }
    public String toString(){
        return name+" "+sex+" "+email;
    }
}