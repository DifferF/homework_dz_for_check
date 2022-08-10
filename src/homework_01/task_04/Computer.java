package homework_01.task_04;

    /*
    Задание 4
    Используя IDEA, создайте проект с пакетом.
    Создать класс Computer, создать массив объектов Computers размером 5.
    Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop).
     */

public class Computer {

    private String[] computerArr = new String[5];

    private String[] computerArrqq = new String[5];
    private String values02 = "values01";

    public Computer() {               //  String name Конструктор с циклом (используя loop) Заполнит массив
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    this.computerArr[i] = "seasons1[0]";
                    break;
                case 1:
                    this.computerArr[i] = "seasons1[1]";
                    break;
                case 2:
                    this.computerArr[i] = "seasons1[2]";
                    break;
                case 3:
                    this.computerArr[i] = "seasons1[3]";
                    break;
                case 4:
                    this.computerArr[i] = "seasons1[4]";
                    break;
            }
        }
    }

    public void setComputer01(){
        this.computerArr[0] ="setComputer01_[0]";
        this.computerArr[1] ="setComputer01_[1]";
        this.computerArr[2] ="setComputer01_[2]";
        this.computerArr[3] ="setComputer01_[3]";
        this.computerArr[4] ="setComputer01_[4]";
    }

    public void setComputer02(){
        for (int i = 0; i < 5; i++) {
            this.computerArr[i] = "setComputer02_values0" + i;
        }
    }

    public void setComputer03(String[] a){
        // System.out.println("Вариант setComputer03");
        for (int i = 0; i < 5; i++) {
            this.computerArr[i] = a[i];
        }
    }

    public void setComputer04(String[] a){
        System.out.println("Вариант setComputer04");
        this.computerArr = a;
    }

        public void getComputerTest() {                               // выводим записанные значения computerArr
                System.out.println("Выводим массив computerArr");
            for (int i = 0; i < 5; i++) {
                System.out.println(computerArr[i]);
            }
        }

        public static void main (String[]args){

            String a = "qwerty";
            String b = "qwerty";
            String c = "qwerty";
            String v = "qwerty";
            String f = "qwerty";

            Computer computerObject = new Computer();
             //    computerObject.setComputer01();
            //   computerObject.setComputer02();
            String[] list = {"1","2","3","4","5"};
          //  computerObject.setComputer03(list);
            computerObject.setComputer04(list);
            computerObject.getComputerTest();
        }

    }

