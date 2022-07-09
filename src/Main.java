import SkyProJavaCourse1Lesson9.Author;
import SkyProJavaCourse1Lesson9.Book;
import SkyProJavaCourse1Lesson9.HWLesson9;

public class Main {
    public static void main(String[] args) {

        System.out.println("Автор книги :" + Author.createAutor("Лев ","Толстой "));
        Book warAndPeaceTolstoy = new Book("Война и мир ",
                Author.createAutor("Лев ", "Толстой "), 2015);
        System.out.println(warAndPeaceTolstoy);

        System.out.println();
        System.out.println("Автор книги :" + Author.createAutor("Александр ","Пушкин "));
        Book skazkiPyshkin = new Book("Сказки ",
                Author.createAutor("Александр " , "Пушкин"), 2011);
        System.out.println(skazkiPyshkin);



    }
}