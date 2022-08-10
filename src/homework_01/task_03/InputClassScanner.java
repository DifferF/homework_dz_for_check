package homework_01.task_03;

import java.util.Scanner;

public class InputClassScanner {

    private String side1; // Author
    private String side2; // Title
    private String side3; // Content

    public void setInputClass(){
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите автора: ");
        String a = input.nextLine();
        this.side1 = a;
        System.out.println("Укажите название книги: ");
        String b = input.nextLine();
        this.side2 = b;
        System.out.println("Содержание книги: ");
        String с = input.nextLine();
        this.side3 = с;
    }

    public String[] getInputClass(){
        String[] parameterArrayInput = {side1, side2, side3};
        return parameterArrayInput;
    }
}
