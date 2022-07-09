package SkyProJavaCourse1Lesson9;

public class Book {
     String bookName;
     Author autor;
     int yearOfPublication;

    public Book (String bookName, Author autor, int yearOfPublication) {

        this.bookName = bookName;
        this.autor = autor;
        this.yearOfPublication = yearOfPublication;
    }
    Author authorTolstoy = Author.createAutor(" Лев " ," Толстой");
    Author authorPyshkin = Author.createAutor("Александр", "Пушкин");

    public String getBookName(){
        return this.bookName;
    }
    public Author AuthorTolstoy(){
        return  this.AuthorTolstoy();

    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString(){
        return "Книга : " + this.bookName+ "; " + "Автор : " + this.autor + "; "
                + "Год издания : " + this.yearOfPublication + ".";
    }
}
