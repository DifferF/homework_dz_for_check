package homework_01.task_03;

        /*
        Задание 3 +
        Используя IDEA, создайте проект c пакетом.
        Требуется: Создать класс Book(Main).
        Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void show ().
        Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
        Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
         */

public class BookMain {

    public static void main(String[] args) {

        InputClassScanner inputScan = new InputClassScanner();
        inputScan.setInputClass();
        String[] getInputArr = inputScan.getInputClass();

        Author authorObject = new Author();
        authorObject.authorStr = getInputArr[0]; // доступ к public полю + значение input массива
        authorObject.show();

        Title titleObject = new Title();
        titleObject.titleStr = getInputArr[1];  // доступ к public полю + значение input массива
        titleObject.show();

        Content contentObject = new Content();
        contentObject.contentStr = getInputArr[2];  // доступ к public полю + значение input массива
        contentObject.show();
    }
}
