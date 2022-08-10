package homework_01.task_04;

    /*
    Задание 4 +
    Используя IDEA, создайте проект с пакетом.
    Создать класс Computer, создать массив объектов Computers размером 5.
    Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop).
     */


public class ComputerOne {

    private String nameStr;

    public ComputerOne(String nameStrIn) {
        this.nameStr = nameStrIn;
    }

    public static void main(String[] args) {

        ComputerOne[] computerOnes = new ComputerOne[5];

        for (int i = 0; i < computerOnes.length; i++) {
            computerOnes[i] = new ComputerOne("ComputerOne_" + (i + 1));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(computerOnes[i].nameStr);
        }

        String[] arrayStringTwo = {"\nПроцессор","Материнская плата","Видеокарта","Оперативная память","Блоки питания"};

        for (int i = 0; i < computerOnes.length; i++) {
            computerOnes[i] = new ComputerOne(arrayStringTwo[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(computerOnes[i].nameStr);
        }
    }
}