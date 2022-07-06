package SkyProJavaCourse1Lesson9;

public class Author {
    Author author = Author.createAutor(" Лев " ," Толстой");
    private String firstNameAutor;
    private String surnameAutor;

    public static Author createAutor(String firstNameAutor,String surnameAutor) {
        Author author = new Author();
        author.firstNameAutor = firstNameAutor;
        author.surnameAutor = surnameAutor;
        return author;
    }

        public String getFirstNameAutor() {
        return this.firstNameAutor;
    }
    public String getSurnameAutor() {
                return this.surnameAutor;
            }

}