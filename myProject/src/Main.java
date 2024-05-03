import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberone;
        String numbertwo;
        int intNumberone;
        int intNumbertwo;
        String typeOperations;
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое число: ");
            numberone = scanner.nextLine();
            System.out.println("Введите тип операции: ");
            typeOperations = scanner.nextLine();
            if (typeOperations.equals("*")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Произведение чисел равняется: " + mathOperations.multiplicationMethod(intNumberone, intNumbertwo));
            } else if (typeOperations.equals("+")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Сумма чисел равна: " + mathOperations.sumMethod(intNumberone, intNumbertwo));
            } else if (typeOperations.equals(":")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Результат деления равен: " + mathOperations.divisionMethod(intNumberone, intNumbertwo));
            } else if (typeOperations.equals("-")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Результат вычитания равен: " + mathOperations.substractionMethod(intNumberone, intNumbertwo));
            } else {
                System.out.println("Ошибка");
            }
            scanner.close();
            break;
        }
    }
}

//Хотел написать проще, пробовал такой вариант кода, но работает некорректно, не могу ввести тип операции,
// почему-то программа сразу же переходит к следующему шагу, не дожидаясь, пока я введу String
// т.е как-то неправильно почему-то работает scanner.nextLine. В этом и есть сложность, загвоздка задания?
//Скриншот - https://skr.sh/sPYdhT1Go9M

        /*int numberone;
        int numbertwo;
        String typeOperations;
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Введите первое число: ");
        numberone = scanner.nextInt();
        System.out.println("Введите тип операции: ");
        typeOperations = scanner.nextLine();
        System.out.println("Введите второе число: ");
        numbertwo = scanner.nextInt();
            if (typeOperations.equals("*"){
                System.out.println(mathOperations.multiplicationMethod(numberone, numbertwo));
                }
                else{
                System.out.println("Ошибка!");
                }*/