package SkyProJavaCourse1Lesson9;

public class Author {

    private String firstNameAutor;
    private String surnameAutor;

    public static Author createAutor(String firstNameAutor,String surnameAutor) {
        Author author = new Author();
        author.firstNameAutor = firstNameAutor;
        author.surnameAutor = surnameAutor;
        return author;
    }
    public String toString(){
        return "" + this.firstNameAutor + "" + this.surnameAutor;
    }
}