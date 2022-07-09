package SkyProJavaCourse1Lesson9;

public class HWLesson9 {
    public static void main(String[] args) {

        Book warAndPeaceTolstoy = new Book(" Война и Мир ",
                Author.createAutor("Лев","Толстой "),2015);
        System.out.println(" Название книги : " + warAndPeaceTolstoy.bookName + "; ");
        System.out.println(" Автор книги : "  + Author.createAutor("Лев ","Толстой ") + "; ");
        System.out.println(" Год публикации : " + warAndPeaceTolstoy.yearOfPublication + "; ");

        System.out.println();

       Book skazkiPyshkin = new Book("Сказки ",
                    Author.createAutor("Александр " , "Пушкин"), 2011);
        System.out.println(" Название книги : " + skazkiPyshkin.bookName + "; ");
        System.out.println(" Автор книги : " + skazkiPyshkin.autor + "; ");
        System.out.println(" Год публикации : " + skazkiPyshkin.yearOfPublication + "; ");

        skazkiPyshkin.setYearOfPublication(2015);
        System.out.println(" Исправление даты публикации : " + skazkiPyshkin.getYearOfPublication());

    }

}