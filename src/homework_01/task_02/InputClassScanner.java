package homework_01.task_02;

import java.util.Scanner;

public class InputClassScanner {

    private double side1;
    private double side2;

    public void setInputClass(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину ");
        double a = input.nextDouble();
        this.side1 = a;
        System.out.println("Введите ширину ");
        double b = input.nextDouble();
        this.side2 = b;
    }

    public double[] getInputClass(){
        double[] parameterArrayInput = {side1, side2};
        return parameterArrayInput;
    }
}
