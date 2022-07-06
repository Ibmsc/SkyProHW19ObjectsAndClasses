package SkyProJavaCourse1Lesson9;

public class Book {
     String bookName;
     String autor;
     int yearOfPublication;

    public Book(String bookName, String Autor, int yearOfPublication) {
        this.bookName = bookName;
        this.autor = Autor;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookName(){
        return this.bookName;
    }

    public String getAutor(){
        return this.autor;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
