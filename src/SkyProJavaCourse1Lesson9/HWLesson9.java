package SkyProJavaCourse1Lesson9;

public class HWLesson9 {
    public static void main(String[] args) {

        Book book = new Book(" Война и Мир ", " Л. Толстой ", 2015);
        System.out.println(" Название книги : " + book.bookName + "; ");
        System.out.println(" Автор книги : " + book.autor + "; ");
        System.out.println(" Год публикации : " + book.yearOfPublication + "; ");

        System.out.println();

        Book book1 = new Book("Сказки ","А. Пушкин", 2011);
        System.out.println(" Название книги : " + book1.bookName + "; ");
        System.out.println(" Автор книги : " + book1.autor + "; ");
        System.out.println(" Год публикации : " + book1.yearOfPublication + "; ");

        book1.setYearOfPublication(2015);
        System.out.println(" Исправление даты публикации : " + book1.getYearOfPublication());

    }

}