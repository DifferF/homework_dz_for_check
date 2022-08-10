package homework_01.task_02;

        /*
        Задание 2 +
        Используя IDEA, создайте проект c пакетом.
        Требуется: Создать класс с именем Rectangle.
        В теле класса создать два поля, описывающие длины сторон double side1, double side2.
        Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
        и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
        Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
         */

public class Rectangle {  // Требуется: Создать класс с именем Rectangle.

     private double side1; // В теле класса создать два поля,
     private double side2;

    public Rectangle(double input_01, double input_02) { // Конструктор .....
        this.side1 = input_01;
        this.side2 = input_02;
    }

    //_________________________________________________Вар_1
    public void start(){
        areaCalculator(side1,side2);
        perimeterCalculator(side1,side2);
    }
    private double areaCalculator (double side1, double side2){
        double s = side1 * side2;
        System.out.println("Площадь = " + s);
        return s;
    }
    private double perimeterCalculator (double side1, double side2){
        double p = 2 * (side1 + side2);
        System.out.println("Периметр = " + p);
        return p;
    }

    //_________________________________________________Вар_2
    public double areaCalculator() {    //метод, вычисляющие площадь прямоугольника
        double s = side1 * side2;
        return s;}

    public void perimeterCalculator(){   // периметр прямоугольника
        double p = 2 * (side1 + side2);
        System.out.println("Периметр = " + p);
    }

    public static void main(String[] args) {
        double a = 25.7; // параметры прямоугольника
        double b = 25.7;  // параметры прямоугольника

        //_________________________________________________inputScanner
        InputClassScanner inputScanner = new InputClassScanner();
        inputScanner.setInputClass();
        double[] parameterArray = inputScanner.getInputClass();

        Rectangle rectangleNew = new Rectangle(parameterArray[0],parameterArray[1]);
        // Rectangle rectangleNew = new Rectangle(a, b);
        //_________________________________________________Вар_1
        rectangleNew.start();

        //_________________________________________________Вар_2
        System.out.println("\nПлощадь = " + rectangleNew.areaCalculator()); // обращаемся к методу и выводим
        rectangleNew.perimeterCalculator();

    }
}
